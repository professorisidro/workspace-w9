package br.com.meli.security_demo.security;

import java.security.Key;
import java.util.Collections;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.meli.security_demo.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;

public class TokenUtil {
	
	public static final String EMISSOR = "MELIBOOTCAMP";
	public static final long   EXPIRATION = 5*24*60*60*1000;
	public static final String SECRET_KEY = "M3L!B00tC2mpS3cr3tK3yF0r@allUs3rs0f@uthSyst3m";
	
	public static MyToken encode(User user){
		try {
			Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
			String jwtToken = Jwts.builder()
								  .subject(user.getLogin())
								  .issuer(EMISSOR)
								  .claim("Nome", user.getName())
								  .claim("ROLE", "ROLE_"+user.getRole())
								  .expiration(new Date(System.currentTimeMillis() + EXPIRATION))
								  .signWith(key)
								  .compact();
			return new MyToken(jwtToken);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static Authentication decode(HttpServletRequest request) {
		try {
			String tokenHeader = request.getHeader("Authorization");
			if (tokenHeader != null) {
				String token = tokenHeader.replace("Bearer ", "");
				SecretKey secretKey = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
				JwtParser parser = Jwts.parser().verifyWith(secretKey).build();
				Claims claims = (Claims)parser.parse(token).getPayload();
				String emissor = claims.getIssuer();
				String subject = claims.getSubject();
				String role = claims.get("ROLE").toString();
				Date expiration = claims.getExpiration();
				
				// vou ver se é valido
				if (emissor.equals(EMISSOR) && subject != null && 
				    subject.length() > 0 && expiration.after(new Date(System.currentTimeMillis()))) {
					System.out.println("Token Valido!");
					UsernamePasswordAuthenticationToken usernameToken = 
							new UsernamePasswordAuthenticationToken(subject, null, Collections.singletonList(new SimpleGrantedAuthority(role)));
					return usernameToken;
				} 
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}

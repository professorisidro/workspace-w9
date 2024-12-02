package br.com.meli.security_demo.security;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration						// é uma classe de configuração
@EnableWebSecurity					// habilita a configuração de segurança
public class SecurityConfig {
	
	@Bean	// este método retorna um objeto que será gerenciado pelo Spring
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.csrf( (csrf) -> csrf.disable())
			.authorizeHttpRequests( (auth) -> {
				// nesta configuração eu vou obritatoriamente falar o que é bloqueado e o que é liberado
				
				auth.requestMatchers(new AntPathRequestMatcher("/hello", "GET")).permitAll()
					.requestMatchers(new AntPathRequestMatcher("/users", "POST")).permitAll()
					.requestMatchers(new AntPathRequestMatcher("/login", "POST")).permitAll()
					.requestMatchers(new AntPathRequestMatcher("/seller", "GET")).hasRole("SELLER")
					.requestMatchers(new AntPathRequestMatcher("/buyer", "GET")).hasRole("BUYER")
					.requestMatchers(new AntPathRequestMatcher("/rep", "GET")).hasRole("REPRESENTANT")
					.requestMatchers(PathRequest.toH2Console()).permitAll()
				    .anyRequest().authenticated();
				    
			})
			.addFilterBefore(new MySecurityFilter(), UsernamePasswordAuthenticationFilter.class)
			.headers( (header) -> {
				header.frameOptions( (iframe) -> iframe.disable());
			});
			
		
		
		return http.build();
			
		
	}
}

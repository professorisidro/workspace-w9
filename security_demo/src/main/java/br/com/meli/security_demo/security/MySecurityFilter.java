package br.com.meli.security_demo.security;

import java.io.IOException;
import java.util.Collections;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MySecurityFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Requisicao "+request.getRequestURL()+ " passou pelo filtro");
		
		// a idéia aqui é verificar se tem algum cabecalho de autorização na requisição (meu cracha)
		if (request.getHeader("Authorization") != null) {			
			Authentication auth = TokenUtil.decode(request);
			if (auth != null) {
				SecurityContextHolder.getContext().setAuthentication(auth);
			}			
		}
		filterChain.doFilter(request, response);
	}

}

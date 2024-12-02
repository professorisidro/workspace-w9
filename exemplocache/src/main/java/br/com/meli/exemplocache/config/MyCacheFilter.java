package br.com.meli.exemplocache.config;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.exemplocache.caching.CacheService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MyCacheFilter extends OncePerRequestFilter {

//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		/* faco uma logica qualquer */		
//		HttpServletRequest httpRequest = (HttpServletRequest)request;						
//		if (httpRequest.getMethod().equals("GET")) {
//			String uriKey = httpRequest.getRequestURI();
//			if (CacheService.cache.get(uriKey) != null) {
//				System.out.println("Usando Cache");
//			}
//		}
//		
//		/* encaminhar a resposta pra frente */
//		chain.doFilter(request, response);
//		
//		if (httpRequest.getMethod().equals("GET")) {
//			String uriKey = httpRequest.getRequestURI();
//			if (CacheService.cache.get(uriKey) == null) {
//				HttpServletResponse httpResponse = (HttpServletResponse)response;
//				HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper(httpResponse);
//
//
//			}
//		}
//		
//		
//	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		if (request.getMethod().equals("GET")) {
			Object resp = CacheService.cache.get(request.getRequestURI());
			if (resp != null) {
				System.out.println("Buscando no cache");
				response.setStatus(200);
				response.setContentType("application/json");
				ObjectMapper mapper = new ObjectMapper();
				String json = mapper.writeValueAsString(resp);
				System.out.println("DEBUG = "+json);
				response.getWriter().print(json);
				return;
			}
		}
		
		filterChain.doFilter(request, response);
	}

}

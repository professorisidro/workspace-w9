package br.com.meli.hospital.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configuration
public class ElasticConfiguration extends ElasticsearchConfiguration{
	
	@Value("${elastic.host}")
	private String host;
	
	@Value("${elastic.ssl_certificate}")
	private String sslCertificate;
	
	@Value("${elastic.username}")
	private String username;
	
	@Value("${elastic.password}")
	private String password;

	@Override
	public ClientConfiguration clientConfiguration() {
		// TODO Auto-generated method stub
		
		System.out.println(host);
		System.out.println(sslCertificate);
		System.out.println(username);
		System.out.println(password);
		return ClientConfiguration.builder()
				.connectedTo(host)
				.usingSsl(sslCertificate)
				.withBasicAuth(username, password)
				.build();
	}

}

package com.fse.outreach.fms.microservice.netflixzuulgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZuulGatewayServerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulGatewayServerApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(NetflixZuulGatewayServerApplication.class);
    }
	
	 @Bean
	    public PreFilter preFilter() {
	        return new PreFilter();
	    }

}

package com.oks.web.app.all.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class WebAppAllBeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WebAppAllBeApplication.class, args);
	}
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder 
	   application) {
	      return application.sources(WebAppAllBeApplication.class);
	   }
}

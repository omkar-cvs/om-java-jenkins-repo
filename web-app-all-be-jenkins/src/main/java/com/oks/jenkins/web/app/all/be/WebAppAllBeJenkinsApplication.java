package com.oks.jenkins.web.app.all.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class WebAppAllBeJenkinsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WebAppAllBeJenkinsApplication.class, args);
	}
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder 
	   application) {
	      return application.sources(WebAppAllBeJenkinsApplication.class);
	   }
}

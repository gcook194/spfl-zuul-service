package com.gavincook.spfl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpflZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpflZuulProxyApplication.class, args);
	}

}

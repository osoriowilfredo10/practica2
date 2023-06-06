package com.certus.practica2;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class ConfigItems extends ResourceConfig {
	
	public ConfigItems () {
		packages("com.certus.item");
		
	}
	
}


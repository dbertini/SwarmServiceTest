package it.db.swarmservice.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		register(HelloWorldResource.class);
		register(HappyBirthdayService.class);
	}
}

package it.db.swarmservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hbd/")
public class HappyBirthdayService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("saluta/{nome}")
	public String getHello(@PathParam(value = "nome") String nome) {
		String hbd = "Buon compleanno " + nome + "!";
		return hbd;
	}
}

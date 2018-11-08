package it.db.swarmservice.rest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myservice/")
public class HelloWorldResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public HelloReturn getHello() {
		HelloReturn ret = new HelloReturn();
		ret.setData(new Date());
		ret.setMessaggio("Ottimo Messaggio!");
		ret.setIdMessaggio(BigDecimal.ONE);
		return ret;
	}

	class HelloReturn implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7727532050718294634L;
		private String messaggio;
		private Date data;
		private BigDecimal idMessaggio;
		
		public String getMessaggio() {
			return messaggio;
		}
		public void setMessaggio(String messaggio) {
			this.messaggio = messaggio;
		}
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		public BigDecimal getIdMessaggio() {
			return idMessaggio;
		}
		public void setIdMessaggio(BigDecimal idMessaggio) {
			this.idMessaggio = idMessaggio;
		}
		
		
	}
	
	
}
package impriment.service.cart;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/imprition")
public class ServiceImprition {
	

	@POST
	@Path("/imprimcarte")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public String imprition(Demande d){
		Imprition i = new Imprition();
		return i.impritions(d);
	}

}

package org.ici.webservices;

import org.apache.log4j.Logger;
import org.ici.dtos.LocationDTO;
import org.ici.facades.LocationFacade;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import java.util.List;

/**
 * @author RobinsoB
 * @version 1.0 2011-12-14
 */
@Path("location")
public class LocationService {

	@Context
	UriInfo uriInfo;

	@Context
	Request request;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	public LocationService() {
	}
	
	@Path("/")
	@GET
	@Consumes("application/x-www-form-urlencoded")
	@Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON } )
	public List<LocationDTO> getAll(){
		
		LocationFacade facade = new LocationFacade();
		
		List<LocationDTO> locList = (List<LocationDTO>)facade.getAll();
		
		return locList;
	}
	
}
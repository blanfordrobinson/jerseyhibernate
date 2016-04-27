package org.ici.webservices;

import org.apache.log4j.Logger;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

//import se.dtos.SiteDTO;
//import se.facades.SiteFacade;


/**
 * @author RobinsoB
 * @version 1.0 2011-12-14
 */
@Path("user")
public class UserService {

	@Context
	UriInfo uriInfo;

	@Context
	Request request;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	
	public UserService() {
	}
	
}
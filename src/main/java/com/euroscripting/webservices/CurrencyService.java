package com.euroscripting.webservices;

import com.euroscripting.dtos.CurrencyDTO;
import com.euroscripting.facades.CurrencyFacade;
import org.apache.log4j.Logger;

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
@Path("currency")
public class CurrencyService {

	@Context
	UriInfo uriInfo;

	@Context
	Request request;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	public CurrencyService() {
	}
	
	@Path("/")
	@GET
	@Consumes("application/x-www-form-urlencoded")
	@Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON } )
	public List<CurrencyDTO> getAll(){
		
		CurrencyFacade facade = new CurrencyFacade();
		
		List<CurrencyDTO> curList = (List<CurrencyDTO>)facade.getAll();
		
		return curList;
	}
	
}
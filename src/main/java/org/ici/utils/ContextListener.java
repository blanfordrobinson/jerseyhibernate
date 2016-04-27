package org.ici.utils;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * This class is called when the webapp starts/stops 
 *
 * @author Khary Mendez
 *
 */
public class ContextListener implements ServletContextListener {

	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void contextInitialized(ServletContextEvent ctx) {
		log.info("SERVICEx Backend Service Initializing");
		
		// Creation of the entity manager factory is intensive so instantiate it
		// at service startup.
		JPAUtil.getEntityManagerFactory();
	}

	@Override
	public void contextDestroyed(ServletContextEvent ctx) {
		log.info("SERVICEx Backend Service Shutting Down");
		JPAUtil.getEntityManagerFactory().close();
		
	}
	
}

package org.ici.utils;

import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Map;
import java.util.logging.Level;

/** A collection of common utilities for managing JPA.
 * 
 * @author RobinsoB
 *
 */
public class JPAUtil {
	
	
	private static final EntityManagerFactory emf; 
	private static final ThreadLocal<EntityManager> threadLocal;
	private static Logger logger;
		
	public static String ProviderName = null;
		
	static {
		String PU_Name = "default";
		emf = Persistence.createEntityManagerFactory(PU_Name); 		

		Map<String, Object> m = emf.getProperties();
		ProviderName = (String)m.get("ProviderName");
	
		threadLocal = new ThreadLocal<EntityManager>();
		logger = Logger.getLogger(PU_Name);
	}

	/**
	 * @return 		The entity manager factory.
	 */
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}	
	
	/**
	 * @return		The entity manager.
	 */
	public static EntityManager getEntityManager() {
		EntityManager manager = threadLocal.get();		
		if (manager == null || !manager.isOpen()) {
			manager = emf.createEntityManager();
			threadLocal.set(manager);
		}
		return manager;
	}
	
	/** Close the entity manager once complete.
	 * 
	 */
	public static void closeEntityManager() {
        EntityManager em = threadLocal.get();
        threadLocal.set(null);
        if (em != null) em.close();
    }
    
    /** Good for update, insert and delete.
     * 
     */
    public static void beginTransaction() {
    	getEntityManager().getTransaction().begin();
    }
    
    /** Commit multi part transactions.
     * 
     */
    public static void commit() {
    	getEntityManager().getTransaction().commit();
    }  
    
    /** Retract uncommitted transactions.
     * 
     */
    public static void rollback() {
    	getEntityManager().getTransaction().rollback();
    } 
    
    /** JPQL in the house!
     * 
     * @param query
     * @return
     */
    public static Query createQuery(String query) {
		return getEntityManager().createQuery(query);
	}
	
	/**
	 * @param info
	 * @param level
	 * @param ex
	 */
	public static void log(String info, Level level, Throwable ex) {
		if(level == Level.SEVERE) {
			logger.error(info, ex);	
		}
		else if (level == Level.WARNING) {
			logger.warn(info, ex);
		}
		else if (level == Level.INFO) {
			logger.info(info , ex);
		}
		else {
			logger.debug(info, ex);
		}
    }    
}

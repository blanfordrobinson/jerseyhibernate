package org.ici.daos;

import org.ici.utils.JPAUtil;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Level;

/**
* @author RobinsoB
*
* @param <T>                  The entity type
*/
public abstract class GenericDAO <T> {

       private Class<T> persistentClass;

       /**
        * Default constructor
        */
       @SuppressWarnings("unchecked")
       public GenericDAO() {
           this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                   .getGenericSuperclass()).getActualTypeArguments()[0];
       }

       /** Return the persistentClass set in the constructor.
        *
        * @return			type Class<T>
        */
       public Class<T> getPersistentClass() {
           return persistentClass;
       }

       /** Use this to find Entity instances by primary key.
        *  Site.class, siCode
        *
        * @param c
        * @param primaryKey
        * @return					peristent classw
        */
       public T findByPrimaryKey(Class<T> c, Object primaryKey) {
           JPAUtil.log("finding JPA Entity instance with Primary Key: " + primaryKey, Level.INFO, null);

           try {
               T instance = (T)JPAUtil.getEntityManager().find(c, primaryKey);
               return instance;
           }
           catch (RuntimeException re) {
               JPAUtil.log("find failed", Level.SEVERE, re);
               throw re;
           }
       }

       /** Select all instances of the entity in question.
        *
        * @return				A list of entity types.
        */
       @SuppressWarnings("unchecked")
       public List<T> getAll(){
           return JPAUtil.getEntityManager().createQuery("Select t from " + persistentClass.getSimpleName() + " t ORDER BY 1").getResultList();
       }

       /** Get a count of all entity instances
        *
        * @return
        */
       public Long getAllCount(){
           return (Long)JPAUtil.getEntityManager().createQuery("SELECT COUNT(*) from " + persistentClass.getSimpleName() + " t").getSingleResult();
       }

       /** Merging, a good way to update entity instances.
        *
        * @param entity
        * @return
        */
       public T saveOrUpdate(T entity) {
           T newEntity = JPAUtil.getEntityManager().merge(entity);

           return newEntity;
       }

       /** Delete entity instances.
        *
        * @param entity
        */
       public void delete(T entity) {
           JPAUtil.getEntityManager().remove(entity);
       }

       /** Execute SQL instructions immediately, clear cache.
        *
        */
       public void flush() {
           JPAUtil.getEntityManager().flush();
       }

       /** Clear the persistence context,
        *  causing all managed entities to become detached.
        */
       public void clear() {
           JPAUtil.getEntityManager().clear();
       }

}
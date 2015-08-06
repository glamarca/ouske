package be.glamarca.mobileapps.ouske.model.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sarace on 6/08/15.
 */
public abstract class AbstractDao<T> {
    private static final Logger LOGGER = Logger.getLogger(AbstractDao.class.getName());

    private final Class<T> entityClass;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    //protected abstract EntityManager getEntityManager();

    public T find(Number id) {
        //return getEntityManager().find(entityClass, id);
        return null;
    }

    public T save(T entity) {
        //return getEntityManager().merge(entity);
        return null;
    }

    public void remove(Number id) {
        T entity = find(id);
        remove(entity);
    }

    public void remove(T entity) {
        //getEntityManager().remove(save(entity));
    }

    /**
     * Creates an instance of the entity class. The entity class must implement
     * a default constructor.
     */
    public T create() {
        T newInstance = null;

        return newInstance;
    }

    public Long getSequenceNextVal(String sequence) {
        return  null;
    }

    public String generateUniqueIdentifier() {
        return null;
    }
}

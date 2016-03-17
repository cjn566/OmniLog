package com.coltennye.omnilog;

import com.coltennye.omnilog.model.EventGroup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Colten on 3/12/2016.
 */
public class AppTest{
    private EntityManagerFactory emf;

    protected void setUp()  {
        emf = Persistence.createEntityManagerFactory("com.coltennye.omnilog.jpa");
    }

    protected void tearDown()  {
        emf.close();
    }

    public void tryPersist(){

        // create a couple of events...
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist( new EventGroup(2, "TestGroup"));
        entityManager.persist( new EventGroup(4, "Foursome"));
        entityManager.getTransaction().commit();
        entityManager.close();

        // now lets pull events from the database and list them
        entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        List<EventGroup> result = entityManager.createQuery( "from event_group", EventGroup.class ).getResultList();
        for ( EventGroup event : result ) {
            System.out.println( "Event Group ( user id = " + event.getUserId() + ") : " + event.getName() );
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}

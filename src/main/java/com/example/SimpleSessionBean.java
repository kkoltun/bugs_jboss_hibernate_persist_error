package com.example;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;;import java.util.concurrent.ThreadLocalRandom;

@Stateless
public class SimpleSessionBean {

    @PersistenceContext(unitName = "simple-pu")
    private EntityManager manager;

    public void save(String data) {
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.setData(data);
//        simpleObject.setObjid(ThreadLocalRandom.current().nextInt());

        manager.persist(simpleObject);
    }
}

package org.example;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PIETAS");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(new Mesa(40,"Mesa Top",2));
        em.getTransaction().commit();
        em.close();

    }
}
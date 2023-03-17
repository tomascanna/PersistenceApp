package main;

import entidades.Cliente;
import entidades.Domicilio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class PersistenceApp {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceAppPU");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            em.flush();

            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }

        em.close();
        emf.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author usuario
 */
public class Jpa {

    /**
     * @param args the command line arguments
     */
 public static EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaPU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*EntityManager manager = Cocoweb4.getEntityManager();
        System.out.println("EntityManager class ==> " + manager.getClass().getCanonicalName());*/

        Personas yo = new Personas(null,"pedro",25);
        Personas1 yo2= new Personas1(null, "Valdes", "Achirica");
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("JpaPU");
        EntityManager em = emf.createEntityManager();
        try {
        em.getTransaction().begin();
        em.persist(yo);
        em.persist(yo2);
        em.getTransaction().commit();
        } catch (Exception e) {

        e.printStackTrace();
        }finally {
        em.close();

        }
        
    }
    
}



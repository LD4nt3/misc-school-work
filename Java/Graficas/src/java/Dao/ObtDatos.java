/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.ObjTabla;
import Model.Valores;
import entidades.Encuesta;
import entidades.Preguntas;
import entidades.Respuestas;
import entidades.Tiporespuesta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Rembrandt
 */
public class ObtDatos {

    public void Prueba(String re, int e, Encuesta a) {
        int val = 0;
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("GraficasPU");
        EntityManager em = emf.createEntityManager();

        //select a from preguntas where fk=:id; list x 
        //a
        Query querx = em.createQuery("SELECT COUNT (a) FROM Preguntas a  WHERE a.fkEncuesta=:cx");
        querx.setParameter("cx", a);
        List<Object[]> results = querx.getResultList();
        for (Object[] result : results) {
            val = (int) result[0];
        }
        Valores[][] arreglo;
        arreglo = new Valores[val][];
        Query q = em.createQuery("select a from Preguntas a where a.fkEncuesta=:cx");
        q.setParameter("cx", a);
        List<Preguntas> respuesta = q.getResultList();

        int j = 0;
        int k = 0;
        for (Preguntas result : respuesta) {

         Query q2 = em.createQuery("select a from Respuestas a where a.fkPregunta=:cx");
        q2.setParameter("cx", result);
                List<Respuestas> res = q2.getResultList();

            for (Respuestas tado : res) {

                arreglo[j][k] = new Valores();
                arreglo[j][k].Res = tado.getRespuesta();
                k++;
            }
            
    Tiporespuesta tp=new Tiporespuesta();
        tp= result.getFkTiporespuesta();
                arreglo[j][k].Tip = tp.getNombre();//en j[ 0 . 0 , 1 . 0, 2 . 0 , 3 . 0 ] guardas tipo:tip y la pregunta:pre
            
            arreglo[j][k].Pre = result.getPregunta();

            j++;
        }
/*
        em.createQuery("SELECT COUNT(*) a FROM respuestas a WHERE a.fk_pregunta= \"4\" AND a.respuesta = \"Si\" ");

        Query query = em.createQuery("SELECT COUNT (a) FROM Respuestas a  WHERE a.fkPregunta=:cx  and a.respuesta = :con");
        query.setParameter("cx", a);

        query.setParameter("con", "No");
        Query quey = em.createQuery("SELECT COUNT (a) FROM Respuestas a  WHERE a.fkPregunta=:cx  and a.respuesta = :con");
        quey.setParameter("cx", a);
        quey.setParameter("con", "Si");

        List<Object[]> results = query.getResultList();
        for (Object[] result : results) {
        }
        /*    List <respuestas> lista = query.getResultList();
            
            int x = lista.size();
           
            if(x <= 0)
                return 0;
            else   
                return 1;
            

        }
         */

    }
}  

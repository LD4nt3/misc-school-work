/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import Modelo.MasValores;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entidades.Encuesta;
import entidades.Usuarios;
import entidades.Tiporespuesta;
import entidades.Preguntas;
import entidades.Opciones;
import entidades.Respuestas;
import modelo.login;
import modelo.Cuestonario;
import controlador.LoginController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import modelo.Encuesta_term;
import modelo.Tipo;
//import modelo.Valores;
/**
 *
 * @author DELL INSP15
 */
public class conexion {
    
    public void c_enc(Encuesta e, int id, String nombre, String contra, String clave){
        //String prueba="X";
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        Usuarios usa=new Usuarios(id, contra, nombre);
        
        em.getTransaction().begin();
        Encuesta en=new Encuesta();        
        en.setNoPreguntas(e.getNoPreguntas());
        en.setFkUsuario(usa);
        en.setEnlace(clave); 
        en.setNombre(e.getNombre());
        
        em.persist(en);
        em.getTransaction().commit();
    }
    
    public void c_us(Usuarios e){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit(); 
    }
    
      public MasValores  grafica(Encuesta a) {// public MasValores  grafica(Encuesta a) {
//      Delete conect =new Delete();
        //    conect.c_del(e);
       EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        int val = 0;
        Respuestas rr = new Respuestas();
        Preguntas pp = new Preguntas();
        Opciones oo = new Opciones();

        Query querx = em.createQuery("SELECT a FROM Preguntas a  WHERE a.fkEncuesta=:cx");
        querx.setParameter("cx", a);

        List<Preguntas> results = querx.getResultList();
        val = results.size();

        Valores[][] arreglo;
        arreglo = new Valores[val][];
        String[][] arra;
        arra = new String[val][5];
        // arreglo[0][0] = new Valores();

        Query q = em.createQuery("select a from Preguntas a where a.fkEncuesta=:cx");
        q.setParameter("cx", a);
        List<Preguntas> respuesta = q.getResultList();

        int j = 0;
        int k = 0;

        for (Preguntas result : respuesta) {
            Tiporespuesta tp = new Tiporespuesta();
            tp.setNombre(result.getFkTiporespuesta().getNombre());
            String xx = tp.getNombre();
            String yy = result.getPregunta();
            Query q2 = em.createQuery("select a from Respuestas a where a.fkPregunta=:cx");
            q2.setParameter("cx", result);
            List<Respuestas> res = q2.getResultList();
            
            Query q3 = em.createQuery("select a from Opciones a where a.fkPregunta=:cx");
            q3.setParameter("cx", result);
            
            List<Opciones> OP = q3.getResultList();
            for (Opciones ops : OP) {
                arra[j][0] = ops.getRespuesta1();
                arra[j][1] = ops.getRespuesta2();
                arra[j][2] = ops.getRespuesta3();
                arra[j][3] = ops.getRespuesta4();
                arra[j][4] = ops.getRespuesta5();
            }
//Posible problema de datos al guardar en "arreglo" o al recibir o al crear objeto(instancia). inica 
            for (Respuestas tado : res) {

                arreglo[j][k] = new Valores();
                arreglo[j][k].Res = tado.getRespuesta();
                if (k < 1) {
                   
                }
                k++;

            }
//Termina 
            k = 0;

 arreglo[j][k].Tip = xx;
                    arreglo[j][k].Pre = yy;
            //arreglo[0][0].Tip = x;//en j[ 0 . 0 , 1 . 0, 2 . 0 , 3 . 0 ] guardas tipo:tip y la pregunta:pre
            //  arreglo[0][0].Pre = x;
            j++;
        }

        //
       

        /*    Query quer= em.createQuery("SELECT p FROM Preguntas p WHERE p.fkEncuesta =  :x ");
            quer.setParameter("x",a);     
                                Employee employee = em.find(Employee.class, 1);
              
                    List<Preguntas> enca=quer.getResultList();
                        for(Preguntas res:enca)
                    {
                        pp=res;
                    } 
                        
             Query quer2= em.createQuery("SELECT e from opciones e where e.fk_pregunta= :id ");
            quer2.setParameter("id",pp.getIdPregunta());
            
                 List<Opciones> enca2=quer2.getResultList();
                        for(Opciones res2:enca2)
                    {
                        oo=res2;
                    } 
                        
            Query quer3= em.createQuery("SELECT e from respuestas e where e.fk_pregunta= :id ");
            quer3.setParameter("id",pp.getIdPregunta());
            
                 List<Respuestas> enca3=quer3.getResultList();
                        for(Respuestas res3:enca3)
                    {
                        rr=res3;
                    } uineudneudneudned /////////
      // em.getTransaction().begin();

        //Query queryy = em.createQuery("DELETE FROM Tiporespuesta WHERE idtipoResp = :n");
        //queryy.setParameter("n", 1).executeUpdate();
//        Query query = em.createQuery("DELETE FROM Respuestas WHERE fk_pregunta = :n");
//        query.setParameter("n", 1).executeUpdate();
//        Query query2 = em.createQuery("DELETE FROM Opciones  WHERE ID = :n");
//        query2.setParameter("n", oo.getIdOpciones()).executeUpdate();
//        Query query3 = em.createQuery("DELETE FROM Preguntas  WHERE ID = :n");
//        query3.setParameter("n", pp.getIdPregunta()).executeUpdate();
//        Query query4 = em.createQuery("DELETE FROM Encuesta  WHERE ID = :n");
//        query4.setParameter("n", a.getIdEncuesta()).executeUpdate();
      //  em.getTransaction().commit();
    MasValores  resultados= new MasValores();
    resultados.Op=arra;
        //resultados.Valores=arreglo;

           return resultados;

    }
    
    public void set_preg(String preg, String nombre, int ti){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        short i=2;
        Usuarios us=new Usuarios();
        us.setContraseña(login.contrasena);
        us.setUsuario(login.nombre);
        us.setIdUsuario(login.id);
        
        Encuesta en=new Encuesta();
        en.setEnlace(Encuesta_term.enlace);
        en.setNombre(Encuesta_term.nombre);
        en.setIdEncuesta(Encuesta_term.id);
        en.setNoPreguntas(Encuesta_term.preg);
        en.setFkUsuario(us);
        
        Tiporespuesta tipo =new Tiporespuesta();
        tipo.setIdtipoResp(Tipo.id);
        tipo.setNombre(Tipo.nombre);
        
        em.getTransaction().begin();
        Preguntas pregun=new Preguntas();
        pregun.setFkEncuesta(en);
        pregun.setFkTiporespuesta(tipo);
        pregun.setPregunta(preg);
        em.persist(pregun);
        em.getTransaction().commit();
        
    }
    
    public void respuesta_dentro(ArrayList<String> resp, Encuesta enc){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        List<Preguntas> preg=look_pregunta(enc);
        
        int t=resp.size();
        for(int i=0; i<t;i++){
           em.getTransaction().begin();
           
            Respuestas en=new Respuestas();        
            en.setFkPregunta(preg.get(i));
            en.setRespuesta(resp.get(i));
            
            em.persist(en);
            em.getTransaction().commit(); 
        }
    }
    
    public void smultiples(Preguntas resp, Opciones o){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Opciones op=new Opciones();
        /*op.setFkPregunta(resp);
        op.setRespuesta1(o.getRespuesta1());
        op.setRespuesta2(o.getRespuesta2());
        op.setRespuesta3(o.getRespuesta3());
        op.setRespuesta4(o.getRespuesta4());
        op.setRespuesta5(o.getRespuesta5());*/
        o.setFkPregunta(resp);
        em.persist(o);
        em.getTransaction().commit();
    }
    
    public List us_consulta(String nombre, String contra){
         EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        Query query =em.createQuery("SELECT u from Usuarios u where u.usuario= :name and u.contraseña= :con");
        query.setParameter("name", nombre);
        query.setParameter("con", contra);
        
        List user = query.getResultList();
        return user;
    }
    
    public List enc_nueva(String nombre, Usuarios u, short t){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        Query query= em.createQuery("SELECT e from Encuesta e where e.nombre= :nombre and e.fkUsuario= :user and e.noPreguntas= :total");
        query.setParameter("nombre", nombre);
        query.setParameter("user", u);
        query.setParameter("total", t);
        
        List encuesta=query.getResultList();
        return encuesta;
    }
    
    
    public List look_tipor(int t){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        Query query= em.createQuery("SELECT t from Tiporespuesta t where t.idtipoResp= :numero");
        query.setParameter("numero", t);
        
        List tipo=query.getResultList();
        return tipo;
    }
    
    public List look_preg(String preg, Encuesta e){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        Query query=em.createQuery("SELECT p from Preguntas p where p.pregunta= :preg and p.fkEncuesta= :e");
        query.setParameter("preg", preg);
        query.setParameter("e", e);
        
        List result=query.getResultList();
        return result;

    }
    
    public List look_enc(Usuarios us, String n){
         EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        Query query=em.createQuery("SELECT en from Encuesta en where en.fkUsuario= :us and en.nombre= :n");
        query.setParameter("us", us);
        query.setParameter("n", n);
        
        List result=query.getResultList();
        return result;
    }
    
    public List look_pregunta(Encuesta us){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        Query query=em.createQuery("SELECT en from Preguntas en where en.fkEncuesta= :us");
        query.setParameter("us", us);
        
        List result=query.getResultList();
        return result;
    }
    public List look_op(Preguntas pk){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        Query query=em.createQuery("SELECT o from Opciones o where o.fkPregunta= :fk");
        query.setParameter("fk", pk);
        
        List result=query.getResultList();
        return result;
    }
    
    public List look_enc(String e){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        
        Query query=em.createQuery("SELECT en from Encuesta en where en.enlace= :e");
        query.setParameter("e", e);
        
        List result=query.getResultList();
        return result;
    }
    
     public void c_del(Encuesta a){
//      Delete conect =new Delete();
  //    conect.c_del(e);
     EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
                    

    Query query= em.createQuery("SELECT e from Encuesta e where e.idEncuesta= :id ");
            query.setParameter("id",a.getIdEncuesta());
               Respuestas rr= new Respuestas();
                Preguntas pp= new Preguntas();
                Tiporespuesta tp= new Tiporespuesta();
                                Opciones oo= new Opciones();
                                
                    List<Encuesta> enca=query.getResultList();
                    for(Encuesta res:enca)
                    {a=res;
                    pp.setFkEncuesta(res);
                    rr.setFkPregunta(pp);
                    oo.setFkPregunta(pp);
                    }   

                    int id;
                    id =a.getIdEncuesta();
                    a=em.find(Encuesta.class, id);
                    em.remove(a);//enc
                    em.getTransaction().commit();
                    /*=rr.getIdRespuesta();
                     rr = em.find(Respuestas.class, id);
                      em.remove(rr);//

                         id =oo.getIdOpciones();
                     oo = em.find(Opciones.class, id);
                        em.remove(oo);//op

                         id =pp.getIdPregunta();

                     pp = em.find(Preguntas.class, id);
                          em.remove(pp);//pregs*/

                         /* id =a.getIdEncuesta();
                          a=em.find(Encuesta.class, id);
                            em.remove(a);//enc
                      em.getTransaction().commit();res*/
                    
                     /* em.remove(rr);//res
                       id=oo.getIdOpciones();
                      tp= em.find(Tiporespuesta.class, 1);

                       em.remove(tp);
                     em.getTransaction().commit();
                    rr= em.find(Opciones.class, id);

                        em.remove(oo);//op
                          em.remove(pp);//pregs
                            em.remove(a);//enc
                      em.getTransaction().commit();*/

                    /*
                            int randomNum = ThreadLocalRandom.current().nextInt(10000, 99998 + 1);
                            <c:out value="${param.accountID}"></c:out>
                          <c:import var = "data" url = "http://www.tutorialspoint.com"/>
                             <c-rt:out value="${param.myname}" />.


                    */
        }
    /* public List look_pregenc(Encues){
        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("WebApplication2PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();                   

        Query query= em.createQuery("SELECT e from Preguntas e where e.fkEncuesta :id  ");
        query.setParameter("id",id);
        List result=query.getResultList();
        return result;  
     }*/
}

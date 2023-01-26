package entidades;

import entidades.Preguntas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-07T20:04:01")
@StaticMetamodel(Respuestas.class)
public class Respuestas_ { 

    public static volatile SingularAttribute<Respuestas, Preguntas> fkPregunta;
    public static volatile SingularAttribute<Respuestas, String> respuesta;
    public static volatile SingularAttribute<Respuestas, Integer> idRespuesta;

}
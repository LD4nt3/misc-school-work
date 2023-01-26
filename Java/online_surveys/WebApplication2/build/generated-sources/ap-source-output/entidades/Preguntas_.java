package entidades;

import entidades.Encuesta;
import entidades.Opciones;
import entidades.Respuestas;
import entidades.Tiporespuesta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-07T20:04:01")
@StaticMetamodel(Preguntas.class)
public class Preguntas_ { 

    public static volatile SingularAttribute<Preguntas, Encuesta> fkEncuesta;
    public static volatile ListAttribute<Preguntas, Respuestas> respuestasList;
    public static volatile SingularAttribute<Preguntas, Tiporespuesta> fkTiporespuesta;
    public static volatile ListAttribute<Preguntas, Opciones> opcionesList;
    public static volatile SingularAttribute<Preguntas, Integer> idPregunta;
    public static volatile SingularAttribute<Preguntas, String> pregunta;

}
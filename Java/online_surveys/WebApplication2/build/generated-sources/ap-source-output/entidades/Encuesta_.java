package entidades;

import entidades.Preguntas;
import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-07T20:04:01")
@StaticMetamodel(Encuesta.class)
public class Encuesta_ { 

    public static volatile SingularAttribute<Encuesta, Usuarios> fkUsuario;
    public static volatile ListAttribute<Encuesta, Preguntas> preguntasList;
    public static volatile SingularAttribute<Encuesta, Integer> idEncuesta;
    public static volatile SingularAttribute<Encuesta, Short> noPreguntas;
    public static volatile SingularAttribute<Encuesta, String> enlace;
    public static volatile SingularAttribute<Encuesta, String> nombre;

}
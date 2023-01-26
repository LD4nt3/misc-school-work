<%-- 
    Document   : grabardatos
    Created on : 3/12/2018, 09:27:32 PM
    Author     : OeS Gossamer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar personas</title>
    </head>
    <body>
        <center>
            <h1>Formulario de datos</h1>
        </center>
        <f:view>
            <h:form>
                <table width="50%" align="center" border="0">
                    <tr>
                        <td>Nombre:</td>
                        <td>
                            <h:inputText value="#{PersonaBean.selected.usuario}"/>
                        </td>
                    </tr>
                    <tr>
                    
                          <td>Contraseña:</td>
                        <td>
                            <h:inputSecret value="#{PersonaBean.selected.contraseña}" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <h:commandButton value="Registrarse" action="#{PersonaBean.doGuardar}"/>
                        </td>
                    </tr>
                  
                </table>
            </h:form>
        </f:view>
    </body>
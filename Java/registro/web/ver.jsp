<%-- 
    Document   : ver
    Created on : 3/12/2018, 09:32:05 PM
    Author     : OeS Gossamer
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver registros</title>
    </head>
    <body>
        <center>
            <h1>Listado de personas</h1>
            <table border="1" align="center">
                <tr>
                    <th>Nombre</th>
            
                    <th>Contra</th>
                </tr>
                <c:forEach var="per" items="${listapersonas}">
                    <tr>
                        <td><c:out value="${per.nombre}"/></td>
                  
                            <td><c:out value="${per.contra}"/></td>
                    </tr>
                </c:forEach>
            </table>
            <br/><br/>
            <a href="grabardatos.jsp">Volver</a>
        </center>
    </body>
</html>
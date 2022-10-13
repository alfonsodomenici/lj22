<%-- 
    Document   : elencoClienti
    Created on : 13 ott 2022, 20:20:00
    Author     : ospite
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Anagrafica</title>
    </head>
    <body>
        <h1>Anagrafica</h1>        
        <table style="width: 100%;">
            <thead>
                <tr>
                    <th>id</th>
                    <th>nome</th>
                    <th>cognome</th>
                    <th>data nascita</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${store.all()}" var="cli" >
                    <tr>
                        <td>${cli.id}</td>
                        <td>${cli.nome}</td>
                        <td>${cli.cognome}</td>
                        <td>${cli.dNascita}</td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>

</body>
</html>

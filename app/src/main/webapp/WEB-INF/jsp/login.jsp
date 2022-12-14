<%--
  Created by IntelliJ IDEA.
  User: bernardofilardi
  Date: 06/11/2022
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>App Soccer Manager - Atacante</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>

    <div class="container mt-3">
        <h2>Autenticação</h2>
        <form action="/login" method="post">
            <div class="form-group">
                <label>E-mail:</label>
                <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
            </div>
            <div class="form-group">
                <label>Senha:</label>
                <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
            </div>
            <button type="submit" class="btn btn-default">Acessar</button>
        </form>

    </div>
</body>
</html>

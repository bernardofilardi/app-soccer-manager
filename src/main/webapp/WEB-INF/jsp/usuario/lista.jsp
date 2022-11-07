<%--
  Created by IntelliJ IDEA.
  User: bernardofilardi
  Date: 25/10/2022
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>App Soccer Manager - Tecnico</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="container mt-3">
        <h3>Técnicos: ${listagem.size()}</h3>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Idade</th>
                <th>Tempo de carreira</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${listagem}" var="tecnico">
                <tr>
                    <td>${tecnico.id}</td>
                    <td>${tecnico.nome}</td>
                    <td>${tecnico.idade}</td>
                    <td>${tecnico.tempo_carreira}</td>
                    <td><a href="/tecnico/${tecnico.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: bernardofilardi
  Date: 25/10/2022
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>App Soccer Manager - Meio Campo</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <h3>Meio Campista: ${listagem.size()}</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Nome</th>
            <th>Peso</th>
            <th>Altura</th>
            <th>Análise</th>
            <th>Atua no Ataque?</th>
            <th>% Acerto Passe</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listagem}" var="meioCampo">
            <tr>
                <td>${meioCampo.id}</td>
                <td>${meioCampo.nome}</td>
                <td>${meioCampo.peso}</td>
                <td>${meioCampo.altura}</td>
                <td>${meioCampo.analise}</td>
                <td>${meioCampo.atua_ataque}</td>
                <td>${meioCampo.acerto_passe}</td>
                <td><a href="/meiocampo/${meioCampo.id}/excluir">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

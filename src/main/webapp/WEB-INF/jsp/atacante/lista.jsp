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
    <title>App Soccer Manager - Atacante</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="container mt-3">
        <h3>Atacantes: ${listagem.size()}</h3>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Peso</th>
                    <th>Altura</th>
                    <th>Análise</th>
                    <th>Atua no Meio Campo?</th>
                    <th>% Acerto finalização</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listagem}" var="atacante">
                    <tr>
                        <td>${atacante.id}</td>
                        <td>${atacante.nome}</td>
                        <td>${atacante.peso}</td>
                        <td>${atacante.altura}</td>
                        <td>${atacante.analise}</td>
                        <td>${atacante.atua_meiocampo}</td>
                        <td>${atacante.acerto_finalizacao}</td>
                        <td><a href="/atacante/${atacante.id}/excluir">excluir</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>

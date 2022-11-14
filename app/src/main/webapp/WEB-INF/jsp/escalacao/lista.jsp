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
    <title>App Soccer Manager - Escalacao</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="container mt-3">
        <h3>Escalações: ${listagem.size()}</h3>
        <form action="/escalacao" method="get">
            <button type="submit" class="btn btn-success">Novo</button>
        </form>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Descrição</th>
                <th>Organização</th>
                <th>Já utilizada?</th>
                <th>Análise</th>
                <th>Técnico</th>
                <th>Jogadores</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${listagem}" var="escalacao">
                <tr>
                    <td>${escalacao.id}</td>
                    <td>${escalacao.descricao}</td>
                    <td>${escalacao.organizacao}</td>
                    <td>${escalacao.utilizada_anteriormente}</td>
                    <td>${escalacao.analise}</td>
                    <td>${escalacao.tecnico.nome}</td>
                    <td>${escalacao.jogadores.size()}</td>
                    <td><a href="/escalacao/${escalacao.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>

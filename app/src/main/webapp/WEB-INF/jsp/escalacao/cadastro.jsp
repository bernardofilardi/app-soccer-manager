<%--
  Created by IntelliJ IDEA.
  User: bernardofilardi
  Date: 06/11/2022
  Time: 19:49
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

</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="container mt-3">
        <h2>Escalacao</h2>
        <form action="/escalacao/incluir" method="post">
            <div class="form-group">
                <label>Descricao:</label>
                <input type="text" class="form-control" placeholder="Entre com a descricao da Escalacao" name="nome">
            </div>
            <div class="form-group">
                <label>Organização:</label>
                <input type="text" class="form-control" placeholder="Qual a organização dos jogadores (Ex: 442, 433, 451)" name="organizacao">
            </div>
            <div class="form-group">
                <label>Já Utilizada?</label>
                <input type="text" class="form-control" placeholder="Entre com a altura do Escalacao" name="utilizada_anteriormente">
            </div>
            <div class="form-group">
                <label>Análise:</label>
                <input type="text" class="form-control" placeholder="Defina a análise sobre a Escalacao" name="analise">
            </div>

            <div class="form-group">
                <label>Solicitante:</label>
                <select name="tecnico" class="form-control">
                    <c:forEach var="t" items="${tecnicos}">
                        <option value="${t.id}">${t.nome}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Jogadores:</label>
                <c:forEach var="jogador" items="${jogadores}">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" name="jogadores" value="${jogador.id}">
                        <label class="form-check-label"> ${jogador.nome}</label>
                    </div>
                </c:forEach>
            </div>

            <button type="submit" class="btn btn-default">Cadastrar</button>
        </form>
    </div>
</body>
</html>

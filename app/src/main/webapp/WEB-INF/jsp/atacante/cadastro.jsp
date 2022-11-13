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
    <title>App Soccer Manager - Atacante</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="container mt-3">
        <h2>Atacante</h2>
        <form action="/atacante/incluir" method="post">
            <div class="form-group">
                <label>Nome:</label>
                <input type="text" class="form-control" placeholder="Entre com o nome do Atacante" name="nome">
            </div>
            <div class="form-group">
                <label>Peso (kg):</label>
                <input type="text" class="form-control" placeholder="Entre com o peso do Atacante" name="peso">
            </div>
            <div class="form-group">
                <label>Altura (cm):</label>
                <input type="text" class="form-control" placeholder="Entre com a altura do Atacante" name="altura">
            </div>
            <div class="form-group">
                <label>Análise:</label>
                <input type="text" class="form-control" placeholder="Defina a análise sobre o Atacante" name="analise">
            </div>
            <div class="form-group">
                <label>Atua como Meio Campo?</label>
                <input type="text" class="form-control" placeholder="Esse Atacante atua como meio campo" name="atua_meiocampo">
            </div>
            <div class="form-group">
                <label>Percentual de acerto nos passes:</label>
                <input type="text" class="form-control" placeholder="Percentual de acerto nas finalizações" name="acerto_finalizacao">
            </div>

            <button type="submit" class="btn btn-default">Cadastrar</button>
        </form>
    </div>
</body>
</html>

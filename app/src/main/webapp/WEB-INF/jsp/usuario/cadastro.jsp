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
    <title>App Soccer Manager - Usuário</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <c:import url="/WEB-INF/jsp/menu.jsp"/>
    <div class="container mt-3">
        <form action="/cep" class="form-inline" method="post">
            <div class="form-group">
                <label>CEP:</label>
                <input type="text" class="form-control" placeholder="Entre com o seu CEP" name="cep">
            </div>
            <button type="submit" class="btn btn-default">Buscar</button>
        </form>

        <h2>Usuário</h2>

        <form action="/usuario/incluir" method="post">
            <div class="form-group">
                <label>Nome:</label>
                <input type="text" class="form-control" placeholder="Entre com o nome do Usuário" name="nome">
            </div>
            <div class="form-group">
                <label>E-mail:</label>
                <input type="text" class="form-control" placeholder="Entre com o e-mail do Usuário" name="email">
            </div>
            <div class="form-group">
                <label>Senha:</label>
                <input type="text" class="form-control" placeholder="Entre com a senha do Usuário" name="senha">
            </div>

            <c:import url="/WEB-INF/jsp/endereco.jsp"/>

            <button type="submit" class="btn btn-default">Cadastrar</button>
        </form>
    </div>
</body>
</html>

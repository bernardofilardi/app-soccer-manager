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
    <h2>Usuário</h2>
    <form action="/cep" class="form-inline" method="post">
        <button type="submit" class="btn btn-primary">Buscar</button>
    </form>
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
        <div class="form-group">
            <label>CEP:</label>
            <input type="text" class="form-control" placeholder="Entre com o CEP do endereço do Usuário"
                   name="endereco.cep" value="${endereco.cep}">
        </div>
        <div class="form-group">
            <label>Logradouro:</label>
            <input type="text" class="form-control" placeholder="Entre com o logradouro do endereço do Usuário"
                   name="endereco.logradouro" value="${endereco.logradouro}">
        </div>
        <div class="form-group">
            <label>Complemento:</label>
            <input type="text" class="form-control" placeholder="Entre com o Complemento do endereço do Usuário"
                   name="endereco.complemento">
        </div>
        <div class="form-group">
            <label>Bairro:</label>
            <input type="text" class="form-control" placeholder="Entre com  o Bairro do endereço do Usuário"
                   name="endereco.bairro" value="${endereco.bairro}">
        </div>
        <div class="form-group">
            <label>Localidade:</label>
            <input type="text" class="form-control" placeholder="Entre com a Localidade do endereço do Usuário"
                   name="endereco.localidade">
        </div>
        <div class="form-group">
            <label>UF:</label>
            <input type="text" class="form-control" placeholder="Entre com o UF do endereço do Usuário" name="senha"
                   value="${endereco.uf}">
        </div>

        <button type="submit" class="btn btn-default">Cadastrar</button>
    </form>
</div>
</body>
</html>

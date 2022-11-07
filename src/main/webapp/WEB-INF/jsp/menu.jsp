<%--
  Created by IntelliJ IDEA.
  User: bernardofilardi
  Date: 23/10/2022
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link active" href="/escalacao/lista">Escalação</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/tecnico/lista">Técnico</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/atacante/lista">Atacante</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/defesa/lista">Defesa</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/meiocampo/lista">Meio Campo</a>
                </li>
            </c:if>
        </ul>

        <ul class="nav navbar-nav navbar-right">
            <c:if test="${empty user}">
                <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </c:if>

            <c:if test="${not empty user}">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
            </c:if>
        </ul>
    </div>
</nav>

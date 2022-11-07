<%--
  Created by IntelliJ IDEA.
  User: bernardofilardi
  Date: 23/10/2022
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li class="active"><a href="/z">Home</a></li>
            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/escalacao/lista">Escalação</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/tecnico/lista">Técnico</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/atacante/lista">Atacante</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/defesa/lista">Defesa</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/meiocampo/lista">Meio Campo</a>
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

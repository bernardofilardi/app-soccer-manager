<%--
  Created by IntelliJ IDEA.
  User: bernardofilardi
  Date: 23/10/2022
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>App Soccer Manager</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-primary">
            <div class="container-fluid">
                <ul class="navbar-nav">
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
                </ul>
            </div>
        </nav>
    </body>
</html>

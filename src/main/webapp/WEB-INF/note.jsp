<%--
  Created by IntelliJ IDEA.
  User: supra
  Date: 12/10/2021
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${requestScope.note.title}</title>
</head>
<body>
    <h1>Note: ${requestScope.note.title}</h1>
    <p>Note content:</p>
    <p>${requestScope.note.content}</p>
</body>
</html>

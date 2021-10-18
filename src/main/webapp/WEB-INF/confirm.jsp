<%--
  Created by IntelliJ IDEA.
  User: supra
  Date: 15/10/2021
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Note saved</title>
</head>
<body>
    <h1>Your note has been saved</h1>
<p>You will find it here <a href="${pageContext.request.contextPath}/note?title=${requestScope.note.title}">here!</a></p>
</body>
</html>

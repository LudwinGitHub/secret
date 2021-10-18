<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Secret notes</title>
    <style>
        form div > * {
            display: block;
            width: 400px;
        }
    </style>
</head>
<body>
    <h1>Secret notes</h1>
    <p>Create secret note and stop worrying</p>
<form action="${pageContext.request.contextPath}/save" method="post">
    <div>
        <label for="title">Note (URL) title</label>
        <input name="title" id="title">
    </div>
    <div>
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="*****">
    </div>
    <div>
        <label for="content">Note content</label>
        <textarea name="content" id="content" placeholder="Secret information..." rows="10"></textarea>
    </div>
    <button type="submit">Save note!</button>
</form>
</body>
</html>

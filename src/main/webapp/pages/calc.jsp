<%--
  Created by IntelliJ IDEA.
  User: stepanvasilyeu
  Date: 26.04.22
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <form action="/calc" method="post">
        <input type="number" name="firstNumber" placeholder="Enter First Number"/>
        <input type="number" name="secondNumber" placeholder="Enter Second Number"/>
        <input type="text" name="operation" placeholder="operation"/>
        <button>Submit</button>
    </form>
    <p>${requestScope.result}</p>
</body>
</html>

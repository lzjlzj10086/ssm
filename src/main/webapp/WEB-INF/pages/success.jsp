<%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/5/23
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>入门成功</title>
</head>
<body>
    <h3>入门程序运行成功day02</h3>
    <hr>
    ${user.userName}
    ${user.passWord}
    <hr>
    <h3>上传成功</h3>
    <hr>
    <% System.out.println("成功页面执行");%>
    <hr>
    <h3>fandAll</h3>
    ${list}
    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.money}
        <br>
    </c:forEach>

</body>
</html>

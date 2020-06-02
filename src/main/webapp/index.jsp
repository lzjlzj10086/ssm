<%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/5/31
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>


</head>
<body>
<a href="account/findAll">testController</a><hr>
<form action="account/save" method="post">
    编号  ：<input type="text" name="id"/>
    用户名：<input type="text" name="name"/><br>
    金额  ：<input type="text" name="money"/><br>
    <input type="submit" value="保存"/>
</form>

</body>
</html>

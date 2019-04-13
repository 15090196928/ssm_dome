<%--
  Created by IntelliJ IDEA.
  User: junxia.ma
  Date: 2019/4/10
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试</a>
    <a href="#">保存</a>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name"><br>
        金额: <input type="text" name="money"><br>
        <input type="submit" value="保存"><br>
    </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: chenlong
  Date: 2016/8/25
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JS Test</title>
    <script src="js/js001.js"></script>
    <script src="js/ajax.js"></script>
    <script src="jquery/jquery-1.12.3.min.js"></script>
    <script src="jquery/jquery.cookie.js"></script>

</head>
<body>
<script>
    document.write("<h1>This is a heading</h1>");
    document.write("<p>This is a paragraph</p>");

</script>

<button id="demo" type="button" onclick="changeEleValue()">点击这里</button>

</br></br>用户名：<input type="text" id="userName" name="userName">
</br>密码：<input type="password" id="passWord" name="passWord">
<input type="button" onclick="myAjax()" value="登录">

</body>
</html>

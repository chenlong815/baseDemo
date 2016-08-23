<%@ page contentType="text/html; charset=gb2312"%>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<h2 align="center">»¶Ó­µÇÂ½</h2>
<div id="loginDiv" align="center">
    <form action="<%=request.getContextPath() %>/test" method="get">
        userName:<input type="text" name="userName"><br/>
        passWord:<input type="text" name="passWord"><br/><br/>
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>

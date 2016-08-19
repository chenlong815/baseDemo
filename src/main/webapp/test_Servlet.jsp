<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<h2>Hello ChenLong!</h2>

<form action="<%=request.getContextPath() %>/test" method="get">
    userName:<input type="text" name="userName"><br/>
    passWord:<input type="text" name="passWord"><br/>
    <input type="submit" value="Login">
</form>
</body>
</html>

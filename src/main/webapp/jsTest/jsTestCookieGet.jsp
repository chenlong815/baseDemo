<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %>
<%--
  Created by IntelliJ IDEA.
  User: chenlong
  Date: 2016/9/26
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = "";
    //从客户端读取硬盘中的cookie文件
    Cookie[] cookies = request.getCookies();
    if(cookies == null){
        username = "";
    }
    else{
        for (int i = 0; i < cookies.length; i++){
            if ("userName".equalsIgnoreCase(cookies[i].getName())){
                username = cookies[i].getValue();
            }
        }
    }
%>
<%=username%>
</body>
</html>
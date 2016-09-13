<%@ page language="java" pageEncoding="UTF-8"%>

<html>
  <head>

    <title>Java Base - LeftPage</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

  <jsp:include page="isLogin.jsp"></jsp:include>

  <body>
   <a href="stuInfo_add.jsp" target="main_right">录入学生信息</a><br>
    <a href="<%=request.getContextPath() %>/StudentInfo.do?opId=query" target="main_right">查看学生信息</a><br>
     <a href="<%=request.getContextPath() %>/StudentInfo.do?opId=update" target="main_right">修改学生信息</a><br>
       <a href="<%=request.getContextPath() %>/StudentInfo.do?opId=delete" target="main_right">删除学生信息</a><br>
        <a href="<%=request.getContextPath() %>/LogOutServlet" target="_top">退出</a><br>
  </body>
</html>

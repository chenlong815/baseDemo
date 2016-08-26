<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Java Base - MainPage</title>

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

<frameset rows="20%,*">
	<frame src="main_top.jsp">
	<frameset cols="20%,*">
		<frame src="main_left.jsp">
		<frame src="main_right.jsp" name="main_right">
	</frameset>
</frameset>

<body>
	This is my JSP page.
	<br>
</body>
</html>

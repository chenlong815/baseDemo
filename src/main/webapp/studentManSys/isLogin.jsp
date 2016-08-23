
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.jweb.model.userTable" %>
<%
userTable user=(userTable)session.getAttribute("user");
if(user==null)
{
 %>
 
 <jsp:forward page="login.jsp"></jsp:forward>
 <%} %>

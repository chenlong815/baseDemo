
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.jweb.model.UserTable" %>
<%
UserTable user=(UserTable)session.getAttribute("user");
if(user==null)
{
 %>
 
 <jsp:forward page="login.jsp"></jsp:forward>
 <%} %>

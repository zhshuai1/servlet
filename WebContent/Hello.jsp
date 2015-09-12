<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String word=com.zebrait.common.Animal.Hello();
	out.print(word);
	out.print(testMap.toString());
%>
<%--jsp scriptlet --%>

Parameters:<%=request.getParameter("hello") %> <%--jsp 表达式 --%>

<%!
	HashMap<String,String> testMap=new HashMap<String,String>();
	private String sayHello(){
	 return "This is jsp hello.";
	}
%><%--jsp 声明 --%>

<%=sayHello() %>
</body>
</html>
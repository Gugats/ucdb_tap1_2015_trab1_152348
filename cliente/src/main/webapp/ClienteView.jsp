<%@page import="cliente.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<span style="color:black">
<%
Cliente c = (Cliente) request.getAttribute("Cli") ;
	out.print("Nome: " + c.getNome()+ "<br>");
	out.print("E-mail: " + c.getEmail()+ "<br>");
	out.print("CPF: " + c.getCpf()+ "<br>");
	out.print("RG: " + c.getRg()+ "<br>");
	out.print("Sexo: " + c.getSexo());
%>
</span>
	
	
</body>
</html>
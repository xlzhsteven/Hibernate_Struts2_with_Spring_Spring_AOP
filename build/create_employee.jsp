<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Welcome To Struts2 EMS struts!</h1>
<s:form action="create_employee">
	<s:textfield name="emp.name" label="Employee Name"></s:textfield>
	<s:textfield name="emp.age" label="Age"></s:textfield>
	<s:textfield name="emp.salary" label="Salary"></s:textfield>
	<s:submit value="Submit"></s:submit>
</s:form>
</body>
</html>
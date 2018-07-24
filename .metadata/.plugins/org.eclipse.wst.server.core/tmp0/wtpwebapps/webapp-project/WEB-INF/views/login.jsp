
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix = "x" 
   uri = "http://java.sun.com/jsp/jstl/xml" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p><font color="red">${errormsg}</font>
	<form method="post" action="log">
	Name: <input type="text" name="name"/>
	Password:<input type="password" name="password"/>
	<input type="submit"/>
	</form>
</body>
</html>
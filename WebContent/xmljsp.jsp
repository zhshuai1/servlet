
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:declaration>
	private String sayHello(){
		return "Hello Xml Jsp";
	}
</jsp:declaration>
<jsp:scriptlet>
	out.write(sayHello());
	out.write(testMap.toString());
</jsp:scriptlet>
<jsp:expression>sayHello()</jsp:expression>
<jsp:directive.page import="java.util.HashMap"/> 
<jsp:declaration>
int count=0;
Object obj=new Object();
</jsp:declaration>
<%! java.util.HashMap<String,String> testMap=new HashMap<String,String>(); %>
<jsp:scriptlet>
out.write("sajdfkl"+count++ +obj.getClass()+"&lt;br&gt;");
</jsp:scriptlet>
<jsp:expression>
	count
</jsp:expression>
</body>
</html>
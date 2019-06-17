<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>welcome</title>
</head>
<body>

  <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
  %>

  <h1>
    欢迎 <%=username%>  登录成功
  </h1>

</body>
</html>

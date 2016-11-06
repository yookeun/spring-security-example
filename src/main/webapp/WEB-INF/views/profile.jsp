<%--
  Created by IntelliJ IDEA.
  User: ykkim
  Date: 2016. 9. 17.
  Time: 오후 1:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <h1>Your Profile</h1>
    Name : ${user.username} <br>
    Pwd : ${user.userpwd}
</body>
</html>

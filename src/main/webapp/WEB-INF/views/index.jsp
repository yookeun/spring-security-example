<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/resources/css/signin.css">
</head>
<body>
<div class="container">
    <h1>Login Success!!!</h1>
    <h2>${user.username} 님 환영합니다. </h2>
    <p></p>
    <h3><a href="/home">home</a></h3>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
        <h3><a href="javascript:alert('관리자군요.')";>관리자만 보임</a></h3>
    </sec:authorize>
    <h3><a href="/logout">logout</a></h3>
</div>
</body>
</html>

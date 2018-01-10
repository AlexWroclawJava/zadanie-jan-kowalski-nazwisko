<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 09.01.2018
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Witaj</title>
</head>
<body>

        <h1>Cześć <%= request.getAttribute("imieAtrybut") %> </h1>
        <h2> Wiem, że masz na nazwisko <%= request.getAttribute("nazwiskoAtrybut")%> </h2>

</body>
</html>


<%--powtorzyc programowanie obiektowe, polimorfizm i interfejsy--%>
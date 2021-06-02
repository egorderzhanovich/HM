<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>T</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div align="center">
<form method="POST" action="calc">
    <table>
        <tr>
            <td>First number:</td>
        </tr>
        <tr>
            <td><input type="text" name="num1"></td>
        </tr>
        <tr>
            <td> Insert a sign of arithmetic operation:</td>
        </tr>
        <tr>
            <td><input type="text" name="operation"></td>
        </tr>
        <tr>
            <td>Second number:</td>
        </tr>
        <tr>
            <td><input type="text" name="num2"></td>
        </tr>

    </table>
    <input type="submit" value="Submit"/>
</form>
</div>
</body>
</html>
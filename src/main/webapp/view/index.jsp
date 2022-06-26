<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <input type="checkbox" name="condiment" value="Lettuce" />Lettuce<br/>
    <input type="checkbox" name="condiment" value="Tomato" />Tomato<br/>
    <input type="checkbox" name="condiment" value="Blue" />Blue<br/>
    <input type="checkbox" name="condiment" value="Yellow" />Yellow<br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>

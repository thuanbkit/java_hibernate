<%-- 
    Document   : add
    Created on : Nov 22, 2017, 5:03:04 PM
    Author     : thuandd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="CategoryServlet?id=${item.id}&action=delete">
            name:<input type="text" name="name">
            <input type="submit" value="submit" />
        </form>
    </body>
</html>

<%-- 
    Document   : index
    Created on : Nov 22, 2017, 10:34:20 AM
    Author     : thuandd
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entities.*" %>
<%@page import="model.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div><a href="add.jsp">Thêm mới</a></div>
        <% CategoryModel category = new CategoryModel(); %>
        <c:forEach var="item" items="<%= category.list() %>">
            Tên danh mục: ${item.name}<br>
            Mã danh mục: ${item.id} <br>
            <a href="CategoryServlet?id=${item.id}" onclick="confirm('are you sure?');">Xóa</a><br>
            ===============================<br>
        </c:forEach>
    </body>
</html>

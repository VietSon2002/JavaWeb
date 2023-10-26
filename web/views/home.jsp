<%-- 
    Document   : home
    Created on : Oct 11, 2023, 12:16:28 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category List</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach items="${listCategory}" var="category">
            <c:out value="${category.name}"></c:out><br>
        </c:forEach>
            <br>-------------<br><!-- comment -->
        <c:forEach items="${listCategory}" var="category">
            <c:out value="${category.name}"></c:out><br>
            <c:forEach items="${listProduct}" var="product">
                <c:if test="${category.id == product.id_category}">
                    <c:out value="---${product.name}"></c:out><br>
                </c:if>
            </c:forEach>
        </c:forEach>
        
    </body>
</html>
<!--http://localhost:8080/shopping/views/home.jsp-->

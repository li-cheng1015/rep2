<%--
  Created by IntelliJ IDEA.
  User: lc
  Date: 2018/10/29
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <table width="100%" border=1>
        <tr>
            <td>商品名称</td>
            <td> ${items.name } </td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td> ${items.price } </td>
        </tr>
        <tr>
            <td>生成日期</td>
            <td> <fmt:formatDate value="${items.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
        </tr>
        <tr>
            <td>商品简介</td>
            <td>${items.detail} </td>
        </tr>
    </table>
</form>
</body>
</html>

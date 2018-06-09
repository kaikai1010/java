<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.HealthBeans" %>

<%
String errorMsg = (String) request.getAttribute("errorMsg");
HealthBeans hb = (HealthBeans) request.getAttribute("hb");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康診断</title>
</head>
<body>

<h1>BMI診断結果</h1>

<%-- 入力エラーの場合 --%>
<% if(errorMsg != null) { %>
<p><%= errorMsg %></p>

<%-- 正常に入力された場合 --%>
<% } else { %>
<p>
身長：	<%= hb.getHeight() %> (cm)<br>
体重：	<%= hb.getWeight() %> (kg)<br>
BMI:	<%= hb.getBmi() %><br>
体型：	<%= hb.getBodyType() %><br>
<br>
<% } %>

<a href="/bmicheck/">戻る</a>

</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>

<h2>Ово је Премијум сервис МетКурсева</h2>
<h3>Молимо Вас да се пријавите</h3>
<form method="post" action="${flowExecutionUrl}">
    <input type="hidden" name="_eventId" value="performLogin">
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    Корисник<input type="text" name="userName" maxlength="40"><br>
    Лозинка <input type="password" name="password" maxlength="40"><br>
    <input type="submit" value="Login" />
</form>

<%@ include file="footer.jsp" %>

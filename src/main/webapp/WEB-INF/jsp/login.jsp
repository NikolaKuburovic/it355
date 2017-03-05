
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>

<h2>Пријави се:</h2>
<c:if test="${not empty error}">
    <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
    <div class="msg">${msg}</div>
</c:if>
<form name='loginForm'
      action="<c:url value='/j_spring_security_check' />" method='POST'>
    <table>
        <tr>
            <td>Корисник:</td>
            <td><input type='text' name='korisnik_username' autofocus/></td>
        </tr>
        <tr>
            <td>Лозинка:</td>
            <td><input type='password' name='korisnik_password'/></td>
        </tr>
        <tr>
            <td colspan='2'>
                <input name="submit" type="submit" value="submit" />
            </td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>

<%@ include file="footer.jsp" %>

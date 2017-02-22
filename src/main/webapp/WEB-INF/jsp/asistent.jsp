<%-- 
    Document   : asistent
    Created on : Feb 16, 2017, 5:38:39 PM
    Author     : Nikola Kuburovic
--%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<h2>Унесите информације о асистенту</h2>
<form:form method="POST" action="/MetCourses/addAsistent">
    <table>
        <tr>
            <td><form:label path="ime"><spring:message code="name"/></form:label></td>
            <td><form:input path="ime" /></td>
        </tr>
        <tr>
            <td><form:label path="prezime"><spring:message code="surname"/></form:label></td>
            <td><form:input path="prezime" /></td>
        </tr>
        <tr>
            <td><form:label path="oblast"><spring:message code="field"/></form:label></td>
            <td><form:input path="oblast" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Пошаљи"/>
            </td>
        </tr>
    </table>
</form:form>

<%@ include file="footer.jsp" %>

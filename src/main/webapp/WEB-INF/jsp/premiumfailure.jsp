
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>

<br />
Погрешно корисничко име или лозинка. Покушајте поново!
<script>
    document.write('<a href="' + document.referrer + '">Повратак</a>');
</script>

<%@ include file="footer.jsp" %>

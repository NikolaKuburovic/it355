<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>

<h2>Ово је Премијум сервис МетКурсева</h2>
<h3>Молимо Вас да се пријавите</h3>
<form class="form-horizontal" method="post" action="${flowExecutionUrl}">
    <input type="hidden" name="_eventId" value="performLogin">
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div class="form-group">
        <label class="col-sm-1 control-label">Корисник:</label>
        <div class="col-sm-4">
            <input class="form-control" type="text" name="userName" maxlength="40" autofocus>
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-1 control-label">Лозинка:</label>
        <div class="col-sm-4">
            <input class="form-control" type="password" name="password" maxlength="40">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-4">

            <button type="submit" class="btn btn-primary pull-right">Пријави се</button>

        </div>
    </div><br/>
</form>

<%@ include file="footer.jsp" %>

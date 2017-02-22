<%-- 
    Document   : header
    Created on : Feb 8, 2017, 2:38:32 PM
    Author     : Nikola Kuburovic
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <spring:url value="/resources/stil.css" var="stilCss"></spring:url>
        <link href="${stilCss}" rel="stylesheet" />
    </head>
    <body>
        <p>МетКурсеви</p>
        <a href="/MetCourses">Почетна</a>
        <a href="profesor">Додај професора</a>
        <a href="asistent">Додај асистента</a>
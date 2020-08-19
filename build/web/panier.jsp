<%-- 
    Document   : resultat
    Created on : May 10, 2020, 5:47:50 PM
    Author     : babak
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <fmt:setLocale value="${sessionScope.langue}"/>
    <fmt:setBundle basename="I18N.Messages"  />

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MonMagasin.ca: <fmt:message key="message.titlesearch"/></title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container my-3">
 
            <div class="row mb-3 ">
                <div class="col-sm-12 text-right">
                    <input type="hidden" name="id" value="0"/>
                    <button onclick="window.location.href = 'GererPanier';" class="btn btn-warning btn-lg"><fmt:message key="message.cart"/> <span class="badge badge-light">${requestScope.nbrItemsPanier}</span></button>
                </div>
            </div>
                <c:forEach var="produit" items="${requestScope.resultat}">
                    <div class="row border align-items-center">
                        <input type="hidden" name="id" value="${produit.id}"/>
                        <div class="col-sm-2 text-center align-center">
                            ${produit.photo}
                        </div>  
                        <div class="col-sm-2 font-weight-bold text-left">
                            <div>${produit.nom}</div><div><fmt:message key="message.by"/>: ${produit.fabriquant}</div>
                        </div>
                        <div class="col-sm-5 text-left">
                            ${produit.description}
                        </div>
                        <div class="col-sm-1 font-weight-bold text-center">
                            <fmt:formatNumber value="${produit.prix}" currencyCode="CAD" />
                        </div>
                        <div class="col-sm-2 text-center">
                            <button onclick="window.location.href = 'GererPanier';" class="btn btn-primary btn-lg"><fmt:message key="button.addtocart"/></button>
                        </div>
                    </div>
                </c:forEach>
        </div>
    </body>
</html>

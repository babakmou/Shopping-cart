<%-- 
    Document   : recherche
    Created on : May 6, 2020, 11:15:17 PM
    Author     : babak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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

        <div class="container pt-5">
            <form action="ChercherArticle">
                <div class="form-group">
                    <h4><fmt:message key="message.keyword"/> <input type="text" class="form-control" name="motCle" id="motCle" 
                                                                    required="true"></h4>

                    <h4><fmt:message key="message.price"/> Min <input type="text" class="form-control" name="prixMin" 
                                                                      id="prixMin">
                        <fmt:message key="message.price"/> Max <input type="text" class="form-control" name="prixMax" 
                                   id="prixMax"></h4>
                    <h4><fmt:message key="message.manufacturer"/> <input type="text" class="form-control" name="fabriquant"
                                                                         id="fabriquant"></h4>
                    <button type="submit" class="btn btn-primary"><fmt:message key="button.submit"/></button>
            </form>
            <div>

                <c:set var="erreur"  value="${requestScope.erreur}" />
                <c:if  test="${erreur != null }">
                    <br/><br/>
                    <h2 class="text-danger"><fmt:message key="message.nosearchresult"/></h2>
                </c:if>
            </div>
        </div>

    </body>
</html>

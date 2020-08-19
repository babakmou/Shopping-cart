<%-- 
    Document   : index
    Created on : May 6, 2020, 8:51:34 PM
    Author     : babak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <fmt:setLocale value="${sessionScope.langue}"/>
    <fmt:setBundle basename="I18N.Messages" />

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MonMagasin.ca</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="jumbotron jumbotron-fluid bg-primary">
                <div class="row justify-content-center align-items-center">
                    <h1><fmt:message key="message.welcome"/></h1>
                </div>
            </div>
            <div class="container pt-5 align-items-center">
                <form action="SelectionnerLangue" name="langForm">
                    <table class="table table-borderless">
                        <tr>
                            <th><fmt:message key="message.language"/></th>
                            <th></th>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group">
                                    <select class="form-control" name="langue" id="sel-lang">
                                        <option value="en_CA"><fmt:message key="language.en"/></option>
                                        <option value="fr_FR"><fmt:message key="language.fr"/></option>
                                    </select>
                                </div> 
                            </td>
                            <td>
                                <button type="submit" class="btn btn-primary"><fmt:message key="button.submit"/></button></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>

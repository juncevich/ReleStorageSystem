<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
    <jsp:body>
        <c:url value="/jstlReturnRelays" var="jstlReturnRelays" />
        <c:url value="/jstlRelay" var="jstlRelay" />
        <c:url value="/jstlHTML" var="jstlHTML" />

        <!-- Page Content -->
        <div class="container">

            <!-- Page Heading/Breadcrumbs -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">JSTL в Spring
                        <small>JSTL example</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="index.html">Home</a>
                        </li>
                        <li class="active">Java Standard Tag Library</li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <!-- Content Row -->
            <div class="row">
                <!-- Sidebar Column -->
                <div class="col-md-3">
                    <div class="list-group">

                        <a href="index.html" class="list-group-item">Home</a>
                        <a href="${jstlReturnRelays}" class="list-group-item">Get all realys</a>
                        <a href="${jstlRelay}" class="list-group-item">Get one realy</a>
                        <a href="${jstlHTML}" class="list-group-item">Get HTML</a>
                    </div>
                </div>
                <!-- Content Column -->
                <div class="col-md-9">
                    <c:if test="${not empty jstlResultObject}">
                        Result:
                        <p>${jstlResultObject}</p>
                    </c:if>

                    <c:if test="${not empty jstlResultRelays}">
                        <b>Result List:</b>
                        <table>

                            <c:forEach var="relayVar" items="#{jstlResultRelays}">
                                <tr>
                                    <td><b>idRelay: </b></td>
                                    <td><c:out value="${relayVar.id}"/></td>
                                </tr>
                                <tr>
                                    <td><b>number: </b></td>
                                    <td><c:out value="${relayVar.number}"/></td>
                                </tr>
                                <tr>
                                    <td><b>type: </b></td>
                                    <td><c:out value="${relayVar.type}"/></td>
                                </tr>


                                <tr><td><b style="color:green">End user with id:${relayVar}</b></td></tr>
                                <tr><td> <br /></td></tr>
                            </c:forEach>
                        </table>
                    </c:if>

                    <c:if test="${not empty jstlResultHTML}">
                        <p>With <b>escapeXml='false'</b>: <c:out value="${jstlResultHTML}" escapeXml="false"/></p>

                        <p>With <b>escapeXml='true'</b> : <c:out value="${jstlResultHTML}" escapeXml="true"/></p>

                    </c:if>



                    <br />
                    <c:set var="dateVar" value="<%=new java.util.Date()%>"/>
                    Date format: <span><fmt:formatDate value="${dateVar}" pattern="dd MMM yyyy"/> </span>
                    <br />
                    <c:set var="number" value="666777999" />
                    Number Format: <b><fmt:formatNumber type="number" groupingUsed="true" value="${number}"/></b>
                    <br/>

                    <br />
                    <c:catch var="exceptionVar">
                        ${someNotExistedMethod()}
                    </c:catch>

                    <b>
                        <c:if test="${not empty exceptionVar}">
                            <p style="color:red">Exception msg example: </p>${exceptionVar}
                        </c:if>
                    </b>
                </div>
            </div>
            <!-- /.row -->

            <hr>

        </div>
        <!-- /.container -->

    </jsp:body>
</page:template>


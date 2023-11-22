<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
            <center>
                <h2><h:outputText value="- Login Records - "/></h2>
           
                <h:dataTable value="#{pImpl.login()}" var="l" border="3">
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Username" />
                        </f:facet>
                        <h:outputText value="#{l.username}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Password" />
                        </f:facet>
                        <h:outputText value="#{l.password}"/>
                    </h:column>
                  </h:dataTable>
            </center>
        </h:form>
    </body>
</html>
</f:view>

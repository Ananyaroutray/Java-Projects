<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE html>
<f:view>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h:form>
        		
                <h2><h:outputText value="Insurance Plans"/></h2>
           
        <h:dataTable value="#{InsuPlans.showInsurancePlan()}" var="i" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Plan Id" />
                    </f:facet>
                    <h:outputText value="#{i.planId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Insurance id" />
                    </f:facet>
                    <h:outputText value="#{i.insuranceId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="premium amount" />
                    </f:facet>
                    <h:outputText value="#{i.premiumAmount}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="cov Amount" />
                    </f:facet>
                    <h:outputText value="#{i.covAmount}"/>
                </h:column>
                    
       </h:dataTable>
        
        </h:form>
    </body>
</html>
</f:view>


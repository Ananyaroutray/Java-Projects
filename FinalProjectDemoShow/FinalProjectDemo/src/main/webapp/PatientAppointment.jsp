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
                <h2><h:outputText value="Appoint Details"/></h2>
           
        <h:dataTable value="#{appointment.showPatientAppointmenDAO()}" var="p" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Appoint Id" />
                    </f:facet>
                    <h:outputText value="#{p.appointmentId}"/>
                </h:column>
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Provider Id" />
                    </f:facet>
                    <h:outputText value="#{p.providerid}"/>
                </h:column>
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="uhId" />
                    </f:facet>
                    <h:outputText value="#{p.uhId}"/>
                </h:column>
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="department" />
                    </f:facet>
                    <h:outputText value="#{p.department}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="First Name" />
                    </f:facet>
                    <h:outputText value="#{p.firstName}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">	
                    	<h:outputLabel value="Last Name" />
                    </f:facet>
                    <h:outputText value="#{p.lastName}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">	
                    	<h:outputLabel value="Appointment Date" />
                    </f:facet>
                    <h:outputText value="#{p.appointmentDate}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">	
                    	<h:outputLabel value="Appointment Time" />
                    </f:facet>
                    <h:outputText value="#{p.appointmentTime}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">	
                    	<h:outputLabel value="Reason" />
                    </f:facet>
                    <h:outputText value="#{p.reason}"/>
                </h:column>
                   
                    <h:column>
                     <f:facet name="header">	
                    	<h:outputLabel value="Status" />
                    </f:facet>
                    <h:outputText value="#{p.status}"/>
                </h:column>
                                                                                           
        </h:dataTable> <br><br>
    
       
         </center>
        </h:form>
    </body>
</html>
</f:view>
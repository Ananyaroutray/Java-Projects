<%@ page contentType="text/html" %>
<%@ page pageEncoding="UTF-8" %>

<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<f:view>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Patient Report</title>
    </head>
    <body>
        <center>
            <h2>
                <h:outputText value="Add Patient Report" />
            </h2>
        </center>
        <h:form id="form">
            <h:outputText value="Patient ID" />
            <h:inputText id="pid" value="#{patientReport.pid}" /><br/>

            <h:outputText value="Test Code" />
            <h:inputText id="testCode" value="#{patientReport.testCode}" /><br/>

            <h:outputText value="Test Name" />
            <h:inputText id="testName" value="#{patientReport.testName}" /><br/>

            <h:outputText value="Test Description" />
            <h:inputText id="testDescription" value="#{patientReport.testDescription}" /><br/>

            <h:outputText value="Cost" />
            <h:inputText id="cost" value="#{patientReport.cost}" /><br/>

            <h:outputText value="Comments" />
            <h:inputText id="comments" value="#{patientReport.comments}" /><br/>

            <h:commandButton action="#{patientReportController.addPatientReportEjb(patientReport)}" value="Add" />
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <h:commandButton type="reset" value="Reset"></h:commandButton>

        </h:form>
    </body>
    </html>
</f:view>
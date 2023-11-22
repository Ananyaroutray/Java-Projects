
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>

<style>
body {
	background-image: url("Image2.png");
	background-size: cover;
	height: 600px;
	margin: 0; /* Remove default margin */
	font-family: 'Arial', sans-serif; /* Set a default font */
	color: #ffffff; /* Set default text color */
}

h2 {
	color: #ffffff; /* Set heading color */
}

thead {
	background-color: #036ffc;
	color: #ffffff;
}

.dataTable {
	width: 100%;
	text-align: center;
	border-collapse: collapse;
	margin-top: 20px; /* Add some space above the table */
}

h:column, h:commandButton, h:outputLabel, h:inputText {
	padding: 10px;
	text-align: left;
}

h:commandButton {
	background-color: #4CAF50;
	color: white;
	border: none;
	padding: 10px 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	cursor: pointer;
	border-radius: 5px;
}

h:commandButton:disabled {
	background-color: #ddd;
	color: #666;
	cursor: not-allowed;
}

h:outputText {
	display: block;
	margin-bottom: 5px;
}

h:message {
	color: red;
}
</style>
</head>
<body>
	<h:form>
        <center>
                <h2><h:outputText value="Patient Records"/></h2>
            </center>
	<h:dataTable value="#{patientList}" var="e" border="5"
		styleClass="dataTable">
		<h:column>
			<f:facet name="header">
				<h:outputText value="Customer Id" />
			</f:facet>
			<h:outputText value="#{e.uhId}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Appointment Id" />
			</f:facet>
			<h:outputText value="#{e.appointmentId}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="First Name" />
			</f:facet>
			<h:outputText value="#{e.firstName}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Last Name" />
			</f:facet>
			<h:outputText value="#{e.lastName}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Department" />
			</f:facet>
			<h:outputText value="#{e.department}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Reason" />
			</f:facet>
			<h:outputText value="#{e.reason}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Appointment Date" />
			</f:facet>
			<h:outputText value="#{e.appointmentDate}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Appointment Time" />
			</f:facet>
			<h:outputText value="#{e.appointmentTime}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Status" />
			</f:facet>
			<h:outputText value="#{e.status}" />
		</h:column>
	</h:dataTable>

</h:form>
</body>
	</html>
</f:view>
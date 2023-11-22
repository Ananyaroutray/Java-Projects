<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Add Agent</title>
        </head>
        <body>
            <h:form>
                <center>
                    <h2>Add Agent Record</h2>
                </center>
                <hr/>
                Agent ID:
                <h:inputText id="agentId" value="#{addAgent.agentId}" /><br/>
                Name:
                <h:inputText id="name" value="#{addAgent.name}" /><br/>
                City:
                <h:inputText id="city" value="#{addAgent.city}" /><br/>
                Gender:
                <h:inputText id="gender" value="#{addAgent.gender}" /><br/>
                MaritalStatus:
                <h:inputText id="maritalStatus" value="#{addAgent.maritalStatus}" /><br/>                
                Premium:
                <h:inputText id="salary" value="#{addAgent.premium}" /><br/>
                <h:commandButton value="Update" action="#{ejbImpl.addAgentEjb(addAgent)}" />
            </h:form>
        </body>
    </html>
</f:view>
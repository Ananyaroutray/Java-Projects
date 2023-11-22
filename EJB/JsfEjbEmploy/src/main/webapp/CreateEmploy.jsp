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
                <h:inputText id="agentId" value="#{agent.agentId}" /><br/>
                Name:
                <h:inputText id="name" value="#{agent.name}" /><br/>
                 City:
                <h:inputText id="city" value="#{agent.city}" /><br/>
                Gender:
                <h:selectOneMenu id="gender" value="#{agent.gender}">
                    <f:selectItem itemValue="MALE" itemLabel="Male" />
                    <f:selectItem itemValue="FEMALE" itemLabel="Female" />
                </h:selectOneMenu><br/>
                MaritalStatus:
                <h:inputText id="maritalStatus" value="#{agent.maritalStatus}" /><br/>               
                Premium:
                <h:inputText id="premium" value="#{agent.premium}" /><br/>
                <h:commandButton value="Insert" action="#{agentBean.addAgentEjb(agent)}" />
            </h:form>
        </body>
    </html>
</f:view>

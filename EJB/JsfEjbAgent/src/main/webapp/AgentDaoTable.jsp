<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Agent Records</title>
        </head>
        <body>
            <h:form>
                <center>
                    <h2><h:outputText value="Agent Records"/></h2>
                </center>

                <h:dataTable value="#{ejbImpl.showAgentEjb()}" var="agent" border="3">
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Agent ID" />
                        </f:facet>
                        <h:outputText value="#{agent.agentId}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Name" />
                        </f:facet>
                        <h:outputText value="#{agent.name}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="City" />
                        </f:facet>
                        <h:outputText value="#{agent.city}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Gender" />
                        </f:facet>
                        <h:outputText value="#{agent.gender}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="MaritalStatus" />
                        </f:facet>
                        <h:outputText value="#{agent.maritalStatus}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Premium" />
                        </f:facet>
                        <h:outputText value="#{agent.premium}"/>
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Search" />
                        </f:facet>
                        <h:commandButton action="#{ejbImpl.searchEmployEjb(agent.agentId)}" value="Search" />
                    </h:column>

                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Delete" />
                        </f:facet>
                        <h:commandButton action="#{ejbImpl.deleteAgentEjb(agent.agentId)}" value="Delete" />
                    </h:column>
                </h:dataTable>

                <center>
                    <h:commandButton action="CreateAgent.jsp?faces-redirect=true" value="Add Agent" />
                </center>
            </h:form>
        </body>
    </html>
</f:view>

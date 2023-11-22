<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<f:view>
    <html>
        <head>
            <style>
                body {
                    font-family: 'Arial', sans-serif;
                    background-color: #f4f4f4;
                }

                #form {
                    max-width: 400px;
                    margin: 50px auto;
                    padding: 20px;
                    background-color: #fff;
                    border: 1px solid #ddd;
                    border-radius: 5px;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                }

                h2 {
                    color: #333;
                }

                h:outputText {
                    display: block;
                    margin-bottom: 5px;
                }

                h:inputText {
                    width: 100%;
                    padding: 8px;
                    margin-bottom: 10px;
                    box-sizing: border-box;
                }

                h:commandButton {
                    background-color: #4caf50;
                    color: #fff;
                    padding: 10px 15px;
                    border: none;
                    border-radius: 3px;
                    cursor: pointer;
                }

                h:commandButton[type="reset"] {
                    background-color: #f44336;
                }
            </style>
        </head>
        <body>
            <h:form id="form">
                <h2>Recipient Login</h2>
                <h:outputText value="User Name" />
                <h:inputText id="name" value="#{login.userName}" />
                <br />
                <br />	
                <h:outputText value="Password" />
                <h:inputText id="Password" value="#{login.password}" />
                <br />
                <h:commandButton action="#{loginImpl.loginDao(login)}" value="Login" />
                <h:commandButton type="reset" value="Reset" />
            </h:form>
        </body>
    </html>
</f:view>

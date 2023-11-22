package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class EjbAgentImpl {
	public List<Agent> showAgentEjb() throws NamingException, ClassNotFoundException, SQLException {
		AgentEjbBeanRemote remote = 
				RemoteHelper.lookupRemoteStatelessAgent();
		 return remote.showAgent();
		}
	
	public String searchEmployEjb(int agentId) throws NamingException, ClassNotFoundException, SQLException {
		AgentEjbBeanRemote remote = 
				RemoteHelper.lookupRemoteStatelessAgent();
		Agent agent = remote.searchAgent(agentId);
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();		
		 sessionMap.put("editAgent", agent);
		 return "UpdateAgent.jsp?faces-redirect=true";
	}
	public String updateAgentEjb(Agent agent) throws ClassNotFoundException, SQLException, NamingException {
		AgentEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessAgent();
		remote.updateAgent(agent);
		return "AgentDaoTable.jsp?faces-redirect=true";
	}
	public String deleteAgentEjb(int agentId) throws NamingException, ClassNotFoundException, SQLException {
		AgentEjbBeanRemote remote = 
				RemoteHelper.lookupRemoteStatelessAgent();
		remote.deleteAgent(agentId);
		return "AgentDaoTable.jsp?faces-redirect=true";		
	}
	public String addAgentEjb(Agent agent) throws NamingException, ClassNotFoundException, SQLException {	
	AgentEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessAgent();
	remote.createAgent(agent);
	return "AgentDaoTable.jsp?faces-redirect=true";
	}

}

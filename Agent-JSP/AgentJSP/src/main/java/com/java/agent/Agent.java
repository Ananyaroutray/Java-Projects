package com.java.agent;

public class Agent {
	
		private int agentId;
		private String Name;
		private String city;
		private Gender gender;
		private String maritalStatus;
		private double premium;
		public int getAgentId() {
			return agentId;
		}
		public void setAgentId(int agentId) {
			this.agentId = agentId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public String getMaritalStatus() {
			return maritalStatus;
		}
		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		public double getPremium() {
			return premium;
		}
		public void setPremium(double premium) {
			this.premium = premium;
		}
		@Override
		public String toString() {
			return "Agent [agentId=" + agentId + ", Name=" + Name + ", city=" + city + ", gender=" + gender
					+ ", maritalStatus=" + maritalStatus + ", premium=" + premium + "]";
		}
		public Agent(int agentId, String name, String city, Gender gender, String maritalStatus, double premium) {
			super();
			this.agentId = agentId;
			Name = name;
			this.city = city;
			this.gender = gender;
			this.maritalStatus = maritalStatus;
			this.premium = premium;
		}
		public Agent() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
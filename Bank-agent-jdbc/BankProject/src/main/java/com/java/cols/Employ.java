package com.java.cols;

public class Employ {
	
	private int Empno;
	private String Name;
	private int basic;
	public int getEmpno() {
		return Empno;
	}
	public void setEmpno(int empno) {
		Empno = empno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public Employ(int empno, String name, int basic) {
		super();
		Empno = empno;
		Name = name;
		this.basic = basic;
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [Empno=" + Empno + ", Name=" + Name + ", basic=" + basic + "]";
	}
	
	
	
	

}

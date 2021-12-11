package hu.webuni.hr.model;

import java.time.LocalDateTime;

public class Employee {
	public Employee(long iEmployeeID, String sEmployeeName, String sEmployeeRole, int iMonthlySalary,
			LocalDateTime dtStartTime) {
		super();
		this.iEmployeeID = iEmployeeID;
		this.sEmployeeName = sEmployeeName;
		this.sEmployeeRole = sEmployeeRole;
		this.iMonthlySalary = iMonthlySalary;
		this.dtStartTime = dtStartTime;
	}
	
	
	private long iEmployeeID;
	private String sEmployeeName;
	private String sEmployeeRole;
	private int iMonthlySalary;
	private LocalDateTime dtStartTime;
	public long getiEmployeeID() {
		return iEmployeeID;
	}
	public void setiEmployeeID(long iEmployeeID) {
		this.iEmployeeID = iEmployeeID;
	}
	public String getsEmployeeName() {
		return sEmployeeName;
	}
	public void setsEmployeeName(String sEmployeeName) {
		this.sEmployeeName = sEmployeeName;
	}
	public String getsEmployeeRole() {
		return sEmployeeRole;
	}
	public void setsEmployeeRole(String sEmployeeRole) {
		this.sEmployeeRole = sEmployeeRole;
	}
	public int getiMonthlySalary() {
		return iMonthlySalary;
	}
	public void setiMonthlySalary(int iMonthlySalary) {
		this.iMonthlySalary = iMonthlySalary;
	}
	public LocalDateTime getDtStartTime() {
		return dtStartTime;
	}
	public void setDtStartTime(LocalDateTime dtStartTime) {
		this.dtStartTime = dtStartTime;
	} 

}

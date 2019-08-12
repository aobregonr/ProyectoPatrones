package beans;

import java.sql.Date;

public class Employee extends Person {

	private Date startDate;
	private String backUpEmployee;
	private int vacationDays;
	private double salary;
	
	public Employee() {
		
	}
	
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getBackUpEmployee() {
		return backUpEmployee;
	}
	public void setBackUpEmployee(String backUpEmployee) {
		this.backUpEmployee = backUpEmployee;
	}
	public int getVacationDays() {
		return vacationDays;
	}
	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}

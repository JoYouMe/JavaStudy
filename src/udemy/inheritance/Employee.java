package udemy.inheritance;

import java.math.BigDecimal;

public class Employee extends Person{

	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;
	
	public Employee(String name, String title) {
		// 하위 클래스 생성자는 무조건 상위 생성자가 정의되어야 함
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString() + title +"#" + employerName+"#"+employeeGrade+"#";
	}

	
}

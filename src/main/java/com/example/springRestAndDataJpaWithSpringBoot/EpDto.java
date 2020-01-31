package com.example.springRestAndDataJpaWithSpringBoot;

public class EpDto {

	private String empPro;
	public String getEmpPro() {
		return empPro;
	}
	public void setEmpPro(String empPro) {
		this.empPro = empPro;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	private String empName;
	public EpDto(String empPro, String empName) {
		super();
		this.empPro = empPro;
		this.empName = empName;
	}
	
}

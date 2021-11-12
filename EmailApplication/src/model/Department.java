package model;

public class Department {
	private String DeptName;
	public Department() {
		
	}
	public Department(String DeptName) {
		this.DeptName=DeptName;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String DeptName){
		this.DeptName = DeptName;
	}
	@Override
	public String toString() {
		return "Department [DeptName=" + DeptName + "]";
	}
	}


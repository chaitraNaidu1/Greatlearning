package driver;


import java.util.Scanner;

import greatlearning.CredentialService;
import model.Department;
import model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		Employee employee=new Employee("Chaitra","naidu");
		System.out.println("enter your department");
		System.out.println("1.Technical\n2. Admin\n3.HR\n4.Legal");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		Department department=new Department();
		CredentialService service=new CredentialService();
		switch(choice){
	case 1:
		
		department.setDeptName("Technical");
		String email= service.generateEmail(employee, department);
		String password=service.generatePassword();
		service.showCredentials(email, password);
		break;
	case 2:
		department.setDeptName("Admin");
		email=service.generateEmail(employee, department);
		password=service.generatePassword();
		service.showCredentials(email, password);
		break;
	case 3:
		department.setDeptName("HR");
		email=service.generateEmail(employee, department);
		password=service.generatePassword();
		service.showCredentials(email, password);
		break;
	case 4:
		department.setDeptName("Legal");
		email=service.generateEmail(employee, department);
		password=service.generatePassword();
		service.showCredentials(email, password);
		break;
			
	}
	}
}


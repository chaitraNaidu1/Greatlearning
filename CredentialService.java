package greatlearning;

import java.util.Random;

import model.Department;
import model.Employee;

public class CredentialService {
	public String generateEmail(Employee employee,Department DeptName) {
		String email=employee.getFirstname()+employee.getLastname()+"@"+DeptName.getDeptName()+".company.com";
		return email;

	}

	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
        String values = capitalLetters + smallLetters + numbers + specialCharacters;
        Random obj1=new Random();
        char password[]=new char[8];
        for (int i=0;i<8;i++) 
        {
			password[i]=
			
        			values.charAt(obj1.nextInt(values.length()));
        	
        }
        return password.toString();
	}
	
	public void showCredentials(String email, String password){ 
		System.out.println("+email+, +password");
		
	}
}



import java.util.Scanner;

public class Student extends Person{
    
   
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    protected String status;

    public Student(String name, String address,  
		String phone, String email, String status) {
		super(name, address, phone, email);
		this.status = status;
	}

    public Student(String name, String status) {
        super.setName(name);
        this.status = status;
    }

    public String getStatus() {
		return status;
	}
    
    public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}
    
    

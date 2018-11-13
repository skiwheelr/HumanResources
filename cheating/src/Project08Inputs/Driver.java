
package Project08Inputs;
import java.util.Scanner;

public class Driver {
   
    public void driveXyz(){
        
int studentOrEmployee;
int facultyOrStaff;
MyDate date;

Scanner input = new Scanner(System.in);

System.out.println("Enter");
System.out.println("1)To create a student:");
System.out.print("2)To create and employee: ");
studentOrEmployee= input.nextInt();

System.out.print("\n Enter name: ");
String name = input.nextLine();
System.out.print("\n Enter address: ");
String address = input.nextLine();
System.out.print("\n Enter phone number: ");
String phone = input.nextLine();
System.out.print("\n Enter email ");
String email = input.nextLine();

if (studentOrEmployee==1) {
System.out.print("\n Enter student’s status: ");
String classStanding = input.nextLine();
System.out.println(Student.toString());
}

else if ( studentOrEmployee==2) {

facultyOrStaff= input.nextInt();
if (facultyOrStaff==1) {
System.out.print("\nEnter office number: ");
int office = input.nextInt();
System.out.print("\nEnter salary");
int salary = input.nextInt();
System.out.print("\nEnter date hired: ");
String dateHired = input.nextLine();
System.out.print("\nEnter office hours: ");
String hours = input.nextLine();
System.out.print("\nEnter rank: ");
String rank = input.nextLine();
System.out.println(faculty.toString() + "\n"); 
}   
else if (facultyOrStaff==2) {
System.out.print("\nEnter office number: ");
System.out.print("\nEnter office title: ");
String title = input.nextLine();
System.out.println(staff.toString() + "\n");
}
}

Person person = new Person(name,address, phone, email);
Person student = new Student(name, classStanding, address, phone, email);
Person employee = new Employee(name, address, phone, email, office, salary, dateHired);
Person faculty = new Faculty(name, rank, salary, dateHired, hours, address, phone, email, office);
Person staff = new Staff(name, title, address, phone, email, office, salary, dateHired);
}
}
        /*
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("press one for student or two for employee");
        String s = sc.nextLine();
        boolean b;
    
        if(s.equals("1")) b = true;
        else b = false;
                System.out.println("Enter a name:");
        String name = sc.nextLine();
                System.out.println("Enter address:");
        String address = sc.nextLine();
                System.out.println("Enter Phone");
        String phone = sc.nextLine();
                System.out.println("Enter Email");
        String email = sc.nextLine();
        
        if (b == true) System.out.print("What grade?");
        //student.sc.nextLine();
        
        if(b == false) System.out.print("Press one for faculty or two for staff");
        boolean emp;
        
        String 2Q = sc.nextLine();
        if(2Q == "1") emp = true;
        System.out.println("Enter an office number");
        String hours = sc.nextLine();
        Faculty instructor = new Faculty();
        instructor.setOfficeHours(hours);
        
    }*/
    

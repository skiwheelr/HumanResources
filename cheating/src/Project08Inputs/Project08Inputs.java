
package Project08Inputs;
import java.util.Scanner;

public class Project08Inputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      //  Driver.driveXyz();
        
        
        //date = sc.nextLine("Enter a date");
        MyDate date = new MyDate("03/03/2991");
        
        Person person = new Person("person");
        Student student = new Student("student");
        Employee employee = new Employee("employee",22,"blh",date);
        Faculty faculty = new Faculty("faculty");
        Staff staff = new Staff("staff");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
    
}

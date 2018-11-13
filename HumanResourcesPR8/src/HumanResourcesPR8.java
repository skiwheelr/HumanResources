

/*
 * Class: CMSC201 
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: MM/DD/YYYY (<11/05/2017>)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: MARK WAGNER
*/
import java.util.Scanner;

public class HumanResourcesPR8 {
  public static void main(String[] args)
  
 {
   
 MyDate date = new MyDate("03,03,2015");
       
 Person person = new Person("Johnny", "123 Maple Street", "000-000-0000", "Johnny@yahoo.com"); //super class(name, address, number, email address)
 
 
 Person student = new Student("Pam", "321 Emerson Dr.", "111-111-1111", "Pam@yahoo.com", "Freshman"); //subclass of Person (name, address, number, email, class status)
 
 
 Person employee = new Employee("Sammy", "555 Java street", "222-222-2222", "Sammy@yahoo.com",
         "office 1A", "$50000", date); //subclass of Person (name, address, number, email, office, salary, date hired)
 
 
 Person faculty = new Faculty("Maddie", "333 Dog Street", "333-333-3333",
         "Dogpark@yahoo.com", "Office 2B", "$30000", date, "7-2", "rank"); //subclass of Employee (name, address, number, email, office, salary, date hired, office hours, rank)
 
 
 Person staff = new Staff("Dell", "932 Dell Street", "444-444-4444", "Dell@yahoo.com",
         "office 3C", "$20000", date, "title"); //subclass of Employee (name, address, number, email, office, salary, date hired, title)
 
 
 System.out.println(person.toString() + "\n");
 System.out.println(student.toString() + "\n");
 System.out.println(employee.toString() + "\n");
 System.out.println(faculty.toString() + "\n");
 System.out.println(staff.toString() + "\n");
    }
}
    
 

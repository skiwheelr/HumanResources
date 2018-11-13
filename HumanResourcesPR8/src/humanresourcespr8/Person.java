
package humanresourcespr8;
import java.util.Scanner;

public class Person {
       private String name, address, phone, email;
 
    public Person()
    {
 
    }
 
    public Person(String name, String address, String phone, String email)
       {
       this.name = name;
       this.address = address;
       this.phone = phone0;
       this.email = email;
       }
 
    public String getName()
       {
       return name;
       }
 
    public void setName(String name)
       {
       this.name = name;
       }
 
    public String getAddress()
       {
       return address;
       }
 
    public void setAddress(String address)
       {
       this.address = address;
       }
 
    public String getPhone()
       {
       return phone;
       }
 
    public void setPhone(String phone)
       {
       this.phone = phone;
       }
 
    public String getEmail()
       {
       return phone;
       }
 
    public void setEmail(String email)
       {
       this.email = email;
       }
 
    
    public String toString()
       {
       return getClass().getName() + "\n" + name;
       }
     /*
    private String name;
    protected String address;
    protected String phone;
    protected String email;
    
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phone;
    }

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }

*/
    }
            

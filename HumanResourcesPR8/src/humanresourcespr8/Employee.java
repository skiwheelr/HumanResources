public class Employee extends Person {

{
 private String office,salary;
 private MyDate  DATE_HIRED;

 public Employee()
    {

    }

    public Employee(String office, String salary, MyDate DATE_HIRED)
       {
       this.office = office;
       this.salary = salary;
       this.DATE_HIRED = DATE_HIRED;
       }
    public String office()
       {
       return office;
       }

    public void setOffice(String office)
       {
       this.office = office;
       }

    public String getSalary()
       {
       return salary;
       }

    public void setSalary(String salary)
       {
       this.salary = salary;
       }

    public MyDate getMyDate()
       {
       return DATE_HIRED;
       }
 }
    /*
    protected double salary;
    protected String office;
    public MyDate dateHired;

    public Employee(String name) {
        this(name, 0, "none", new MyDate());
    }

    public Employee(String name, double salary, String office, MyDate dateHired) {
        super(name);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    
    public String toString() {
        return "Name: " + super.getName() + " Class: " + super.getClass().getName();
    }
    */
}
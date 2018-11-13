 class Employee extends Person {


 private String office, salary;
 private MyDate dateHired;

 public Employee()
    {

    }

    public Employee(String office, String salary, MyDate dateHired)
       {
       this.office = office;
       this.salary = salary;
       this.dateHired = dateHired;
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
       return dateHired;
       }
 }
    
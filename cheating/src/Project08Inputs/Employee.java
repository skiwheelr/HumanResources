/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project08Inputs;

/**
 *
 * @author Terrapin
 */
public class Employee extends Person {
    
    MyDate date = new MyDate("03/03/1995");
    
    protected double salary;
    protected String office;
    protected MyDate dateHired;

//    public Employee(String name) {
//        super(name);
//    }

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

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}

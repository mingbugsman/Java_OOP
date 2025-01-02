package EmployeeOOP;

public abstract class Employee implements IEmployee{
    public String name;
    private double _salary;

    public Employee(String name, double salary) {
        this.name = name;
        this._salary = salary;
    }

    public double getSalary() {
        return this._salary;
    }
    public void setSalary(double salary) {
        _salary = salary;
    }
    public void Display_Info() {
        System.out.println("Employee name : " + name);
        System.out.println("Employee Salary : " + _salary);
    }
}

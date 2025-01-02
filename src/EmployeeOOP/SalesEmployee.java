package EmployeeOOP;

public class SalesEmployee extends Employee {
    private double salesAmount;

    // constructor cua lop cha dc goi thong qua super
    public SalesEmployee(String name, double salesAmount, double salary) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }
    // override display_info cua lop cha
    @Override
    public void Display_Info() {
        super.Display_Info();
        System.out.println("Sales amount : "+ this.salesAmount);
    }
    void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
    double getSalesAmount() {
        return this.salesAmount;
    }

}

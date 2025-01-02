package EmployeeOOP;

public class Manager extends Employee {
    double bonus;

    public Manager(String name, double Salary, double bonus) {
        super(name,Salary);
        this.bonus = bonus;
    }
    @Override
    public void Display_Info() {
        super.Display_Info();  // Gọi phương thức displayInfo() của lớp cha
        System.out.println("Bonus: " + bonus);
    }

}

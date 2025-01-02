package EmployeeOOP;

public class EmployeeFactory {

    public static IEmployee createEmployee(EmployeeType type, String name, double salary, double extraMoney) {
        return switch (type) {
            case SALES -> new SalesEmployee(name, salary, extraMoney);
            case MANAGER -> new Manager(name, salary, extraMoney);
            default -> null;
        };
    }
}

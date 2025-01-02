import EmployeeOOP.EmployeeFactory;

import EmployeeOOP.EmployeeType;
import EmployeeOOP.IEmployee;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        IEmployee employee = EmployeeFactory.createEmployee(EmployeeType.SALES, "Quang", 5000, 1229);
        assert employee != null;
        employee.Display_Info();
        kb.close();
    }


}


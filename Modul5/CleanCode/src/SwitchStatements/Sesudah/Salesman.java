package SwitchStatements.Sesudah;

import SwitchStatements.Sebelum.Employee;

public class Salesman {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}

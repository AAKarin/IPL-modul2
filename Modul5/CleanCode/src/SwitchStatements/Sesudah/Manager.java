package SwitchStatements.Sesudah;

import SwitchStatements.Sebelum.Employee;

public class Manager {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}

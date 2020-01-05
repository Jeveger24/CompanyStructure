public class BusinessEmployee extends Employee {
    private static double baseSalary = 50000;
    private static double bonusBudget;

    public BusinessEmployee(String name) {
        super(name, baseSalary);
    }

    public double getBaseSalaryBL() {
        return baseSalary * 2;
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public String employeeStatus() {
        return super.employeeStatus();
    }
}


public class TechnicalEmployee extends Employee{
    private static double baseSalary = 75000;

    public TechnicalEmployee(String name) {
        super(name, baseSalary);
    }

    public double getBaseSalaryTL() {
        return baseSalary * 1.3;
    }

    public String employeeStatus() {
        return super.employeeStatus();
    }
}
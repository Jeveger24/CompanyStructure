public class Employee {
    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;
    private double bonus;

    private static int id = 0;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.id++;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        employeeID = this.id;
        return employeeID;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Employee other) {
        if (this.employeeID == other.getEmployeeID()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "\"" + getEmployeeID() + " " + getName() + "\"";
    }

    public String employeeStatus() {
        return "\"" + getEmployeeID() + " " + getName();
    }
}

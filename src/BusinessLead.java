import java.util.ArrayList;
import java.util.List;

public class BusinessLead extends BusinessEmployee {
    private static double baseSalary;
    List<Employee> reports = new ArrayList<Employee>();
    private static int headcount;
    private static double bonusBudget;

    public BusinessLead(String name) {
        super(name);
        baseSalary = getBaseSalaryBL();
    }

    public boolean hasHeadCount() {
        headcount = reports.size();
        if (headcount < 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            reports.add(e);
            e.setManager(this);
            bonusBudget += 1.1 * e.getBaseSalary();
            e.supportTeam(supportTeam);
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (bonus < this.bonusBudget) {
            e.setBonus(bonus);
            this.bonusBudget -= bonus;
            return true;
        } else {
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus) {
        if (reports == e.getManager()) {
            if (bonus < getBonusBudget()) {
                e.setBonus(bonus);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getTeamStatus() {
        if (reports.size() == 0) {
            return employeeStatus() + " and no direct reports yet";
        } else {
            return employeeStatus() + " and is managing:/n " + teamList() + "\"";
        }
    }

    public String teamList() {
        for (int i = 0; i <= reports.size(); i++) {
            return reports.get(i).employeeStatus();
        }
        return null;
    }
}

import java.util.ArrayList;
import java.util.List;

public class TechnicalLead extends TechnicalEmployee {
    private static double baseSalary;
    List<Employee> reports = new ArrayList<Employee>();
    private static int headcount;

    public TechnicalLead(String name) {
        super(name);
        baseSalary = getBaseSalaryTL();

    }

    public boolean hasHeadCount() {
        headcount = reports.size();
        if (headcount < 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addReport(SoftwareEngineer e) {
        if (hasHeadCount()) {
            reports.add(e);
            e.setManager(this);
            return true;
        } else {
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        if (reports.contains(e) && e.getCodeAccess()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus) {
        return true;
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

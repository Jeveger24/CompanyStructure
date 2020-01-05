import java.util.List;

public class Accountant extends BusinessEmployee {
    private static double bonusBudget;
    private TechnicalLead supportedTeam;

    public Accountant(String name) {
        super(name);
        this.bonusBudget = 0;
    }

    public TechnicalLead getTeamSupported() {
        return supportedTeam;
    }

    public void supportTeam(TechnicalLead lead) {
        this.supportedTeam = lead;
        int reportSize = this.supportedTeam.reports.size();
        double baseSalary = this.supportedTeam.getBaseSalary();
        double percent = (reportSize * baseSalary) * 10/100;
        this.bonusBudget = (reportSize * baseSalary) + (percent);
        System.out.println(this.bonusBudget);
    }

    public boolean approveBonus(double bonus) {
        if (bonus > bonusBudget) {
            return false;
        } else if (supportedTeam.getEmployeeID() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public String employeeStatus() {
        return "\"" + getEmployeeID() + " " + getName() + " with a budget of " + bonusBudget + " is supporting " + supportedTeam.getName() + "\"";
    }
}

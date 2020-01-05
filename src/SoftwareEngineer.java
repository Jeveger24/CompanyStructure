public class SoftwareEngineer extends TechnicalEmployee {
    private static int checkIns;
    private boolean access;

    public SoftwareEngineer(String name) {
        super(name);
        checkIns = 0;
        access = false;
    }

    public boolean getCodeAccess() {
        if (access) {
            return true;
        } else {
            return false;
        }
    }

    public void setCodeAccess(boolean externalAccess) {
        this.access = externalAccess;
    }

    public int getSuccesfulCheckIns() {
        return checkIns;
    }

    public boolean checkInCode() {
        TechnicalLead manager = ((TechnicalLead) this.getManager());
        if (manager.approveCheckIn(this)) {
            checkIns++;
            return true;
        } else {
            setCodeAccess(false);
            return false;
        }
    }

    public String employeeStatus() {
        return super.employeeStatus() + " has " + getSuccesfulCheckIns() + " succesful check ins";
    }
}

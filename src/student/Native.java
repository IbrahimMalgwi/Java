package student;

public class Native {
    private String firstName;
    private String lastName;
    private int cohortID;
    private int scvId;

    public String getScvId() {
        if (cohortID == 12) {
            return "SCV-UNICORNS" + scvId;
        }
        return "SCV" + cohortID+ scvId;
    }

    public void setScvId(int scvId) {
        this.scvId = scvId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCohortID() {
        return cohortID;
    }

    public void setCohortID(int cohortID) {
        if (cohortID!= 12){
//            do nothing
        } else {
            this.cohortID = cohortID;
        }
    }
}

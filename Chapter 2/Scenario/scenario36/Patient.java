package scenario36;

public class Patient {
    private String ssn;
    private String medicalHistory;
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getMedicalHistory() {
        return medicalHistory;
    }
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    public Patient(String ssn, String medicalHistory) {
        this.ssn = ssn;
        this.medicalHistory = medicalHistory;
    }
    public Patient() {
    }
    
}

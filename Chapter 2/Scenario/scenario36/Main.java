package scenario36;

public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient("123-456","Diabities");
        // System.out.println(patient.ssn);
        // System.out.println(patient.medicalHistory);
        System.out.println(patient.getSsn());
        System.out.println(patient.getMedicalHistory());
    }
}

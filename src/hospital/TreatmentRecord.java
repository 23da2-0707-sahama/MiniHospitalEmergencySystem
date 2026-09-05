package hospital;


public class TreatmentRecord {

    private int patientId;
    private String patientName;
    private String treatment;
    private String doctorName;

    public TreatmentRecord(int patientId,
                           String patientName,
                           String treatment,
                           String doctorName) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.treatment = treatment;
        this.doctorName = doctorName;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getDoctorName() {
        return doctorName;
    }

    @Override
    public String toString() {

        return "Patient ID: " + patientId +
                ", Patient: " + patientName +
                ", Doctor: " + doctorName +
                ", Treatment: " + treatment;
    }
}


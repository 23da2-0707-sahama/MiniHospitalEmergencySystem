package hospital;


public class Visit {

    private int visitId;
    private String visitDate;
    private String doctorName;

    public Visit(int visitId,
                 String visitDate,
                 String doctorName) {

        this.visitId = visitId;
        this.visitDate = visitDate;
        this.doctorName = doctorName;
    }

    public int getVisitId() {
        return visitId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public String getDoctorName() {
        return doctorName;
    }
}


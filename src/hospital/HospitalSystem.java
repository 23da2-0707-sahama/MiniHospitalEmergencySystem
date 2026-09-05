package hospital;



import java.util.Scanner;

public class HospitalSystem {

    static Scanner scanner = new Scanner(System.in);

    static PatientBST patientBST = new PatientBST();

    static EmergencyQueue emergencyQueue =
            new EmergencyQueue();

    static TreatmentStack treatmentStack =
            new TreatmentStack();

    static VisitHistory visitHistory =
            new VisitHistory();

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println(" MINI HOSPITAL EMERGENCY SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Display Patients");

            System.out.println("5. Add Emergency Patient");
            System.out.println("6. Treat Next Patient");
            System.out.println("7. Display Waiting Queue");

            System.out.println("8. Add Treatment Record");
            System.out.println("9. Remove Last Treatment");
            System.out.println("10. Display Treatment History");

            System.out.println("11. Add Patient Visit");
            System.out.println("12. Search Visit");
            System.out.println("13. Remove Visit");
            System.out.println("14. Display Visit History");

            System.out.println("0. Exit");

            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    registerPatient();
                    break;

                case 2:
                    searchPatient();
                    break;

                case 3:
                    deletePatient();
                    break;

                case 4:
                    patientBST.displayInOrder();
                    break;

                case 5:
                    addEmergencyPatient();
                    break;

                case 6:
                    treatNextPatient();
                    break;

                case 7:
                    emergencyQueue.display();
                    break;

                case 8:
                    addTreatment();
                    break;

                case 9:
                    removeLastTreatment();
                    break;

                case 10:
                    treatmentStack.display();
                    break;

                case 11:
                    addVisit();
                    break;

                case 12:
                    searchVisit();
                    break;

                case 13:
                    removeVisit();
                    break;

                case 14:
                    visitHistory.displayHistory();
                    break;

                case 0:
                    System.out.println(
                            "System closed."
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 0);
    }

    static void registerPatient() {

        System.out.print("Patient ID: ");

        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Patient Name: ");

        String name =
                scanner.nextLine();

        System.out.print("Age: ");

        int age =
                scanner.nextInt();
        scanner.nextLine();

        System.out.print("Contact Number: ");

        String contact =
                scanner.nextLine();

        System.out.print("Medical Condition: ");

        String condition =
                scanner.nextLine();

        Patient patient =
                new Patient(
                        id,
                        name,
                        age,
                        contact,
                        condition
                );

        patientBST.insert(patient);

        System.out.println(
                "Patient registered successfully."
        );
    }

    static void searchPatient() {

        System.out.print("Enter Patient ID: ");

        int id =
                scanner.nextInt();

        Patient patient =
                patientBST.search(id);

        if (patient != null) {

            System.out.println(patient);

        } else {

            System.out.println(
                    "Patient not found."
            );
        }
    }

    static void deletePatient() {

        System.out.print("Enter Patient ID: ");

        int id =
                scanner.nextInt();

        patientBST.delete(id);

        System.out.println(
                "Delete operation completed."
        );
    }

    static void addEmergencyPatient() {

        System.out.print("Enter Patient ID: ");

        int id =
                scanner.nextInt();

        Patient patient =
                patientBST.search(id);

        if (patient == null) {

            System.out.println(
                    "Patient not found."
            );

            return;
        }

        emergencyQueue.enqueue(patient);

        System.out.println(
                "Patient added to emergency queue."
        );
    }

    static void treatNextPatient() {

        Patient patient =
                emergencyQueue.dequeue();

        if (patient != null) {

            System.out.println(
                    "Treating patient:"
            );

            System.out.println(patient);
        }
    }

    static void addTreatment() {

        System.out.print("Patient ID: ");

        int id =
                scanner.nextInt();
        scanner.nextLine();

        Patient patient =
                patientBST.search(id);

        if (patient == null) {

            System.out.println(
                    "Patient not found."
            );

            return;
        }

        System.out.print("Doctor Name: ");

        String doctor =
                scanner.nextLine();

        System.out.print("Treatment: ");

        String treatment =
                scanner.nextLine();

        TreatmentRecord record =
                new TreatmentRecord(
                        patient.getPatientId(),
                        patient.getPatientName(),
                        treatment,
                        doctor
                );

        treatmentStack.push(record);

        System.out.println(
                "Treatment record added."
        );
    }

    static void removeLastTreatment() {

        TreatmentRecord record =
                treatmentStack.pop();

        if (record != null) {

            System.out.println(
                    "Removed treatment:"
            );

            System.out.println(record);
        }
    }

    static void addVisit() {

        System.out.print("Visit ID: ");

        int visitId =
                scanner.nextInt();
        scanner.nextLine();

        System.out.print("Visit Date: ");

        String date =
                scanner.nextLine();

        System.out.print("Doctor Name: ");

        String doctor =
                scanner.nextLine();

        System.out.print("Diagnosis: ");

        String diagnosis =
                scanner.nextLine();

        System.out.print("Treatment: ");

        String treatment =
                scanner.nextLine();

        Visit visit =
                new Visit(
                        visitId,
                        date,
                        doctor,
                        diagnosis,
                        treatment
                );

        visitHistory.addVisit(visit);

        System.out.println(
                "Visit added successfully."
        );
    }

    static void searchVisit() {

        System.out.print("Visit ID: ");

        int id =
                scanner.nextInt();

        Visit visit =
                visitHistory.searchVisit(id);

        if (visit != null) {

            System.out.println(visit);

        } else {

            System.out.println(
                    "Visit not found."
            );
        }
    }

    static void removeVisit() {

        System.out.print("Visit ID: ");

        int id =
                scanner.nextInt();

        visitHistory.removeVisit(id);

        System.out.println(
                "Remove operation completed."
        );
    }
}


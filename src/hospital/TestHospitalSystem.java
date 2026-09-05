package hospital;
public class TestHospitalSystem {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   MINI HOSPITAL SYSTEM TEST PROGRAM");
        System.out.println("========================================");

        testPatientBST();
        testEmergencyQueue();
        testTreatmentStack();
        testVisitHistory();

        System.out.println("\n========================================");
        System.out.println("       ALL TESTS COMPLETED");
        System.out.println("========================================");
    }

    // ==========================================
    // TEST 1: PATIENT BST
    // ==========================================

    public static void testPatientBST() {

        System.out.println("\n----------------------------------------");
        System.out.println("TEST 1: PATIENT BST");
        System.out.println("----------------------------------------");

        PatientBST bst = new PatientBST();

        Patient patient1 =
                new Patient(
                        105,
                        "Kamal",
                        25,
                        "0711111111",
                        "Fever"
                );

        Patient patient2 =
                new Patient(
                        101,
                        "Nimal",
                        30,
                        "0722222222",
                        "Headache"
                );

        Patient patient3 =
                new Patient(
                        110,
                        "Amal",
                        40,
                        "0733333333",
                        "Injury"
                );

        Patient patient4 =
                new Patient(
                        99,
                        "Sunil",
                        35,
                        "0744444444",
                        "Cough"
                );

        // Test insertion
        bst.insert(patient1);
        bst.insert(patient2);
        bst.insert(patient3);
        bst.insert(patient4);

        System.out.println("\nPatients inserted successfully.");

        // Test in-order traversal
        System.out.println("\nIn-order traversal:");

        bst.displayInOrder();

        // Test search
        System.out.println("\nSearching for Patient ID 101:");

        Patient foundPatient = bst.search(101);

        if (foundPatient != null) {
            System.out.println("PASS - Patient found:");
            System.out.println(foundPatient);
        } else {
            System.out.println("FAIL - Patient not found.");
        }

        // Test unsuccessful search
        System.out.println("\nSearching for Patient ID 500:");

        Patient notFound = bst.search(500);

        if (notFound == null) {
            System.out.println("PASS - Patient correctly not found.");
        } else {
            System.out.println("FAIL - Unexpected patient found.");
        }

        // Test deletion
        System.out.println("\nDeleting Patient ID 101:");

        bst.delete(101);

        System.out.println("Patients after deletion:");

        bst.displayInOrder();

        // Confirm deleted patient is no longer available
        if (bst.search(101) == null) {
            System.out.println("PASS - Patient successfully deleted.");
        } else {
            System.out.println("FAIL - Patient was not deleted.");
        }
    }

    // ==========================================
    // TEST 2: EMERGENCY QUEUE
    // ==========================================

    public static void testEmergencyQueue() {

        System.out.println("\n----------------------------------------");
        System.out.println("TEST 2: EMERGENCY QUEUE");
        System.out.println("----------------------------------------");

        EmergencyQueue queue =
                new EmergencyQueue();

        Patient patient1 =
                new Patient(
                        201,
                        "Patient A",
                        20,
                        "0755555555",
                        "Fever"
                );

        Patient patient2 =
                new Patient(
                        202,
                        "Patient B",
                        30,
                        "0766666666",
                        "Injury"
                );

        Patient patient3 =
                new Patient(
                        203,
                        "Patient C",
                        40,
                        "0777777777",
                        "Pain"
                );

        // Test enqueue
        queue.enqueue(patient1);
        queue.enqueue(patient2);
        queue.enqueue(patient3);

        System.out.println("\nPatients added to emergency queue.");

        System.out.println("\nCurrent queue:");

        queue.display();

        // Test FIFO
        System.out.println("\nDequeue test:");

        Patient first =
                queue.dequeue();

        if (first != null &&
                first.getPatientId() == 201) {

            System.out.println(
                    "PASS - FIFO works correctly."
            );

            System.out.println(
                    "Dequeued: " + first
            );

        } else {

            System.out.println(
                    "FAIL - FIFO order is incorrect."
            );
        }

        // Second dequeue
        Patient second =
                queue.dequeue();

        if (second != null &&
                second.getPatientId() == 202) {

            System.out.println(
                    "PASS - Second patient dequeued correctly."
            );

        } else {

            System.out.println(
                    "FAIL - Second patient order incorrect."
            );
        }

        System.out.println("\nRemaining queue:");

        queue.display();
    }

    // ==========================================
    // TEST 3: TREATMENT STACK
    // ==========================================

    public static void testTreatmentStack() {

        System.out.println("\n----------------------------------------");
        System.out.println("TEST 3: TREATMENT STACK");
        System.out.println("----------------------------------------");

        TreatmentStack stack =
                new TreatmentStack();

        TreatmentRecord record1 =
                new TreatmentRecord(
                        301,
                        "Patient X",
                        "Medication",
                        "Dr. Silva"
                );

        TreatmentRecord record2 =
                new TreatmentRecord(
                        302,
                        "Patient Y",
                        "Surgery",
                        "Dr. Perera"
                );

        TreatmentRecord record3 =
                new TreatmentRecord(
                        303,
                        "Patient Z",
                        "Check-up",
                        "Dr. Fernando"
                );

        // Test push
        stack.push(record1);
        stack.push(record2);
        stack.push(record3);

        System.out.println("\nTreatment records pushed.");

        System.out.println("\nCurrent treatment stack:");

        stack.display();

        // Test LIFO
        System.out.println("\nPop test:");

        TreatmentRecord first =
                stack.pop();

        if (first != null &&
                first.getPatientId() == 303) {

            System.out.println(
                    "PASS - LIFO works correctly."
            );

            System.out.println(
                    "Popped: " + first
            );

        } else {

            System.out.println(
                    "FAIL - LIFO order is incorrect."
            );
        }

        TreatmentRecord second =
                stack.pop();

        if (second != null &&
                second.getPatientId() == 302) {

            System.out.println(
                    "PASS - Second record popped correctly."
            );

        } else {

            System.out.println(
                    "FAIL - Second record order incorrect."
            );
        }

        System.out.println("\nRemaining treatment history:");

        stack.display();
    }

    // ==========================================
    // TEST 4: SINGLY LINKED LIST
    // ==========================================

    public static void testVisitHistory() {

        System.out.println("\n----------------------------------------");
        System.out.println("TEST 4: PATIENT VISIT HISTORY");
        System.out.println("----------------------------------------");

        VisitHistory history =
                new VisitHistory();

        Visit visit1 =
                new Visit(
                        401,
                        "2026-08-01",
                        "Dr. Silva",
                        "Fever",
                        "Medication"
                );

        Visit visit2 =
                new Visit(
                        402,
                        "2026-08-15",
                        "Dr. Perera",
                        "Headache",
                        "Painkillers"
                );

        Visit visit3 =
                new Visit(
                        403,
                        "2026-09-01",
                        "Dr. Fernando",
                        "Injury",
                        "Treatment"
                );

        // Test adding visits
        history.addVisit(visit1);
        history.addVisit(visit2);
        history.addVisit(visit3);

        System.out.println("\nVisits added successfully.");

        // Test display
        System.out.println("\nVisit history:");

        history.displayHistory();

        // Test search
        System.out.println("\nSearching for Visit ID 402:");

        Visit foundVisit =
                history.searchVisit(402);

        if (foundVisit != null) {

            System.out.println(
                    "PASS - Visit found:"
            );

            System.out.println(foundVisit);

        } else {

            System.out.println(
                    "FAIL - Visit not found."
            );
        }

        // Test unsuccessful search
        System.out.println("\nSearching for Visit ID 999:");

        Visit missingVisit =
                history.searchVisit(999);

        if (missingVisit == null) {

            System.out.println(
                    "PASS - Visit correctly not found."
            );

        } else {

            System.out.println(
                    "FAIL - Unexpected visit found."
            );
        }

        // Test removal
        System.out.println("\nRemoving Visit ID 402:");

        history.removeVisit(402);

        System.out.println(
                "Visit history after removal:"
        );

        history.displayHistory();

        // Confirm removal
        if (history.searchVisit(402) == null) {

            System.out.println(
                    "PASS - Visit successfully removed."
            );

        } else {

            System.out.println(
                    "FAIL - Visit was not removed."
            );
        }
    }
}


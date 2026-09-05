package hospital;

public class EmergencyQueue {

    private class Node {

        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
        }
    }

    private Node front;
    private Node rear;

    public void enqueue(Patient patient) {

        Node newNode = new Node(patient);

        if (rear == null) {

            front = newNode;
            rear = newNode;

            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public Patient dequeue() {

        if (front == null) {

            System.out.println("Emergency queue is empty.");

            return null;
        }

        Patient patient = front.patient;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return patient;
    }

    public void display() {

        if (front == null) {

            System.out.println("No patients waiting.");

            return;
        }

        Node current = front;

        while (current != null) {

            System.out.println(current.patient);

            current = current.next;
        }
    }
}


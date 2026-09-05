package hospital;



public class VisitHistory {

    private class Node {

        Visit visit;
        Node next;

        Node(Visit visit) {
            this.visit = visit;
        }
    }

    private Node head;

    public void addVisit(Visit visit) {

        Node newNode = new Node(visit);

        if (head == null) {

            head = newNode;

            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public Visit searchVisit(int visitId) {

        Node current = head;

        while (current != null) {

            if (current.visit.getVisitId() == visitId) {
                return current.visit;
            }

            current = current.next;
        }

        return null;
    }

    public void removeVisit(int visitId) {

        if (head == null) {
            return;
        }

        if (head.visit.getVisitId() == visitId) {

            head = head.next;

            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.visit.getVisitId() == visitId) {

                current.next = current.next.next;

                return;
            }

            current = current.next;
        }
    }

    public void displayHistory() {

        if (head == null) {

            System.out.println(
                    "No visit history."
            );

            return;
        }

        Node current = head;

        while (current != null) {

            System.out.println(current.visit);

            current = current.next;
        }
    }
}


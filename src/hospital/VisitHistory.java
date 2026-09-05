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
}


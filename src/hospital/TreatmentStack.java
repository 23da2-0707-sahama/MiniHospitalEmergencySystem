package hospital;


public class TreatmentStack {

    private class Node {

        TreatmentRecord record;
        Node next;

        Node(TreatmentRecord record) {
            this.record = record;
        }
    }

    private Node top;

    public void push(TreatmentRecord record) {

        Node newNode = new Node(record);

        newNode.next = top;

        top = newNode;
    }

    public TreatmentRecord pop() {

        if (top == null) {

            System.out.println(
                    "Treatment history is empty."
            );

            return null;
        }

        TreatmentRecord record = top.record;

        top = top.next;

        return record;
    }

    public void display() {

        if (top == null) {

            System.out.println(
                    "No completed treatments."
            );

            return;
        }

        Node current = top;

        while (current != null) {

            System.out.println(current.record);

            current = current.next;
        }
    }
}


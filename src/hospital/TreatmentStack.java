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
}


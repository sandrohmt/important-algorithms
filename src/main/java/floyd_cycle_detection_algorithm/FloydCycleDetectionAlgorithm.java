package floyd_cycle_detection_algorithm;


public class FloydCycleDetectionAlgorithm {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void append (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void createCycle(int position) {
        if (head == null) return;

        Node temp = head;
        Node cycleNode = null;
        int count = 1;

        while (temp.next != null) {
            if (position == count) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = cycleNode;
    }

    public boolean floydDetectCycle() {
        Node slow = head;
        Node fast = head;
        int count = 1;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Se os ponteiros se encontrarem, há um ciclo
                slow = head;
                while (slow != fast) {
                    count++;
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println("O ponto de entrada do ciclo é a " + count + "° posição");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FloydCycleDetectionAlgorithm list = new FloydCycleDetectionAlgorithm();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.createCycle(3);

        if (list.floydDetectCycle()) {
            System.out.println("Ciclo detectado na lista!");
        } else {
            System.out.println("Nenhum ciclo detectado!");
        }
    }
}

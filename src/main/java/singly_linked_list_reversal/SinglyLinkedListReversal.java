package singly_linked_list_reversal;

public class SinglyLinkedListReversal {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void append(int data) {
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Armazena o próximo ponteiro na variável next
            current.next = prev; // Inverte o lado do ponteiro
            prev = current; // Anda com o os ponteiros pra frente
            current = next; // Anda com o os ponteiros pra frente
        }
        head = prev;
    }

    public static void main(String[] args) {
        SinglyLinkedListReversal list = new SinglyLinkedListReversal();

        // Adicionando elementos à lista
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Lista Original:");
        list.printList();

        // Revertendo a lista
        list.reverse();

        System.out.println("Lista Revertida:");
        list.printList();
    }

}



package T_4;

public class t_4_1 {
    // метод для вывода элементов списка в обратном порядке
    public static void reversePrint(Node node) {
        if (node != null) {
            reversePrint(node.getNext());
            System.out.print(node.getData() + " ");
        }
    }

    public static void main(String[] args) {
        // создание списка
        Node head = new Node(1);
        head.setNext(new Node(2));
        head.getNext().setNext(new Node(3));
        head.getNext().getNext().setNext(new Node(4));

        // вывод списка в обратном порядке
        reversePrint(head); // 4 3 2 1
    }

}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

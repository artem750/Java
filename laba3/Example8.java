package laba3;


class Node5 {
    int value;
    Node next;

    Node5(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Example8 {
    private Node head;

    public Example8() {
        this.head = null;
    }

    // Циклические методы

    public void createHead(int value) {
        head = new Node(value);
    }

    public void createTail(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
        } else {
            Node newNode = new Node(value);
            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    // Рекурсивные методы

    public void createHeadRec(int value) {
        head = new Node(value);
    }

    public void createTailRec(int value) {
        head = createTailRecHelper(head, value);
    }

    private Node createTailRecHelper(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        current.next = createTailRecHelper(current.next, value);
        return current;
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        return current.value + " " + toStringRecHelper(current.next);
    }

    public static void main(String[] args) {
        Example8 list = new Example8();

        // Пример использования циклических методов
        list.createHead(5);
        list.createTail(10);
        list.addFirst(3);
        list.addLast(15);
        list.insert(2, 7);
        System.out.println("Список (циклический метод): " + list.toString());

        // Пример использования рекурсивных методов
        Example8 listRec = new Example8();
        listRec.createHeadRec(5);
        listRec.createTailRec(10);
        System.out.println("Список (рекурсивный метод): " + listRec.toStringRec());
    }
}

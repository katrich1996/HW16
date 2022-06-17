
public class MyLinkedList<T> {
        private Node<T> head;                  ///// Первый элемент Linked List

        public void addFirst(T t) {            /////Метод добавляет первый элемент в Linked List
            Node<T> firstNode = new Node<>(t);
            firstNode.next = head;
            head = firstNode;


        }

        public void addLast(T t) {                  //////Метод добавляет последний элемент в Linked List
            if (head == null) {
                head = new Node<>(t);
                return;
            }
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node<>(t);

        }

        public int get(T t) {                     /////Метод ищет элемент по индексу
            if (head == null) {
                return -1;
            }
            if (head.value == t) {
                return 0;
            }
            Node<T> currentNode = head;
            int result = 0;
            while (currentNode.next != null) {
                ++result;
                if (currentNode.next.value == t) {
                    return result;
                }
                currentNode = currentNode.next;
            }
            return -1;
        }

        public void remove(T t) {               ////Метод удаляет элемент
            if (head == null) {
                return;
            }
            if (head.value == t) {
                head = head.next;
                return;
            }
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.value == t) {
                    currentNode.next = currentNode.next.next;
                    return;
                }
                currentNode = currentNode.next;
            }
        }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    private static class Node<T> {
            private final T value;
            private Node<T> next;

            public Node(T value) {
                this.value = value;
            }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
    }


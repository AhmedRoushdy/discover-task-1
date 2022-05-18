public class LinkedList<T> {

    private Node<T> head;


    public void addFirst(T item) {
        Node<T> node = new Node();
        node.value = item;
        node.next = head;
        head = node;
    }

    public void addLast(T item) {
        Node<T> node = new Node();
        node.value = item;
        if ( head == null) {
            head = node;
        }
        else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    public Integer search(T item) {
        Integer index = 0;
        Node<T> itrNode = head;
        while(itrNode != null) {
            if( itrNode.value == item) {
                return index;
            }
            itrNode = itrNode.next;
            index++;
        }
        return null;
    }

    public Integer remove(T item) {
        Integer index = 0;
        Node<T> itrNode = head;
        if( itrNode.value == item) {
            head = head.next;
            return index;
        }
        while(itrNode.next != null) {
            index++;
            if( itrNode.next.value == item) {
                itrNode.next = itrNode.next.next;
                return index;
            }
            itrNode = itrNode.next;
        }
        return null;
    }

    public void print() {

        String printString = "";
        Node<T> current = head;
        while( current != null) {
            printString += current.value + " ";
//            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(printString);
    }



    private class Node<T> {
        T value;
        Node<T> next;
    }
}

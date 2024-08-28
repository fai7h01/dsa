package linked_list;

public class ReverseLinkedList {

    public static void main(String[] args) {

    }

    public static Node reverse(Node head){

        Node prev = null;
        Node current = head;
        while (current != null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;

    }
}

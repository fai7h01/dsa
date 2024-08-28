package linked_list;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {

    }

    public static Node removeNthNodeFromEnd(Node head, int n){

        Node p1 = head;
        Node p2 = head;
        Node tail, prev = null;

        for (int i = 0; i < n - 1; i++) {
            p2 = p2.next;
        }

        while(p2.next != null){
            prev = p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        tail = p2;
        if (p1 == head){
            head = p1.next;
            p1.next = null;
        } else if (p1 == tail) {
            tail = prev;
            prev.next = null;
        }else{
            prev.next = p1.next;
            p1.next = null;
        }

        return head;
    }

}

package linked_list;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {


    }

    public static Node removeDuplicates(Node head){

        if (head == null || head.next == null) return head;
        Node current = head;
        while (current.next != null){
            if (current.value == current.next.value){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head;
    }

}

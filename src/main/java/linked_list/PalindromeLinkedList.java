package linked_list;

public class PalindromeLinkedList {

    public static void main(String[] args) {


    }


    public static boolean isPalindrome(Node head) {

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node reversed = reverse(slow.next);
        while (reversed != null){
            if (head.value != reversed.value){
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }

    private static Node reverse(Node node){
        Node prev = null;
        Node current = node;
        while (current != null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}

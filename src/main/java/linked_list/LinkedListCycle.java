package linked_list;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {

        Node node1 = new Node(15);
        Node node2 = new Node(10);
        Node node3 = new Node(5);
        Node node4 = new Node(20);
        Node node5 = new Node(25);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        System.out.println(hasCycle(node1));
    }


    public static boolean hasCycle(Node head){

        Set<Node> set = new HashSet<>();

        Node current = head;
        while(current != null){
            if (!set.add(current)){
                return true;
            }
            current = current.next;
        }
        return false;

    }
}

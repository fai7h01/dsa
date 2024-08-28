package linked_list;

public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {

    }

    public static Node merge(Node list1, Node list2){

       Node dummyNode = new Node();
       Node prev = dummyNode;

       while (list1 != null && list2 != null){
           if (list1.value < list2.value){
               prev.next = list1;
               list1 = list1.next;
           }else{
               prev.next = list2;
               list2 = list2.next;
           }
           prev = prev.next;
       }

       if (list1 == null){
           prev.next = list2;
       }else{
           prev.next = list1;
       }
       return dummyNode.next;
    }

}

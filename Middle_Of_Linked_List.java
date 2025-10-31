public class Solution{
    public static Node findMiddle(Node head){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

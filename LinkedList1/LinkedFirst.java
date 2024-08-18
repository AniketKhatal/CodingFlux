package LinkedList1;
public class LinkedFirst {
    public static class Node{
        int data;
        Node next; //reference variable that points out the next node
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        //we have only onr head and tail in linkedlist thats  why we declare it as property inside the class
        public static Node head;
        public static Node tail;
    }
    public static void main(String[] args) {
        
    }
}

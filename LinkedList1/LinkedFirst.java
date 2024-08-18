package LinkedList1;

public class LinkedFirst {

    public static class Node {

        int data;
        Node next; //reference variable that points out the next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        //we have only onr head and tail in linkedlist thats  why we declare it as property inside the class
        public static Node head;
        public static Node tail;

        //Adding an element to the start of the Linked list
        public void addFirst(int data) {
            //step 1= = create the new node
            Node newNode = new Node(data);

            if( head==null){
                 head=tail=newNode;
                 return;
            }
            //step 2 = newNode next = head
            newNode.next = head;  //link

            //step 3 = head=newNode
            head=newNode;
        }
    

    public static void main(String[] args) {
        LinkedFirst ll=new LinkedFirst();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}   

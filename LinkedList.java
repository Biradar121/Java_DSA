import javax.crypto.AEADBadTagException;

public class LinkedList {
    // Creating the first node in LinkedList
    public static class Node {
        int data;
        Node next;

        // Creating the Constructor in the Node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add from First --> Head
    public void addFirst(int data) {
        // Step-1 Creating the LinkList
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step-2
        newNode.next = head;// linking step

        // Step-3 head= newNode
        head = newNode;
    }

    // Add From Last -->Tail
    public void addLast(int data) {
        // Step-1 -Creating the new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step2-
        tail.next = newNode;
        // Step-3
        tail = newNode;
    }

    // Printing the Linkedlist
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.print("null");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Adding the Node in between the LinkedList
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        if (idx == 0) {
            addFirst(data);
            return;
        }
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1;temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove the first Node (Head) from the LinkedList
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove the last node(Tail) from the LinkedList
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev :i =size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    //find the Key in the LinkedList using itrative method  
    public int itrSearch(int key){
        //Base Case 
        Node temp=head;
        int idx=0;
        if(temp == null){
            return -1;
        }
        while(temp!=null){
            if(temp.data == key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
       return -1; 
    }
    public int helper(Node head,int key){
        Node temp=head;
        if(temp ==null){
            return -1;
        }
        if(temp.data ==key ){
            return 0;
        }
        int idx= helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    
    public int recSearch(int key){
        return helper(head,key);
    }
    // Reverse the linkedList 
    public  void reverse(){
        Node prev=null;
        Node curr= tail=head;
        Node next;
        while(curr!= null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        // 1->2->9->3->4->null
        ll.print();
        // System.out.println("The Size of the Linked List is:" + ll.size);
        //ll.removeFirst();
        //ll.print();
        //System.out.println("The Size of the Linked List is:" + ll.size);
        //ll.removeLast();
        //ll.print();
        //System.out.println("The Size of the Linked List is:" + ll.size);
        // ll.reverse();
        // ll.print();
       System.out.println("The index of the key is:"+ll.itrSearch(3));;
       System.out.println("The index of the key is:"+ll.recSearch(10));
      
    }
}
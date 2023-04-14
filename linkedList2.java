import javax.naming.LinkRef;
import javax.print.event.PrintEvent;

import org.w3c.dom.html.HTMLBRElement;

public class linkedList2{
    public static class Node{
        int data;
        Node next;
       public Node(int data){
        this.data=data;
        this.next=null;
       }
    }
    public static Node  head;
    public static Node tail;
    public static void addFirst(int data){
        //new Node
        Node newNode=new Node(data);
        if(head ==null){
            head=tail=newNode;
            return;
        }
        //linking Step
        newNode.next=head;
        head=newNode;
    }
    
    //Find and Remove the nth Node from the end
    public void removeNthNode(int n){
        //Calcalulate size
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
       if(n ==size){
           head=head.next;//removing the head technique
           return;
       }
       int i=1;
       int iToFind=size-n;
       Node prev=head;
       while(i < iToFind){
         prev=prev.next;
         i++;
       }
       prev.next=prev.next.next;
    }


    //Check the LinkedList is palidrome or not
    //fast-Slow approch
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
       while(fast!= null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
    return slow;
    }
    public boolean checkPalindrome(){
        if(head ==null || head.next==null){
            return true;
        }
        //Step-1 Find Mid
         Node midNode=findMid(head);
        //Step-2 Right half reverse
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right= prev;
        Node left=head;
        //Step-3 check left half && right half
        while(right != null){
            if( left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;
    }



    //Detecting the cycle in Linked List
    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast ){
                return true;
            }
        }
        return false;
    }

    //remove the cycle from the linked list
    public static void removeCycle(){
        //Detect the cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next;//+1
            slow=slow.next.next;//+2
            if(slow == fast){
                cycle=true;
                 break;
            }
        }
        if(cycle ==false){
            return ;
        }
        //find the last node 
        slow=head;
        Node prev=null;
        while(slow !=fast){
            prev=fast;
            slow=slow.next;//+1
            fast=fast.next;//+1
        }

        //lastnode next->null
        prev.next=null;

    }
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid value 
    }
    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1 != null && head2 !=null){
            if(head1.data <=head2.data){
                temp.next=head1.next;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1 != null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2 !=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL;
    }
    public Node mergeSort(Node head){
        if(head ==null && head.next==null){
            return head;
        }
        //find mid 
        Node mid=getMid(head);
        //left and right MS 
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        
        //merge 
        return merge(newLeft,newRight);
    }
    public static void print(){
        Node temp=head;
        while( temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        linkedList2 ll=new linkedList2();
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
        //5->4->3->2->1->null
        print();
        ll.mergeSort(head);
        print();


        

        
      
    }
}
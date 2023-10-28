import java.lang.*;
import java.util.*;

class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

public class LLeg1 {

    
    //Represent the head and tail of the singly linked list  
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newnode = new Node(data); //Create a new node  

        if(head==null){
            //If list is empty, both head and tail will point to new node  
            head = newnode;    
            tail = newnode;  
        }
        else{
            tail.next = newnode;  //newNode will be added after tail such that tail's next will point to newNode
            tail = newnode;  //newNode will become new tail of the list  
        }
    }

    public void Display(){
        int count=0;
        Node current = head; //Node current will point to head  
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of Single Linked list: ");
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
            count++;
        }
        System.out.println();
        System.out.println("No. of elements:"+count);
    }

    public static void main(String[] args) {
        LLeg1 LL = new LLeg1();
        LL.addNode(1);
        LL.addNode(2);
        LL.addNode(3);
        LL.addNode(4);
        LL.addNode(6);
        LL.Display();
    }
    
}

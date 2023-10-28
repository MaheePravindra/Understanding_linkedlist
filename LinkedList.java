import java.util.*;
public class LinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    Node head=null;
    Node tail=null;
    int size;
    LinkedList(){
        size=0;
    }
    public void insertFirst(int val){
        Node newnode = new Node(val);
        newnode.next=head;
        head = newnode;

        if(tail==null){
            tail=head;
            
        }
        size++;
    }
    public void insertLast(int val){
        Node newnode = new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next = newnode;
        tail=newnode;
        size++;
        
    }
    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;

    }
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=index-1;i>0;i--){
            temp=temp.next;
        }
        Node newnode = new Node(val);
        newnode.next = temp.next;
        temp.next = newnode;
        size++;

    }
    //insert using recursion
    public void insertRec(int val, int index){
        
    }

    public Node find(int value){
        Node newnode = head;
        while(newnode!=null){
            if(newnode.val == value){
                return newnode;
            }
            newnode = newnode.next;
        }
        return null;
    }

    public Node get(int index){
        Node newnode = head;
        for(int i=0;i<index;i++){
            newnode=newnode.next;
        }
        return newnode;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.val;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;

        prev.next = prev.next.next;

        return val;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insertFirst(3);
        LL.insertFirst(2);
        LL.insertFirst(8);
        LL.insertFirst(17);
        LL.display();
        LL.insertLast(64);
        LL.insert(22, 2);
        LL.display();
        System.out.println(LL.deleteFirst());
        LL.display();
        System.out.println(LL.deleteLast());
        LL.display();
        System.out.println(LL.delete(2));
        LL.display();
    }
}    

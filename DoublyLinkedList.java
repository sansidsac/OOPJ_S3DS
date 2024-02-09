import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Actions{
    Node head;
    Node tail;
    public Actions(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }
    public void display(){
        Node temp = this.head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void delete(int data){
        Node temp=this.head;
        while(temp.data!=data)
            temp=temp.next;
        if(temp==this.head){
            this.head=temp.next;
            if(head==null)
                tail=null;
            else
                head.prev=null;
        }
        else if(temp==this.tail){
            this.tail=temp.prev;
            if(tail==null)
                head=null;
            else
                tail.next=null;
        }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        temp=null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op=0,item;
        Actions act=new Actions();
        while(op!=4){
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Delete");
            System.out.println("4.Exit");
            op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Enter the data");
                    item=sc.nextInt();
                    act.insert(item);
                    break;
                case 2:
                    act.display();
                    break;
                case 3:
                    System.out.println("Enter the data");
                    item=sc.nextInt();
                    act.delete(item);
                    break;
            }
        }
        sc.close();
    }
}

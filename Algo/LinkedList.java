

import java.util.*;


public class LinkedList {

class Node{
    int data;
    Node next;
   
}
Node head = null;
Node last;

// The linkedList operation cannot done inside the main function in java
 public  void insert(int d){
            Node new_node = new Node();
            new_node.data=d;
            new_node.next=null;
            
            if(head == null){
                head=new_node;
                last = head;
            }
            else{
                
                while(last.next!=null){
                    last=last.next;
                }
                last.next=new_node;
            }
        }
public void display(){
    Node te=head;
    while(te.next!=null){
        System.out.print(te.data + "-->");
        te=te.next;
    }
     System.out.print(te.data);
}

public void search(int val){
    
    Node temp = head;
   // int a=head.data;
    //int b=last.data;
    for(int i=0;i<=5;i++){
        if(temp.data==val){
            System.out.println("the value is present");
           
            break;
        }
         temp=temp.next;
         
    }
   // System.out.println("value is not present");
   
}

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
    //  linkedlist class should be created to get the object
        Scanner inp = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("enter input");
            int fd=inp.nextInt();
            obj.insert (fd);
            
        }
        
        obj.display();
        
        System.out.println("enter the value to be search");
        int val=inp.nextInt();
        
        System.out.println("");
        obj.search(val);

        inp.close();
    }
	public void push(int num) {
	}
	public void pop() {
	}
    
}

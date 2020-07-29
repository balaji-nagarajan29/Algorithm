
import java.util.*;
public class Remove_DuplicateLL {
    

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
public void remove(){

//arr[1,i2,3,2,1]

Node first=head;
Node nextL =null;

while(first!=null && first.next!=null){

    nextL=first;
while(nextL.next!=null){
if(first.data==nextL.next.data){
    nextL.next=nextL.next.next;
}
else{
    nextL=nextL.next;
}
}

first=first.next;
}


}
public static void main(String[] args) {
    
    Remove_DuplicateLL obj = new Remove_DuplicateLL();
    //  linkedlist class should be created to get the object
        Scanner inp = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("enter input");
            int fd=inp.nextInt();
            obj.insert (fd);
            
        }
        
        obj.display();

        obj.remove();
System.out.println();
        obj.display();
        inp.close();

}
}
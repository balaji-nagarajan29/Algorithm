import java.util.*;
public class Stack {

    class Node{
        int data;
        Node next=null;

        Node(int d){
            data=d;
        }
    }

    Node head=null;
    Node last=null;

public void Insert(int n){

Node new_node = new Node(n);


if(head==null){
    head=new_node;
}
else{

new_node.next=head;
head=new_node;

}



}

public void print(){

    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    
    
    }

    public void remove(){

        head=head.next;
    }
    public static void main(String[] args) {
        
// Last in first out(LIFO)
/*
1,2,3,4,5

1->2->3->4->5->NULL

5->4->3->2->1

*/


Scanner scan = new Scanner(System.in);

System.out.println("Enter no of inputs");

Stack obj = new Stack();

int n=scan.nextInt();

System.out.println("Enter the values");

for(int i=0;i<n;i++){
    int k=scan.nextInt();
obj.Insert(k);
}


obj.remove();
obj.remove();

obj.print();


scan.close();

    }
}

//First In First OUT
/*abstract

1->2->3->4->5



*/
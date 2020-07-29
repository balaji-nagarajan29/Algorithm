import java.util.*;
public class ReverseLinkedList {
    
class Node{
    int data;
    Node next;
}

 static Node head;

public void insert(int data){

Node input = new Node();
input.data=data;
input.next=null;
if(head==null){
   
    head=input;
}
else{
    Node n = head;
    while(n.next!=null){
        n=n.next;
    }
    n.next=input;
}

}

public void print(){
    Node temp=head;
    while(temp.next!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.print(temp.data+" ");
}

public Node reverse(){

Node cur =head;
Node prev=null;
Node next=null;

while(cur!=null){
    next=cur.next;
    cur.next=prev;
    prev=cur;
    cur=next;
}

return prev;

}

public static void main(String[] args) {
    
ReverseLinkedList list = new ReverseLinkedList();

Scanner scan = new Scanner(System.in);

int n=5;
int k;
for(int i=0;i<n;i++){

k=scan.nextInt();
list.insert(k);

}
System.out.println("Before");
list.print();
head=list.reverse();
System.out.println("After");
list.print();
scan.close();

}


}
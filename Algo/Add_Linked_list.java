import java.util.*;
public class Add_Linked_list {

    class Node{
        int data;
        Node next=null;

        Node(int d){
            data=d;
        }
    }

    static Node head;
    Node head2;
    static Node answer=null;
   static Node result=null;
    static Node first=null;
    static Node second=null;
    static Node val=null;

    public void Insert(int d,int val){

        Node new_node = new Node(d);
        if(val==1){
            if(first==null){
                first=new_node;
                head=first;
            }

            else{
                while(head.next!=null){
                    head=head.next;
                }
                head.next=new_node;
            }

        }

        else{

            if(second==null){
                second=new_node;
                head2=second;
            }
            else{
                if(head2.next!=null){
                    head2=head2.next;
                }
                head2.next=new_node;
            }


        }

    }

    public void print(Node head){
        Node te=head;
        while(te.next!=null){
            System.out.print(te.data + "-->");
            te=te.next;
        }
        System.out.print(te.data);
    }

    public Node reverse(Node head){

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

    public void addition(Node frst,Node sec){

int n=0,carry=0,k=0;
while(frst!=null && sec!=null){
    n=0;
    k=0;
    n=frst.data + sec.data;
    frst=frst.next;
    sec=sec.next;
    n=n+carry;
    if(n>9){
       k=n%10;
       n=n/10;
       carry=n;
    }
    else{
        k=n;
        carry=0;
    }
    Node new_node = new Node(k);

    if(result==null){
        result=new_node;
        answer=result;
    }
    else{
        while(answer.next!=null){
            answer=answer.next;
        }
        answer.next=new_node;
    }
}
if((frst==null && sec==null)&&(carry!=0)){
    Node new_node = new Node(carry);
    while(answer.next!=null){
        answer=answer.next;
    }
    answer.next=new_node;
}



    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Add_Linked_list add = new Add_Linked_list();

        System.out.println("Enter number 1.");
//It is a three digit number for 1st number
        for(int i=0;i<3;i++){

            int k=scan.nextInt();

            add.Insert(k,1);

        }


        System.out.println("Enter number 2.");
//It is a three digit number for 1st number
        for(int i=0;i<3;i++){

            int k=scan.nextInt();

            add.Insert(k,2);

        }
        System.out.println("Before Reverse 1.");
        add.print(first);
        System.out.println();
        System.out.println("Before Reverse 2.");
        add.print(second);

        first=add.reverse(first);
        second=add.reverse(second);
        System.out.println();
        System.out.println("After Reverse 1.");
    add.print(first);
        System.out.println();
        System.out.println("After Reverse 2.");
    add.print(second);

    add.addition(first,second);

        System.out.println();
        System.out.println("Answer is.");
        result=add.reverse(result);

        add.print(result);
        scan.close();
    }
}
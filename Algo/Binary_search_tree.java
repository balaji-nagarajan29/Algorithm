
import java.util.*;
public class Binary_search_tree {

class Node{
    int data;
    Node left=null;
    Node right=null;

    Node(int d){
        data=d;
    }
}

static Node root=null;


public Node Insert(Node root,int d){

if(root==null){
    Node new_node = new Node(d);
    root=new_node;
   // return root;
}

else if(d<root.data){
    root.left=Insert(root.left,d);
}
else{
    root.right=Insert(root.right,d);
}

    return root;
}
void inorder() {
    inorderRec(root);
  }

  // Inorder Traversal
  void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.print(root.data + " -> ");
      inorderRec(root.right);
    }
  }
public Node Search(Node root,int d){

    if(root.data==d){
       System.out.println("Element found");
    }
    
    else if(d<root.data){
        root.left=Search(root.left,d);
    }
    else{
        root.right=Search(root.right,d);
    }
    
      return root;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Binary_search_tree obj = new Binary_search_tree();
        System.out.println("Enter number of elements to be inserted");
int n=scan.nextInt();

for(int i=0;i<n;i++){
    int k=scan.nextInt();
   root =  obj.Insert(root,k);

}

//System.out.println("Enter the elements to be searched");
//int search = scan.nextInt();
//obj.Search(root,search);
//for(int i)

obj.inorder();

scan.close();
    }
}
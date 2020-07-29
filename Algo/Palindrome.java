import java.util.*;
public class Palindrome {

    //need to check palimdrome or not effectively
    public static void main(String[] args) {
        String str;

        Scanner scan = new Scanner(System.in);

        str=scan.nextLine();
        scan.close();
        int i=0;
        int j=str.length()-1;
        char[] arr = str.toCharArray();

     
int flag=0;
while(i<j){

    if(arr[i]!=arr[j]){
        System.out.print("False");
        
flag=1;
break;
    }
    i++;
    j--;
}
if(flag==0)System.out.print("True");
    
    }
}
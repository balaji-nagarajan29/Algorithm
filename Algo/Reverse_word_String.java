import java.util.*;

public class Reverse_word_String{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        String str=scan.nextLine();

int j=0;
//String name="";
char[] arr = new char[1000];
        for(int i=str.length()-1;i>=0;i--){

            if(str.charAt(i)!=' ')arr[j++]=str.charAt(i);

            else{
                for(int k=j-1;k>=0;k--)System.out.print(arr[k]);
                arr[0]='\0';
                j=0;

                System.out.print(" ");
            }



        }
        for(int i=j-1;i>=0;i--)System.out.print(arr[i]);

    }
}

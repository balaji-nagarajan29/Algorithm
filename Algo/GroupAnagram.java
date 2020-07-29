import java.util.*;
public class GroupAnagram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of strings in the input:");
        int n=scan.nextInt();
        String[] input_arr = new String[n];
       
        for(int i=0;i<n;i++){
            input_arr[i]=scan.next();
        }

        String[] str = new String[n];

        for(int i=0;i<n;i++){

            char[] arr = input_arr[i].toCharArray();
            Arrays.sort(arr);
            String val = new String(arr);
            str[i]=val;

        }

        for(int i=0;i<n;i++){
            System.out.println(input_arr[i] + ":" + str[i]);
        }
        
        System.out.println("The answer is");
        int k=0;
        for(int i=0;i<n && str[i]!="@@";i++){
          
System.out.println("The value is equal set "+ ++k);
System.out.print(input_arr[i]+" ");
            for(int j=i+1;j<n && str[j]!="@@";j++){

                if(str[i].equals(str[j])){
                   System.out.print(input_arr[j]+" ");
                    str[j]="@@";
                }
            }
           System.out.println();
          
        }
        
scan.close();
        


    }
}
import java.util.*;
public class KadanesAlgorithm {
    
    //It is famous algorithm to find maximum sub array in the given array
    public static void main(String[] args) {
        
        int[] arr = new int[10];

        Scanner scan = new Scanner(System.in);
   

// 9 -1 4 2 -5 0 8 7 6

        for(int i=0;i<9;i++)arr[i]=scan.nextInt();

        scan.close();

int max=arr[0],max_until=arr[0];


        for(int i=1;i<9;i++){
max_until=Math.max(arr[i],max_until+arr[i]);

max=Math.max(max,max_until);
        }

        System.out.print("The maximum sub array in the given array is..."+max);
    }
}
import java.util.*;



public class Unique_Pattern {

    public static boolean unique(int z){
        String val=String.valueOf(z);

        char[] str = val.toCharArray();

        int left=0;
        int right=val.length()-1;

        while(left<right){
            if(str[left]==str[right]){
                return false;
            }

            left++;
            right--;


        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int upper=scan.nextInt();
        int lower=scan.nextInt();
        int k=0;

        int[] arr = new int[100];

        for(int i=upper;i<=lower;i++){
            
            while(unique(i)){
                arr[k++]=i;

                for(int j=0;j<k;j++)System.out.print(arr[j] + " ");
                System.out.println();

                break;
            }

            


        }

    }
}
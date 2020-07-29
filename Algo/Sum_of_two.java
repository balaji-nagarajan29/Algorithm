import java.util.*;
public class Sum_of_two{
    public static void main(String[] args) {
        int[] arr = new int[6];
        
        Scanner scan = new Scanner(System.in);
        int target=scan.nextInt();

        for(int i=0;i<6;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();

        Arrays.sort(arr);

int left=0;
int right=arr.length-1;

//1 2 3 4 5 

        while(left<right){
int sum=arr[left]+arr[right];
if(sum==target){
    System.out.println("The target has been found"+arr[left] + "   "+arr[right]);
    break;
}
else if(sum<target){
    left++;
    //if sum value is less than target value we need to add numbers that greater than present numbers that get add because the array is sorted 
}
else{
    right--;
    //if sum value is greater than target value we need to add numbers that lesser than present numbers that get add because the array is sorted 

}
        }
    }
}
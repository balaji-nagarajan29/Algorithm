import java.util.*;
public class Cyclic_Number_Verfication {
    
public static void rev(int[] arr1,int start,int end){

while(start<end){
    int temp=arr1[start];
    arr1[start]=arr1[end];
    arr1[end]=temp;
    start++;
    end--;
}


}




public static void main(String[] args) {
    

Scanner scan = new Scanner(System.in);

int num1=scan.nextInt();

int num2=scan.nextInt();

scan.close();

int[] arr1 = new int[10000];
int[] arr2 = new int[10000];

int j=0;

while(num1!= 0){
    arr1[j]=num1%10;
    num1=num1/10;
    j++;
}

int k=0;

while(num2!=0){
    arr2[k]=num2%10;
    num2=num2/10;
    k++;
}

if(j!=k){
    System.out.println("No");
    System.exit(0);
}


int start =0;
int end = j-1;
rev(arr1,start,end);

start=0;
end=j/2;

rev(arr1,start,end);

start=j/2+1;
end=j-1;

rev(arr1,start,end);


for(int i=0;i<j;i++){
    if(arr1[i]!=arr2[i])break;

    if(i==j-1){
        System.out.println("Yes");
        System.exit(0);
    }
}


System.out.print("NO");


}

}
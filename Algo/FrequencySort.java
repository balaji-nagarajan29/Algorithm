import java.util.*;
public class FrequencySort {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n=scan.nextInt();
     int[] arr = new int[100];
     int[] counter = new int[100];

     for(int i=0;i<n;i++){
         arr[i]=scan.nextInt();
     }
     scan.close();

     for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(arr[i]>arr[j]){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }
     }
    
int count=1;
     for(int i=0;i<n;i++){

if(arr[i]==arr[i+1])count++;

else {
    counter[i]=count;
    count=1;
}

     }

for(int i=0;i<n;i++){
    if(counter[i]>0)
    System.out.println(arr[i]+"== "+counter[i]);
}

System.out.println("------------------------");
int max,index=0;
for(int i=0;i<n+1;i++){
    if(counter[i]>0){
        max=0;
        for(int j=0;j<n+1;j++){
if(counter[j]>max){
    max=counter[j];
    index=j;
}
        }

        for(int k=0;k<max;k++){
            System.out.print(arr[index]+" ");
        }
        counter[index]=-1;
    }
}

 }   
}
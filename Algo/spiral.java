import java.util.*;
public class spiral {
    public static void main(String[] args) {
    int n=5;    
int[][] arr = new int[n][n];
Scanner scan = new Scanner(System.in);

for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        arr[i][j]=scan.nextInt();
    }
}
scan.close();

for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
       System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}

int k=0,l=0,last_row=n-1,last_col=n-1;

while(k<=last_row && l<=last_col){

for(int i=l;i<=last_col;i++)System.out.print(arr[k][i]+" ");
k++;

for(int i=k;i<=last_row;i++)System.out.print(arr[i][last_col]+" ");
last_col--;

if(k<=last_row){
    for(int i=last_col;i>=l;i--)System.out.print(arr[last_row][i]+" ");
    last_row--;
}

if(l<=last_col){
    for(int i=last_row;i>=k;i--)System.out.print(arr[i][l]+" ");
    l++;
}




}




    }
}
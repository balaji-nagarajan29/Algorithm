import java.util.*;
public class Spiral_Grid {
    public static void main(String[] args) {
        
Scanner scan = new Scanner(System.in);

System.out.println("Enter number of row and column");

int n=scan.nextInt();

int[][] arr = new int[n+1][n+1];

int val=scan.nextInt();

int row_start=0,row_end=n-1,col_start=0,col_end=n-1;

while(row_start<=row_end && col_start<=col_end){

for(int i=col_start;i<=col_end;i++){
    arr[row_start][i]=val;
}
row_start++;

for(int i=row_start;i<=row_end;i++){
    arr[i][col_end]=val;
}
col_end--;

if(row_start<=row_end){
    for(int i=col_end;i>=col_start;i--)arr[row_end][i]=val;
row_end--;
}

if(col_start<=col_end){
for(int i=row_end;i>=row_start;i--)arr[i][col_start]=val;
col_start++;
}

val--;


}

for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.print(arr[i][j]+ " ");
    }
    System.out.println();
}





scan.close();


    }
}
import java.util.*;
public class Transpose_Matrix {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] a =new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scan.nextInt();
            }
        }

        scan.close();

        // WE can transpose like this also IT IS IMPORTANT LEARN THIS TOO
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                a[i][j]^=a[j][i];
                a[j][i]^=a[i][j];
                a[i][j]^=a[j][i];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
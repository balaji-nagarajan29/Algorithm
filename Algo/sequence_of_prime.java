import java.util.*;

//This program not working properly
public class sequence_of_prime {

    public static int isprime(int num){
        if(num==2 || num==3)return 1;
if(num==0 || num==1)return 0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int n=scan.nextInt();
int[][] hash = new int[n+1][n+1];


scan.close();
int count=0;
for(int i=0;i<=n;i++){
    for(int j=0;j<=n;j++){
int sum=i+j;
hash[i][j] = isprime(sum);

if(hash[i][j]==1 && hash[j][i]==0)count++;
    }
}

System.out.println(count);

    }
    
}
import java.util.Scanner;



public class Pascal {
    public static void main(String[] args) {
        
Scanner scan = new Scanner(System.in);

int n=scan.nextInt();

for(int i=1;i<=n;i++){
    int c=1;
    for(int j=1;j<=i;j++){
System.out.print(c);
  c=c*(i-j)/j;
    }
    System.out.println();
}

scan.close();
    }
}
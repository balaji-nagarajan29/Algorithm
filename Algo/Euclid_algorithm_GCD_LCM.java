import java.util.*;
public class Euclid_algorithm_GCD_LCM{

    public static int gcd(int num1,int num2){
       if(num1==0)return num2;

       return gcd(num2%num1,num1);
    }
    public static void main(String[] args) {
        
        // Euclid's algorithm is to find GCD for the given number

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
int GCD_of_given = gcd(num1,num2);

System.out.println("The GCD of the given two number is "+ GCD_of_given);

//TO FInd LCM
int lcm = (num1*num2)/GCD_of_given;

System.out.println("The LCM of the given two number is "+ lcm);
    }
}
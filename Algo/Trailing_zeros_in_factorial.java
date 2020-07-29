import java.util.*;
public class Trailing_zeros_in_factorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fact = scan.nextInt();

        // in this program we need to find number of zeros in the factorial of given number
        //no of zeros == no of five's in the factorial

        //BASIC FORMULA: fact/5 + fact/(5)^2 + fact/(5)^3.....  until that division become zero..,
scan.close();
        int power = 5;
     int no_of_zeros=0;
        while(fact/power>0){
         no_of_zeros  = no_of_zeros + fact/power;
        power*=5;
        }
System.out.println("THe no of zeros in the given factorial is  "+ no_of_zeros);
    }
}

import java.util.*;
public class Convert_to_roman_NO {

    public static void main(String[] args) {
        
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();

scan.close();

//                         
        String roman[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int num[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String res="";
        for(int i=12;i>=0;i--){
            while(n>=num[i]){
                res=res+roman[i];
                n=n-num[i];
            }
        }
        
        System.out.println(res);
    }
    
}
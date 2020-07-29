import java.util.*;
public class Check_strings_of_rotation_is_equal_or_not {
//need to check one string rotation gives another string Eg: str1==geeksforgeeks   str2==forgeeksgeeks  it gives the true
    public static void main(String[] args) {
        
Scanner scan = new Scanner(System.in);

String s = scan.nextLine();

String x = scan.nextLine();
scan.close();
if(s.length()==x.length() && (s+s).contains(x))System.out.print("Equal");

else System.out.print("Not Equal");

    }
}
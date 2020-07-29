import java.util.*;
public class naive_substring_pattern {
    public static void main(String[] args) {
        
Scanner scan = new Scanner(System.in);

String str=scan.nextLine();
String pattern = scan.nextLine();

scan.close();

for(int i=0;i<str.length();i++){

if(str.charAt(i)==pattern.charAt(0)){

    for(int k=i,j=0;j<pattern.length();k++,j++)
    {
    if(str.charAt(k)!=pattern.charAt(j))break;
if(j==pattern.length()-1)System.out.println("The Element is Found and the index it starts at "+i);    
}
}


}

    }
}
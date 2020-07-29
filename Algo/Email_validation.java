import java.util.*;
public class Email_validation {
    
public static void main(String[] args){
    int flag=0;
    int under=0;
Scanner scan = new Scanner(System.in);

String str =scan.nextLine();

scan.close();


char ch =str.charAt(0);

if(ch>=97 && ch<123){}

else{
    System.out.print("False");
    System.exit(0);
}

for(int i=1;i<str.length()-10;i++){

if(Character.isDigit(str.charAt(i))){
    flag=1;
}
else if(str.charAt(i)=='_')
{
under=1;
}
}

if((flag==1 && under==1) || (flag==0 && under==0))System.out.print("False");

else System.out.print("True");

}

}
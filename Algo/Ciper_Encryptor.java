import java.util.*;
public class Ciper_Encryptor {
    public static void main(String[] args) {
        
        // need to get the character and encrypt it with the targeted value by increase the ascii value.. (EASY)

        String str;

        int val;

        Scanner scan = new Scanner(System.in);

        str=scan.nextLine();
        val=scan.nextInt();

        scan.close();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int num=c;
            num=num+val;

            if(num<=122){
                System.out.printf("%c",num);
            }
            else{
                c=(char)(96+(num%122));
                System.out.print(c);
            }
        }

    }
}
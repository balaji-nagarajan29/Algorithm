import java.util.*;
public class Valid_ip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       

        
            String s = sc.next();
            sc.close();
            Solution obj = new Solution();

            if (obj.isValidIP(s))
                System.out.println(1);
            else
                System.out.println(0);
        
    }
}

class Solution {

    public boolean isValidIP(String s) {
        String part[]=s.split("\\.",-1);
        if(part.length!=4)
            return false;
        for(int i=0;i<4;i++){
            if(part[i].length()>1&&part[i].charAt(0)=='0')
                return false;
            int n=0;
            n=Integer.parseInt(part[i]);

         


            if(n>255)
                return false;
        }
        return true;
    }
}
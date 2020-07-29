import java.util.*;
public class ElectionVoteCTS {
    
public static String sortit(String ans,String res){

    if(ans.compareTo(res)>0){
        return ans;
    }
    else{
        return res;
    }
}
public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int n=scan.nextInt();
    int count=0;
    int max=0;
    String ans="";
    String[] str = new String[n];

    Scanner scan2 = new Scanner(System.in);
    for(int i=0;i<n;i++){
        str[i]=scan2.nextLine();
    }

    scan.close();
    scan2.close();

    
for(int i=0;i<n-1;i++){
count=0;
    for(int j=i+1;j<n;j++){

        if(str[i].equals(str[j])){
count++;
        }
    }
    if(count==max){
        ans = sortit(ans,str[i]);
         }
    if(count>max){
        ans=str[i];
        max=count;
    }   
    }


    System.out.print(ans+" is the answer");


}











}

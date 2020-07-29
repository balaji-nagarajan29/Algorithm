import java.util.*;
public class Bad_good_mix {
    
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

String str=scan.nextLine();
int bad=0;

int count=0;

scan.close();

for(int i=0;i<str.length();i++){

if(((str.charAt(i)=='a') ||(str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o') || (str.charAt(i)=='u')) && i<=str.length()-5){

for(int j=i;j<i+5;j++){
    if((str.charAt(j)!='a') &&(str.charAt(j)!='e')  && (str.charAt(j)!='i')  &&(str.charAt(j)!='o') && (str.charAt(j)!='u') )break;

    if(j==i+4)bad++;
}

}

else if(i<=str.length()-3){
    count=0;
    for(int j=i;j<i+3;j++){
        if((str.charAt(j)!='a') && (str.charAt(j)!='e') && (str.charAt(j)!='i') && (str.charAt(j)!='o') && (str.charAt(j)!='u') )count++;
    
        if(count==3)bad++;
    }


}

}


 if(bad>0)System.out.print("bad");

else if(bad==0) System.out.print("good");





    }
}
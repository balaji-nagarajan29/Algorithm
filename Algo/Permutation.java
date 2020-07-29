public class Permutation {

public static void swap(char[] str,int a,int b){
    char temp = str[a];
    str[a] = str[b];
    str[b] = temp;
}


    public static void permutate(char[] str,int start,int end){

if(start==end){
    for(int i=0;i<3;i++)System.out.print(str[i]);
    System.out.println();
}
else{
for(int i=start;i<=end;i++){
    swap(str,start,i);
    permutate(str, start+1, end);
    swap(str,start,i);
}

}
    }
    public static void main(String[] args) {
        
char[] str = {'a','b','c'};
permutate(str,0,2);



    }
}
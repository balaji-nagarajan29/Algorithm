import java.util.Scanner;
class Fibo_Prime
    {
        public static boolean Prime_Check(int g)
        {
            int i,c=0;
            for(i=1;i<=g;i++)
                {
                    if(g%i==0)
                        {
                            c++;
                        }
                    }
                    if(c==2)
                        {
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
        public static void main(String args[])
            {
                int i,j,a=0,b=1;
                int n,c=0,k=0;
                Scanner in=new Scanner(System.in);
                System.out.print("Enter the Term upto which you want the Pattern to be Printed:>");
                n=in.nextInt();
                int e=0,f=1;
                for(i=1;i<=n;i++)//counting no. of primes
                    {
                        e=e+f;
                        f=e-f;
                        if(Prime_Check(e)==true)
                        {
                            c++;
                        }
                    }
                    int a1[]=new int[c];
                for(i=1;i<=n;i++)// assingning the prime nos. to the array named a1[]
                    {
                                a=a+b;
                                b=a-b;
                                int g=a;
                                if(Prime_Check(g)==true)
                                    {
                                        a1[k++]=a;
                                    }
                            }
                            for(int r=0;r<c;r++)
                                {
                                    for(k=0;k<=r;k++)
                                        {
                                            System.out.print(a1[k]+"\t");
                                        }
                                        System.out.println();
                                }
                            
                        }
                       
                                    }
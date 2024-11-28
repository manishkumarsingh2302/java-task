import java.util.Scanner;
class Ri3{
     public static void main(String args[]){
    Scanner sk=new Scanner(System.in);
  System.out.println("entre any number");
int n=sk.nextInt();
int res=0,r;
while(n!=0){
r=n%10;
res=res*10+r;
n=n/10;
}
System.out.println("reverse is :"+res);
}
}

   +
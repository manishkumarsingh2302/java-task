import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
   int n,r;
System.out.println("enter a number");
 Scanner sk=new Scanner (System.in);
 n=sk.nextInt();

  while(n>0){
        r=n%10;
    System.out.print(r);
     n=n/10;
}
   

}
}
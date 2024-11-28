//write a java program to print  sum of digit of the given number?
  import java.util.Scanner;
 class Sum1{
  public static void main(String args []){
  Scanner sk=new Scanner(System.in);
 System.out.println("enter a nuber");
 int n=sk.nextInt();
 int sum=0;
while(n!=0){
int r=n%10;
sum=sum+r;
n=n/10;}
System.out.println("sum of digit :" +sum );
}
}

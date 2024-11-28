//write a java program to print factoril of given number
  import java.util.Scanner;
 class Fact1{
  public static void main(String args []){
  Scanner sk=new Scanner(System.in);
 System.out.println("enter a nuber")
 int n=sk.nextInt();
 int fact=1;
 for(int i=n; i>=1;i--){
fact=fact*i;
}
System.out.println("factoril of number =" +fact);
}
}
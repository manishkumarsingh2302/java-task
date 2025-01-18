//Write a java program to print sum of two number using function[Taking Something returning nothing]
import java.util.Scanner;     
class A1function{
           
       void add (int a ,int b){
      int c=a+b;

      System.out.println("Addition :"+c);
}
    public static void main (String args[]){
    Scanner sk=new Scanner(System.in);

     System.out.println("enter no 1 : ");
    int n1=sk.nextInt();

  System.out.println("enter no 2 :");  
  int n2=sk.nextInt();
  A1function obj=new A1function();

   obj.add(n1,n2);
    }
}

    
       
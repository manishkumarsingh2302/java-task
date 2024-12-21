             
Q1. //Write a java Program to print sum of two number with function [Taking Nothing Returning Nothing]?


       //Taking Nothing and returning Nothing
import java.util.Scanner;
class 1FunctionSumTest{

void add(){
System.out.println("=====>Enter Addition
Function====");
//declare variable
  int a,b,c;
          //take input
Scanner sk=new Scanner(System.in);
System.out.println("Enter Value of A :");
a=sk.nextInt();
System.out.println("Enter Value of B : ");
b=sk.nextInt();

            //perform operation
c=a+b;
           //print result
System.out.println("Addition is : "+c);
System.out.println("====Exit Addition
Function====");
}

public static void main(String args[]){
System.out.println("====>Enter Main
Function===");
1FunctionSumTest t=new 1FunctionSumTest();
t.add();
System.out.println("Back To Main method");
t.add();
System.out.println("======Exit Main
Function====");
}

}
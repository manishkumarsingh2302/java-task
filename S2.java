//write a java program to cheak given char
  import java.util.Scanner;
class S2{
      public static void main(String args[]){
      int n;
      Scanner sk=new Scanner(System.in);
     System.out.println("enter any number");
     n=sk.nextInt();
 switch (n%2){
  case 0:
System.out.println("it is even");
break;
case 1:
System.out.println("it is odd");
break;
 
 
default :
System.out.println("not ");
}
}
}
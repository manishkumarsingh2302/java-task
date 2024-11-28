//write a java program to cheak given char
  import java.util.Scanner;
class S3{
      public static void main(String args[]){
      int n1,n2;
     char c;
      Scanner sk=new Scanner(System.in);
    
System.out.println("press + For Addition");
System.out.println("press - For Subtrction");
System.out.println("press * For Multiliction");
System.out.println("press / For  Division");
System.out.println("========================");
 System.out.println("enter first no");
 n1=sk.nextInt();
System.out.println("enter second no");
 n2=sk.nextInt();
System.out.println("enter your choise");
 c=sk.next().charAt(0);
switch(c){
case '+':
System.out.println("Addition: " + ( n1 + n2));
break;



}
}
}
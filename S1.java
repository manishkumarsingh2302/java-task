//write a java program to cheak given char
  import java.util.Scanner;
class S1{
      public static void main(String args[]){
      char c;
      Scanner sk=new Scanner(System.in);
     System.out.println("enter any charecter");
     c=sk.next().charAt(0);
 switch (c){
  case 'a' :
System.out.println("it is vowel");
break;
 case 'e' :
System.out.println("it is vowel");
break;
 case 'i' :
System.out.println("it is vowel");
break;
 case 'o' :
System.out.println("it is vowel");
break;
 case 'u' :
System.out.println("it is vowel");
break;
default :
System.out.println("not vowel");
}
}
}
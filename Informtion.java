 import java.util.Scanner;
 class Information{
   public static void main(String args[]){
String name;
char A;
Scanner sc=new Scanner(System.in);
System.out.println("enter a name: ");
name=sc.nextLine();
System.out.println("enter section: " );
A=sc.next().charAt(0);
System.out.println("Name :"+name);
System.out.println("section :"+A);
}
}
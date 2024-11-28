

 import java .util.Scanner;
 class Q2 { 
           public static void main (String[]args){


           Scanner obj=new Scanner(System.in);
         
            System.out.println("Enter Number: ");

            int n=obj.nextInt();

            int last=n/100%10;

          System.out.println("Last digit :"+last);

          
} 
}
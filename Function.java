//taking Nothing and returning Nothing
 import java.util.Scanner;
  class Function{
         public void add(){
        int a,b,c;
        System.out.println("=====> add Function is called<====");

       Scanner kb=new Scanner(System.in);
      System.out.println("Enter value of a : ");
      a =kb.nextInt();
       
       System.out.println("Enter value of b : ");
      b =kb.nextInt();
    

    c=a+b;
      System.out.println("Addition : "+c);}
      
      public static void main (String args []){
       Function obj=new Function();
     obj.add();
     obj.add();
     obj.add();
     obj.add();
          }
}
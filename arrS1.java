import java.util.Scanner;
 class arrS1{
         public static void main (String args[]){
    
        Scanner sk=new Scanner(System.in);
     System.out.println("Entre any String");
  String str=sk.nextLine();
  for(int i=0;i<str.length();i++){
   char x=str.charAt(i);
   System.out.println(x);
}
}
}     
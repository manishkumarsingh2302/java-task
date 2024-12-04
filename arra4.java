import java.util.Scanner;
 class arra4{
         public static void main (String args[]){
    
        Scanner sk=new Scanner(System.in);
    System.out.println("Entre String 1 : ");
    String s1=sk.nextLine();
 System.out.println("Entre String 2 : ");
    String s2=sk.nextLine();
  int x=s1.compareTo(s2);
  if(x>0){
System.out.println(s1+ " is greater");

}
else if(x<0){
System.out.println(s2+ " is greater");
}
else if(x==0){
System.out.println(s1+ " and" +s2+" are eqal");
}

}    
} 
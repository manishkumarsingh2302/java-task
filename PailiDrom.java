//write a program to print given numaber is palidrom or not "MADAM"

class PailiDrom{
      public static void main(String args[]){
      String s ="MADAM";
      String rev="";
      for(int i=s.length()-1;i>=0;i--){
       rev=rev+s.charAt(i);
}
     if(s.equals(rev)){
     System.out.println("Given String is Pailidrom");
}

else{
 	System.out.println("Given String is not Pailidrom");
}
}
}
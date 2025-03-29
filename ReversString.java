//write a program to print revers nuber to the given "MANISH"
 
class ReversString{
 
public static void main (String args[]){
  String s="MANISH";
  String rev="";
 for(int i=s.length()-1;i>=0;i--){
    rev=rev+s.charAt(i);
}
System.out.println(rev);

}
}
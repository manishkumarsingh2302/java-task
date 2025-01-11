//Q1. Explain User Defined Exception class or
Customize Exception class in java Programming?
Ans: In java if you are not satisfied from the pr-
defined exception then you also create your own
Exception class/ User Defined Exception/
Customize Exception

You can create a User defined Exception or
Customize Exception by extending Throwable or
Exception Class
     			SECOND METHOD
=======================================================
  class NegativeException1 extends Throwable{
private String msg;
public NegativeException(String msg){
this.msg=msg;
}

public String getMsg(){
return msg;
}

}
class E2{
public static void main(String args[]){
int n=0;
try{
n=Integer.parseInt(args[0]);
if(n&lt;0){

NegativeException x=new
NegativeException(&quot;Negative Number
Exception Occur&quot;);
throw x;
}
}catch(ArrayIndexOutOfBoundsException
ae){
System.out.println(&quot;Please Enter At Least
One Argument from command line&quot;);
ae.printStackTrace();

}
catch(NumberFormatException ne){
System.out.println(&quot;Please Enter Only
Numeric Value&quot;);
ne.printStackTrace();

}
catch(NegativeException y){
System.out.println(y.getMsg());
}
System.out.println(&quot;Square is :
&quot;+Math.pow(n,2));
}

}

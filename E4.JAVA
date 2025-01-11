//Q1. Explain Command Line Argument in java
Programming?
Ans: Command Line Argument is used to
allow to pass information to a program at the
time of execution of the Program

Syntax:
java ClassName Hello Hi How Are You
java ClassName 1 2 3 4 5
Java ClassName


			class E4{
                        public static void main(String args[]){
                       int n=0;
			try{
			n=Integer.parseInt(args[0]);
			}catch(ArrayIndexOutOfBoundsException ae){
		System.out.println(&quot;Please Enter At Least One Argument from command line&quot;);
		ae.printStackTrace();
}
			catch(NumberFormatException ne){
		System.out.println(&quot;Please Enter Only Numeric Value&quot;);
		ne.printStackTrace();
}
		System.out.println(&quot;Square is : &quot;+Math.pow(n,2));
}
}
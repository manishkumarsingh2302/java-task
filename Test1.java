//Q3. Explain Method Overloading in java
Programming?
Ans: Method overloading means defined
multiple methods with same name but different
signature.


class Test{

public void add(){
int a,b,c;
a=1;
b=2;
c=a+b;
System.out.println(&quot;Addition without argument : &quot;+c);
}
public void add(int a,int b){
int c;
c=a+b;
System.out.println(&quot;Addition with two int argument : &quot;+c);

}
public void add(int a,float b){
float c;
c=a+b;
System.out.println(&quot;Addition with two int,float argument :
&quot;+c);

}
public void add(float a,int b){
float c;
c=a+b;
System.out.println(&quot;Addition with two float,int argument :
&quot;+c);

}
public void add(String a,String b){
int c;
c=Integer.parseInt(a)+Integer.parseInt(b);
System.out.println(&quot;Addition with two String argument :
&quot;+c);

}

public static void main(String args[]){
Test t=new Test();
t.add();
t.add(10,20);
t.add(5,2.5f);
t.add(15.5f,10);
t.add(&quot;1&quot;,&quot;1&quot;);

}
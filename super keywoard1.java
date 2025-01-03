//super keyword
 super.methodName();
Note: super must be first line of the the block
class Circle extends Point{
float r;
int z=102;
public Circle(){
System.out.println(&quot;Circle class Default
Constructor&quot;);
}
public Circle(int x,int y,float r){
super(x,y);//call parent class constructor
this.r=r;
System.out.println(&quot;Circle class Parameterized
Constructor&quot;);
}
void showData(){
super.hi();
System.out.println(&quot;X_CO : &quot;+x);
System.out.println(&quot;Y_CO : &quot;+y);
System.out.println(&quot;Radius is : &quot;+r);
System.out.println(&quot;circle z= : &quot;+z);
System.out.println(&quot;Point class z= : &quot;+super.z);
}

public static void main(String args[]){
//Circle c1=new Circle();
//Point class default constructor (1)and Circle
class default constructor(2)
Circle c2=new Circle(11,22,5.6f);
c2.showData();
}

}
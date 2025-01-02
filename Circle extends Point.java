
class Circle extends Point{
float r;
int z=102;
public Circle(){
System.out.println("Circle class Default Constructor");
}
public Circle(int x,int y,float r){
super(x,y);//call  parent class constructor
this.r=r;
System.out.println("Circle class Parameterized Constructor");
}
void showData(){
super.hi();
System.out.println("X_CO : "+x);
System.out.println("Y_CO : "+y);
System.out.println("Radius is : "+r);
System.out.println("circle z= : "+z);
System.out.println("Point class z= : "+super.z);
}

public static void main(String args[]){
//Circle c1=new Circle();
//Point class default constructor (1)and Circle class default constructor(2)
Circle c2=new Circle(11,22,5.6f);
c2.showData();
}


}


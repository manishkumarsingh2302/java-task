//member data in function
class point3 {
     int x ;
     int y;
   public point3(){
   x=1;
   y=1;
  System.out.println("Defoult consturter is called");
}
public point3 (int a,int b){
x=a;
y=b;
System.out.println("paramter consturter is called");
}
public void showData(){
    System.out.println("x_co :"+x);
    System.out.println("y_co :"+y);
}
  public static void main (String args[]){
     point3 p1=new point3();
     point3 p2=new point3();
     point3 p3=new point3();
p1.showData();
p2.showData();
p3.showData();
point3 p4=new point3(121,131);
p4.showData();
point3
 p5=new point3(10,20);
p5.showData();
}
}


//member data in function
class point1 {
     int x ;
     int y;
   public point1(){
   x=1;
   y=1;
  System.out.println("Defoult consturter is called");
}
public void showData(){
    System.out.println("x_co :"+x);
    System.out.println("y_co :"+y);
}
  public static void main (String args[]){
     point p1=new point();
     point p2=new point();
     point p3=new point();
p1.showData();
p2.showData();
p3.showData();
}
}


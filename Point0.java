//inheritance 

 class Point0{
      public int x;
      public int y;
    public Point0(){
  System.out.println("point class defoult constructor is called");
 }
 public Point0 (int x ,int y){
  this.x=x;
  this.y=y;
   System.out.println("Point class parameterized consteutor is called");
 }
   public static void main("String args[]"){
 Point p1=new Point0();
 Point p2=new Point0(10,20);
}
}
class Circle extends point0{
  public static void main("String args[]"){
  
   System.out.println("Circle class is main method")

}
}
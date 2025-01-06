class Parent{
           public void show(){
          System.out.println("thish is parrent class");
}
}
   class Child extends Parent{
 public void show(){
          System.out.println("this is child class");
}
  public static void main(String args[]){
    Parent c=new Child();
  c.show();
} 
}

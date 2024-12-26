// by  method oops
  class Animal3 {
                 int age ;
                String color;
void initObj(String c,int a)
{ 
   age=a;
   color=c;
}
void display()
{
   System.out.println("dog color is :"+color);
     System.out.println("dog age is :"+age);
}
}

  public static void main (String args[])
{
                 Animal3 dog=new Animal3();
                 dog.initObj=10;
                 dog.initObj="black";
                 dog.display();
    
}
}

   
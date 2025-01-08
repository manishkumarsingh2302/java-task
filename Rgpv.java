//Abstract class
 Abstract class Rgpv{
            public Abstract void lab();
            
            public Abstract void cctv();
            
            public Abstract void copycheak(){

         System.out.println("this copy cheak method of rgpv and thic is non abstract class")
}
}
  class College extends Rgpv{
     public College(){
                 System.out.println("this is collge claas Contruct")
}
public void cctv(){
    System.out.println("this is rgpc CCtv method")
                   }
  public void lab(){
    System.out.println("this is rgpc lab method")
                   }
public void staff(){
    System.out.println("this is rgpc staff method")
                   }
public static void main(String args[]){
Rgpv r=new College();
t1.cctv();
r.lab();
c.staff();
c.copycheak();
}
}

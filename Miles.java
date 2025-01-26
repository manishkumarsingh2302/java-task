Q10. Write a java program that converts kilometers per hour to miles per hour
Expected Output :
Input kilometers per hour: 15
9.320568 miles per hour

                    import java.util.Scanner;
          class Miles{
    public static void main(String []args){
    Scanner s=new Scanner(System.in);
    float hour,miles;

   System.out.println("enter hour : ");
   hour=s.nextFloat();

  miles=hour*0.6213712f;
 System.out.println("total miles: " +miles);
}
}
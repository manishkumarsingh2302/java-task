import java.util.Scanner;
 class Addmatrix{
       public static void main (String args[]){
             int a[][]=new int [3][3];
             int b[][]=new int [3][3];
             int c[][] =new int [3][3];
         Scanner sk=new Scanner(System.in);
        System.out.print("enter  matrix a");
       for(i=0; i<3; i++){
         for(j=0;j<3;j++){
      a[i][j]=sk.nextInt();
 }
 }
   System.out.print("enter  matrix b");
       for(i=0; i<3; i++){
         for(j=0;j<3;j++){
    b[i][j]=sk.nextInt();
 }
 }
   
    for(i=0; i<3; i++){
         for(j=0;j<3;j++){

      System.out.print (a[i][j]+ "\t");
 }
     System.out.println(" ");
 }
 
for(i=0; i<3; i++){
         for(j=0;j<3;j++){

      System.out.print( b[i][j]+ "\t");
 }
     System.out.print("\n");
 }
  
System.out.println("sum of matrix");
for(i=0; i<3; i++){
         for(j=0;j<3;j++){
     c[i][j]=a[i][j]+b[i][j];
     System.out.print(c[i][j]);
}
    System.out.print("\n");
  }

}
}


  
   
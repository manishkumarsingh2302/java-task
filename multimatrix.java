import java.util.Scanner;
 class multimatrix{
       public static void main (String args[]){
             int a[][]=new int [3][3];
             int b[][]=new int [3][3];
             int c[][] =new int [3][3];
         Scanner sk=new Scanner(System.in);
     int i,j,k;
        System.out.println("enter matrix a");
       for(i=0; i<3; i++){
         for(j=0;j<3;j++){
      a[i][j]=sk.nextInt();
 }
 }//input matrix a
   System.out.println("enter matrix b");
       for(i=0; i<3; i++){
         for(j=0;j<3;j++){
    b[i][j]=sk.nextInt();
 }
 }//input matrix b
    for(i=0; i<3; i++){
         for(j=0;j<3;j++){
           for(k=0; k<3; k++){
         c[i][j]+=a[i][k]*b[k][j];
        }
       }
    }//multiplication logic 
     System.out.println(" Matrix a :"); 
    for(i=0; i<3; i++){
         for(j=0;j<3;j++){

      System.out.print ( "\t" +a[i][j]);
 }
     System.out.println(" ");
 }//print matrix a
    System.out.println(" Matrix b :");
    for(i=0; i<3; i++){
         for(j=0;j<3;j++){

      System.out.print("\t" +b[i][j] );
 }
     System.out.println(" ");
 }
  
System.out.println(" matrix c multiplication :");
  for(i=0; i<3; i++){
         for(j=0;j<3;j++){
     
     System.out.print("\t" +c[i][j]);
}
    System.out.println(" ");
  }

}
}


  
   
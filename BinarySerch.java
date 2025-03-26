//BinarySerch Tree=>serch elament 16 by given arry{2,5,7,8,9,12,14,16,17,18}
 

   public class BinarySerch{
 		public static void main(String args[]){

        int[]a={2,5,7,8,9,12,14,16,17,18};
        int lo=0;
	int hi=a.length;
	int serch=16;
        int mi=(lo+hi)/2;

  while(lo<hi){
	if(a[mi]==serch){

       System.out.println(+mi+"inesx postion");
 break;

  else if(a[mi]<serch)
{
  lo=mi+1;
}
 else(a[mi]>serch){
    hi=mi-1;
}
   mi=(lo+hi)/2;


}   

}
    System.out.println(you choose defoult value);

}

   


	
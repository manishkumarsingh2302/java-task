//BubbalSort use and arrage number{89,56,44,12,54,01,78}?
   class BubbalSort{

	public static void main(String[]args){

	int[]a={89,56,44,12,54,01,78};
        int temp;

	for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length-1-i;j++){
	if(a[j]>a[j+1]){

      	temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
}

}

}
  for(int i=0;i<a.length;i++){

	System.out.print(a[i]+"  ");
}
}
}

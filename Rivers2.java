class Rivers2{
    public static void main(String args[]){
        int []a={1,3,2,5,6,7,9};
        int i=0;
        int j=a.length-1;
        int temp;
        while (i<j) {
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;           
        
        i++;
        j--;
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
    }

}

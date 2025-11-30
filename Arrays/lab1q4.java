public class lab1q4{
    public static void main(String[] args){
         int arr[]= {21, 9, 17, 43, 9, 15, 2,3,2,9,1,1,1,1,6, 6, 38, 6};
         
        int size = arr.length;
      System.out.println("Printing numbers: "+size);     
      for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
      }
        for(int i=0;i<size;i++){
          for(int j=i+1;j<size;j++){  
            if(arr[i]==arr[j]){
               for(int k=j;k<size-1;k++){
                arr[k] = arr[k+1];
               }
               size--;
               j--;
             }
            }
      }
      System.out.println("\nPrinting after duplicate removed elememts: "+size);
      for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
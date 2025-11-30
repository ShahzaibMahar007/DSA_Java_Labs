import java.util.*;
public class lab1q2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        

        System.out.print("Enter size of array1: ");
        int size1 = inp.nextInt();

          System.out.print("Enter size of array2: ");
          int size2 = inp.nextInt();

         int arr1[]= new int[size1];

          int arr2[]= new int[size2];

          System.out.println("\nEnter->"+size1+" elements of array1: ");
          for(int i=0;i<size1;i++){
            arr1[i]= inp.nextInt();
         }

         System.out.println("Enter->"+size2+" elements of array2: ");
         for(int i=0;i<size2;i++){
            arr2[i]= inp.nextInt();
         }



         int arr3[] = new int[size1+size2];

          for(int i=0;i<arr3.length;i++){
            if(i<size1)
                arr3[i]= arr1[i];
            else 
                arr3[i] = arr2[i - size1];
          }
          System.out.println("\nDisplaying elements of the third array: ");
          for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");         
         }
        
        }
    
}

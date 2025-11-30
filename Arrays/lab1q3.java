// In this code I tried my best to find the way check,
// what happens when there is three same elements,
// in the array but up to now i couldn't able to find that way!

import java.util.*;
public class lab1q3{


       public static  int DuplicateElements(int arr[],int size){
            int count=0; 
          for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                  count++;
                }
              }
          }
          if(count>0){
              return count;
          }else{
            return -1;
          }
        }

    public static void main(String[] args){
      Scanner inp = new Scanner(System.in);

      System.out.print("Enter size of array: ");
      int size = inp.nextInt();
        int arr[] = new int[size];
      System.out.println("Enter--> "+size+" elements of array: ");
      for(int i=0;i<arr.length;i++)
        arr[i]= inp.nextInt();
          int check= DuplicateElements(arr,size);
        if(check != -1){
            System.out.println("duplicat found-->"+check);
        }else{
          System.out.println("No duplicate found!");
        }



    }
}
import java.util.*;

public class lab1q5{
    public static  void FrequencyChecker(int arr[],int size){
             boolean checked[] = new boolean[size];
            for(int i=0;i<size;i++){
                if(checked[i]) continue;
                int count=1;
                for(int j=i+1;j<size;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        checked[j]= true;
                    }
                }
                System.out.println(arr[i]+ " occurs "+count);
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
        FrequencyChecker(arr,size);
        
    }
}
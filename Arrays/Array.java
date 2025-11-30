import java.util.Scanner;
public class Array {


    public static void main(String[] args){
        

    
        int arr[][] = {{1,2,3},
                       {0,0,1},
                       {5,4,2}
                      };
        int sum1 = 0;
        System.out.println("2D Array elements: ");
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }


        for(int i= 0;i<arr.length;i++){
            sum1 += arr[i][0];
        }

        boolean iscol= true;

        for(int i =1;i<arr[0].length;i++){

            int sum2 = 0;
            for(int  j=0;j<arr[i].length;j++){
                    sum2 += arr[j][i];
            }
            if(sum2 != sum1){
                iscol = false;
                break;
            }
        }

        if(iscol){
            System.out.println("column magic");
        }else{
            System.out.println("Not in the column magic");
        }

    
  }
}



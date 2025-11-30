import java.util.*;
public class lab1q6{
    public static void RowMagicPrint(int arr[][],int row,int column){
                       
                      
                         System.out.println("\nPrinting matrix-->");
                    for(int i=0;i<row;i++){ 
                        for(int j=0;j<column;j++){
                            System.out.print(arr[i][j]+" ");    
                        }
                        System.out.println();         
                    }
                      
                     int sum[] = new int[row];
                    for(int i=0;i<row;i++){
                        for(int j=0;j<column;j++){
                            sum[i] +=arr[i][j];      
                             
                        }
                        System.out.println();     
                    }

                    System.out.println("Sum of row  elements: ");
                    for(int i=0;i<sum.length;i++){
                        System.out.print(sum[i]+" ");
                    }
                    

                    
                    boolean check = true;
                    System.out.println("\nChecking-->");
                    for(int i=0;i<sum.length;i++){
                            if(sum[i] != sum[0]){
                                check = false;
                                break;
                            }
                        
                    }
                    if(check){
                        System.out.println("Array is in row magic order");
                    }else{
                        System.out.println("Not in the row magic order!");
                    }

                      
                   
                    
    }
    
    public static void main(String[] args){
            Scanner inp = new Scanner(System.in);

            System.out.print("Enter rows: ");
            int row = inp.nextInt();
            System.out.print("Enter column: ");
            int col = inp.nextInt();

            int arr[][] = new int[row][col];
                System.out.println("Enter elements of matrix: ");
                for(int i=0;i<row;i++){
                        System.out.println("row: "+(i+1));
                        for(int j=0;j<col;j++){
                            arr[i][j]= inp.nextInt();
                        }
                    }
                 RowMagicPrint(arr,row,col);   

    }
}
public class lab1q9 {
    public static void flippedArray(int arr[][],int row,int col){
        System.out.println("Printing original 2D array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("\nPrinting flipped version of 2d array verticle: ");
        for(int i=row-1;i>=0;i--){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args){
       int arr[][] = {
            {1,3,4},
            {5,6,7},
            {4,2,1},
        };

        int row= arr.length;
        int col = arr[0].length;
        flippedArray(arr, row, col);
    }
    
}

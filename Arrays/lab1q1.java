import java.util.*;
public class lab1q1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = inp.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println("\nPrinting array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        int Carr[] = new int[size];  

        
        for (int i = 0; i < size; i++) {
            Carr[i] = arr[size - 1 - i];
        }

        System.out.println("\nConpied into another array and  Reversed nelements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(Carr[i] + " ");
        }
    }
}

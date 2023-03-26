package lab1;
import java.util.Scanner;

public class Array {
    public int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfarray = sc.nextInt();
        int[] array = new int[sizeOfarray];
        for (int i = 0; i < sizeOfarray; i++) {
            System.out.println("Enter element #"+(i+1));
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }
    public void printArray(int[] arr){
        System.out.println("printing array...");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.print(arr[i]);
        }
        System.out.print("]");
    }
    public int[] bubbleSort(int [] arr){
        int[] sorted = arr;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if( arr[j] > arr[j+1]){
                    int temp = sorted[j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = temp;
                }
            }
        }
        return sorted;
    }
    public int[] mergeSort(int [] arr){
        int [] merged = arr;

        return merged;
    }
}

import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        //int[] array = {3, 1, 5, 99, 3, 12};
        //int[] array = {-1, 6, 9, 8, 12};
        //System.out.println("Smallest " + smallest(array));
        //System.out.println("Index of the smallest number: " + indexOfSmallest(array));
        //System.out.println("Smallest number after a certain value: " + indexOfSmallestFrom(array, 2));
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
        //MainProgram.swap(numbers, 0, 1);
        //System.out.println(Arrays.toString(numbers));
   }
    
    public static int smallest(int[] arr){
        int smallest = arr[0];
        
            for(int i = 0; i < arr.length; i++){
               if(arr[i] < smallest)
                   smallest = arr[i];
                }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] arr){
        int smallest = smallest(arr);
        int smallestIndex = 0;
                
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == smallest)
                smallestIndex = i;
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        int index = 0;
        //the method indexOfSmallestFrom did not work with the input -1, 3, 1, 2 
        //start index 1 expected:<2> but was:<3>
        for(int i = startIndex; i < table.length; i++){
            if(table[i] < smallest){
                //smallest = table[i];
                index = i;
            }
        }
       return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = 0;
            temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
    }
    
    public static void sort(int[] array){
        
        /*for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            swap(array, i,indexOfSmallestFrom(array, i));
        }*/
        
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                   int temp = 0;
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        
     }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        
        int[] intArr = {3, 1, 5, 99, 3, 12};
        
        String[] strArr = {"Learning", "Java", "Is", "cool"};
        
        ArrayList<String> strList = new ArrayList<>();
        strList.add("ai");
        strList.add("Java");
        strList.add("MOOC");
        strList.add("OOP");
        
        ArrayList<Integer> intList = new ArrayList<>();
        int[] values = {2003, 19, 12, 3, 10004, 1};
        
        for(int value : values){
            intList.add(value);
        }
        
        sort(intArr);
        System.out.println(Arrays.toString(intArr));
        
        sort(strArr);
        System.out.println(Arrays.toString(strArr));
        
        sortIntegers(intList);
        System.out.println(intList);
        
        sortStrings(strList);
        System.out.println(strList);
    }
    
    
    
    public static void sort(int[] array){
            Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}

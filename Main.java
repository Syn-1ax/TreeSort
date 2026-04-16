
//  This is Suitable for Copy Pasting instead of must inputing the values you want.
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    
        // CHANGE ARRAY HERE IF USING THIS METHOD
        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(10,5,8,3,1,5)); // Chane the Values in the asList part, comma spaced, to paste your own Array instead.
        ArrayList<Integer> SortedList = TreeSort.sort(List);                       // Array cannot be empty. for obvious reasons (What are you sorting if its empty?)

        System.out.println("Unsorted List: " + List);
        System.out.println("Sorted List: " + SortedList);
    }
}

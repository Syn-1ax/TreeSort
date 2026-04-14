
//  This is Suitable for Copy Pasting instead of must inputing the values you want.
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    
        // CHANGE ARRAY HERE IF USING THIS METHOD
        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(4,2,3,5,1)); // Chane the Values in the asList part, comma spaced, to paste your own Array instead.
        ArrayList<Integer> SortedList = TreeSort.sort(List);

        System.out.println("Unsorted List: " + List);
        System.out.println("Sorted List: " + SortedList);
    }
}

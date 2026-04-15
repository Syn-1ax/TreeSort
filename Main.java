
//  This is Suitable for Copy Pasting instead of must inputing the values you want.
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    
        // CHANGE ARRAY HERE IF USING THIS METHOD
        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(4,2,3,5,1)); // Chane the Values in the asList part, comma spaced, to paste your own Array instead.
        ArrayList<Integer> SortedList = TreeSort.sort(List);                       // Array cannot be empty. for obvious reasons (What are you sorting if its empty?)


        // Array Validifier (From my USERINPUT script, but modified):
        boolean validarray = false;
        double n = List.size();
        if(n % 1 == 0 || n > 0){
            validarray = true;
        }

        // Printed Output Here:
        if(!validarray){
            System.out.println("ARRAY ERROR: Must Be Whole Number's Above 0 ONLY.");
        }else{
            System.out.println("Unsorted List: " + List);
            System.out.println("Sorted List: " + SortedList);
        
        }
    }
}

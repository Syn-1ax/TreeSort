import java.util.ArrayList;
import java.util.Scanner;

// This Version of The File Is Used For if you want to input the numbers manually
// Basically, if you dont have some copy paste of the list, but want to test random numbers
public class MainUSERINPUT {
    public static void main(String[] args){
    
    // Manual Inputter:
        Scanner UserInput = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();

    // Challenge for Array Length:
    System.out.print("Amount of Numbers In List? ");
    double n = UserInput.nextDouble(); // Yeah, might be counter productive allowing then forbidding non whole integers
                                       // However, it's solely to give the user the information on whats allowed as valid values.

    // Valid Array Checker:
        // Using a Modulo Operator
        boolean validarray = false;
        // n % 1 == 0. any whole number mod 1 is 0, if its not whole, it'll not be 0
        // n must be above 0 to also be valid
        if(n % 1 == 0 && n > 0){ 
            validarray = true;
        }
    

    // Simple validity check, if not validarray, will not proceed, and will end
    if (!validarray){
        System.out.println("ARRAY ERROR: Must Be Whole Number's Above 0 ONLY.");
        UserInput.close();
    }else{
        // Challenge for ALl Manual Inputs
        System.out.println("Enter " + n + " Numbers: ");
        for (int i = 0; i < n; i++){ 
            System.out.print("Number " + (i + 1)+ ":");
            List.add(UserInput.nextInt());
        }
        // Does as it says, prints both the unsorted, and sorted list.
        System.out.println("Unsorted List: " + List);
        System.out.println("Sorted List: " + TreeSort.sort(List));
        UserInput.close();
        }
    }
}
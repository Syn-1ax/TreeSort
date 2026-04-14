import java.util.ArrayList;
import java.util.Scanner;

// This Version of The File Is Used For if you want to input the numbers manually
// Basically, if you dont have some copy paste of the list, but want to test random numbers
public class MainUSERINPUT {
    public static void main(String[] args){
    
    // Manual Inputter:
        Scanner UserInput = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();


    System.out.print("Amount of Numbers In List? ");
    int n = UserInput.nextInt();

    System.out.println("Enter " + n + " Numbers:");
    for (int i = 0; i < n; i++){
        System.out.print("Number " + (i + 1)+ ":");
        List.add(UserInput.nextInt());
    }

    System.out.println("Unsorted List: " + List);
    System.out.println("Sorted List: " + TreeSort.sort(List));
    UserInput.close();
    }
}
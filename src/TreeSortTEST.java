// CHANGE THIS TO THE README SOURCES
// https://junit.org/junit5/docs/current/user-guide/
// https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

public class TreeSortTEST{

    @Test
    public void TestSort(){

        // Testing the Testing ArrayList<Integer>
        ArrayList<Integer> Given = new ArrayList<>(Arrays.asList(10,5,8,3,1,5));
        ArrayList<Integer> Desired = new ArrayList<>(Arrays.asList(1, 3, 5, 5, 8, 10));
        ArrayList<Integer> Result = TreeSort.sort(Given);

        // Print Result:
        System.out.println("Given Array: " + Given);
        System.out.println("Desired Output: " + Desired);
        System.out.println("TreeSorter Output: " + Result); // This is the output by the sorter.

        // JUNIT Test
        assertEquals(Desired, Result);
        // Will Give a Fail if Desured does not Equal Result
    }
}
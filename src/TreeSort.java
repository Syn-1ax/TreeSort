
import java.util.ArrayList;
public class TreeSort {

    public static void main(String[] args){
    }

    // Sort Using Tree Sort
    // This is just a way to apply TreeSort.sort([Array Here]) to whatever youre attempting to sort
    public static ArrayList<Integer> sort(ArrayList<Integer> x){
        
        // First Start At The Root
        // The Root being at index 0 of the list "x"
        Node root = new Node(x.get(0));

        // Continuously add Numbers to the Root Node
        for(int i = 1 ; i < x.size(); i++){
            root.add_item(x.get(i));
        }

        // Walk and return the tree list, but now sorted.
        // This part doesnt have a 0 notify case, however, this is sorted in the MainUSERINPUT file, and also because you cant sort a Zero List, it shouldnt do much but cause an error and close
        return root.walk();
    }
}

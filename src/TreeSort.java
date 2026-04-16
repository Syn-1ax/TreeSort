// If you really want to use the seperated one's (For analysis or usage reasons), replace it with the ZipFIle one, AND also add the Node.java.
// They work the exact same, but since this is one file, it should be easier to use (its not a large script anyway)

// This Is the Main TreeSorting Thing.
// Returns the list in Ascending Order.
import java.util.ArrayList;

public class TreeSort {
    // Initialisation:
    public static class Node{
        int ArrayData;
        Node Left;
        Node Right;

    // Constructors to Init the attributes
    public Node(int x){
        ArrayData = x;
        Left = null;
        Right = null;
    }

    // List Movement and Adding
    public void add_item(int a){
        if(a < ArrayData){
            // Go Left Case
            if(Left == null){
                Left = new Node(a); // Add new if None Found
            }else{
                Left.add_item(a); // Go further Left
            }
        }else{
            // Go Right Case
            if(Right == null){
                Right = new Node(a); // Add New if none found
            }else{
                Right.add_item(a); // Go further right
            }
        }
    }

    // Tree Walk Part
    public ArrayList<Integer> walk(){
        ArrayList<Integer> list = new ArrayList<>();
        TreeWalk(list);
        return list; // Returns an entire list, but sorted
    }
    // No calling this part outside of this file.
    private void TreeWalk(ArrayList<Integer> list){
        // Go Left
        if(Left != null){
            Left.TreeWalk(list);
        }
        // Adds the Element to the List
        list.add(ArrayData);
        // Go Right
        if(Right != null){
            Right.TreeWalk(list);
            }
        }
    }

    // The Sorter
    // This is like applying TreeSort.sort([Array Here]) to whatever youre attempting to sort
    public static ArrayList<Integer> sort(ArrayList<Integer> x){

        // MAKING SURE ITS NOT A ZERO LENGTH LIST FIRST.
        if(x.isEmpty()){
            System.out.println("Empty/Zero-Length List Detected.");
            return new ArrayList<>(); // Will spit out a sorted unsorted thats literally nothing
        }
        Node root = new Node(x.get(0));
        // Continuously add Numbers to the Root Node but going in the desired order to sort in (Ascending)
        for(int i = 1; i < x.size(); i ++){
            root.add_item(x.get(i));
        }

        // Walk and return the tree list, but now sorted.
        return root.walk();
    }
}
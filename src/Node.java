// Nodes being the point where the numbers are
import java.util.ArrayList;

public class Node {
    // Attributes Being Held:
    int ArrayData;
    Node Left;
    Node Right;

    // Constructor For Attributes (initialisation):
    public Node(int x){
        ArrayData = x;
        Left = null;
        Right = null;
    }

    // Movement Along the List to add items
    public void add_item(int a){
        if(a < ArrayData){
            // Go Left Case
            if (Left == null){
                Left = new Node(a); // new node left, since you found nothing here.
            }else{
                Left.add_item(a); // Go Further Left until you find nothing there
            }
        }else{
            // Go Right Case
            if (Right == null){
                Right = new Node(a); // New Node Right, since you found nothing here.
            }else{
                Right.add_item(a); // Go Further Right until you find nothing there
            }
        }
    }

    // Tree Walking
    // Sets up an Emtpy List beforehand
    // Treewalk(list) gets the list filtered
    // return list sends it back to walk()
    public ArrayList<Integer> walk(){
        ArrayList<Integer> list = new ArrayList<>();
        TreeWalk(list);
        return list;
    }

    // Adds stuff to list Recursively
    // Private because you dont want anyone calling this on accident.
    // Its entire purpose is walking left to right, adding to the list as it went along.
    private void TreeWalk(ArrayList<Integer> list){ 
        // Go Left
        if (Left != null){
            Left.TreeWalk(list);
        }
        // Add Current Number To Data
        list.add(ArrayData);
        // Go Right
        if (Right != null){
            Right.TreeWalk(list);
        }
    }
}
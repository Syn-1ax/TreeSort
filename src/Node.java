
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

    public void add_item(int a){
        if(a < ArrayData){
            // Go Left Case
            if (Left == null){
                Left = new Node(a); // new node left
            }else{
                Left.add_item(a); // Go Further (Recursive)
            }
        }else{
            // Go Right Case
            if (Right == null){
                Right = new Node(a); // New Node Right
            }else{
                Right.add_item(a); // Go Further (Recursive)
            }
        }
    }

    // Tree Walking
    public ArrayList<Integer> walk(){
        ArrayList<Integer> list = new ArrayList<>();
        TreeWalk(list);
        return list;
    }

    // Adds stuff to list
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
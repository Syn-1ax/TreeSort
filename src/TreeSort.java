// In my project, i also have seperated the code to make it clearer
// Upon Second Look, this version is a lot better (i had to clean it up a lot and recomment parts due to it being incompatible with my previous version).
// If you really want to use the seperated one's (For analysis or usage reasons), replace it with the ZipFIle one, AND also add the Node.java.
// They work the exact same, but since it's one file, it should be easier to use (its not a large script anyway)


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
        return list;
    }
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
        Node root = new Node(x.get(0));
        // Continuously add Numbers to the Root Node but going in the desired order to sort in (Ascending)
        for(int i = 1; i < x.size(); i ++){
            root.add_item(x.get(i));
        }

        // Walk and return the tree list, but now sorted.
        // This part doesnt have a 0 notify case, however, this is sorted in the MainUSERINPUT file, and also because you cant sort a Zero List, it shouldnt do much but cause an error and close
        return root.walk();
    }

    // Must Have or it refuses to work
    public static void main(String[] args){}
}
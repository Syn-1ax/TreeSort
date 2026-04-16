// In my project, i seperated the code to make it clearer
// This provided version is what the original original looked like
// I worked alot of this online (With me rewriting into vscode)
// This is pretty much what i worked with until seperating everything for clarity (and because i just wanted to see if i could) reasons
// (Forgot to provide it before writing everything)
// If you really want to use this, move this entire file into src, and rename it to "TreeSort.java", of course, move the other TreeSort and Node files out.

import java.util.ArrayList;

public class TreeSortCombined {

    // Initialising Stuff
    public static class Node{
        int ArrayData;
        Node Left;
        Node Right;

    // Constructor Part
    public Node(int x){
        ArrayData = x;
        Left = null;
        Right = null;
    }


    // List Movement and Adding
    public void add_item(int a){
        if(a < ArrayData){
            if(Left == null){
                Left = new Node(a);
            }else{
                Left.add_item(a);
            }
            if(Right == null){
                Right = new Node(a);
            }else{
                Right.add_item(a);
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


    // The Sorter
    public static ArrayList<Integer> sort(ArrayList<Integer> x){
        Node root = new Node(x.get(0));
        for(int i = 1; i < x.size(); i ++){
            root.add_item(x.get(i));
        }
        return root.walk();
    }

    // Must Have or it refuses to work
    public static void main(String[] args){}
    }
}
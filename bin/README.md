# Treesort Project | Two Mains

## Quick Overview:

This Project's task was to create a TreeSorting Algorithm, which would be able to sort An Array/List into Numerical Order.

For instance:

Unsorted List = [10,5,8,3,1,5]
Sorted List = [1,3,5,5,8,10]

In Essence, the TreeSort algorithm will sort Elements into Ascending Order.
It does this through creating a binary tree, and establishing a Root Node (First element of the list). Each following number then travels down the tree, at every node it passes, if the value is less than the current node, it goes left, if it is equal to or greater than the current, then it goes right. This continues until the number finds an empty spot and is inserted there.

Once all numbers have been inserted, the tree is walked in-order, left subtree first, then the current node, then the right subtree. Leaving us with, once it walk's through the list, starting with the Left Side, and them going to the Right, we get our list back in ascending order.



## A Diagram (Provided By Dr Thomas Bending)

[GRAPH EXAMPLE HERE]



## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

public class Starter {
    public static void main(String[] args) {
//        Tree object
        BinarySearchTree BST = new BinarySearchTree();

//        Inserting values into tree
        BST.insert(40);
        BST.insert(100);
        BST.insert(68);
        BST.insert(84);
        BST.insert(32);

//        Showing the different traversal orders
        System.out.println("In Order Traversal:" + BST.displayInOrder());
        System.out.println("Pre Order Traversal:" + BST.displayPostOrder());
        System.out.println("Post Order Traversal:" + BST.displayPostOrder());

//        Searching if the number 100 exist in tree
        int searchNumber = 100;
        if(BST.search(searchNumber)){
            System.out.println(searchNumber + " Found in the tree ");
        }else{
            System.out.println(searchNumber + " Not found in the tree ");
        }

//        Getting the max value from tree object
        int maxValue = BST.getMax();
        System.out.println("Max value: "+ maxValue);

//        Deleting the whole tree
        BST.delete();
        System.out.println("Tree deleted");
    }
}

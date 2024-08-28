class BSTNode {
    int value;
    BSTNode left, right;

    public BSTNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}
public class BinarySearchTree {
    private BSTNode root;

    public BinarySearchTree() {
        root = null;
    }


    //        Inserts a value into the tree
    public void insert(int value) {
        root = insertNumber(root, value);
    }

    private BSTNode insertNumber(BSTNode root, int value){
        if(root == null){
            root = new BSTNode(value);
            return root;
        }
        if(value < root.value){
            root.left = insertNumber(root.left,value);
        } else if (value > root.value) {
            root.right = insertNumber(root.right, value);
        }
        return root;
    }

    //        Searches for a value in the tree
    public boolean searchNumbers(BSTNode root, int value){
        if(root == null){
            return false;
        }
        if(root.value == value){
            return true;
        }
        if(value < root.value){
            return searchNumbers(root.left, value);
        }
        return searchNumbers(root.right, value);
    }
    public boolean search(int value) {
        return searchNumbers(root, value);
    }

    //        Gets max value
    public int getMax() {
        return findMax(root);
    }

    //        Finds the max value
    private int findMax(BSTNode root){
        if(root.right == null){
            return root.value;
        }
        return findMax(root.right);
    }

    //        Deletes the whole tree
    public void delete() {
        root = null;
    }


    //        Displays the preorder traversal using recursion
    private String displayPreOrderRoot(BSTNode root){
        StringBuilder PreOrderOutcome = new StringBuilder();
        if(root != null){
            PreOrderOutcome.append(root.value).append(" ");
            PreOrderOutcome.append(displayPreOrderRoot(root.left));
            PreOrderOutcome.append(displayPreOrderRoot(root.right));
        }
        return PreOrderOutcome.toString();
    }
    public String displayPreOrder(BSTNode root) {
        return displayPreOrderRoot(root);
    }


    //        Displays in order traversal using recursion
    private String displayInOrderRoot(BSTNode root){
        StringBuilder InOrderOutcome = new StringBuilder();
        if(root != null){
            InOrderOutcome.append(displayInOrderRoot(root.left));
            InOrderOutcome.append(root.value).append(" ");
            InOrderOutcome.append(displayInOrderRoot(root.right));
        }
        return InOrderOutcome.toString();
    }
    public String displayInOrder() {
        return displayInOrderRoot(root);
    }



    //        Displays post order traversal using recursion
    private String displayPostOrderRoot(BSTNode root){
        StringBuilder PostOrderOutcome = new StringBuilder();
        if(root != null){
            PostOrderOutcome.append(displayPostOrderRoot(root.left));
            PostOrderOutcome.append(displayPostOrderRoot(root.right));
            PostOrderOutcome.append(root.value).append(" ");
        }
        return PostOrderOutcome.toString();
    }
    public String displayPostOrder() {
        return displayPostOrderRoot(root);
    }
}



public class Binarysearchtreeinclass{
     public static void main(String[] args){
        System.out.println("Binary tree: ");

        BST bst = new BST();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        bst.inorder(bst.root); // Output: 20 30 40 50 60 70 80


        
     }
}

class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
    
}
class BST{
    Node root;
    BST(){
        this.root = null;
    }

    void insert(int data){
        Node add = new Node(data);

        if(isEmpty()){
            root = add;
            return;
        }
        Node temp = root;
        Node parent = null;

        while(temp != null){
            parent = temp;
            if(data < temp.data){
                 temp = temp.left;
            }else{
               temp = temp.right;
            }
        }

        if(data < parent.data){
            parent.left = add;
        }else{
            parent.right= add;
        }
    }

        void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        void delete(Node node, int data){
            if(isEmpty()){
                System.out.println("BST does not exist!");
                return;
            }

        }

    boolean isEmpty(){
        if(root == null)
            return true;
        else
            return false;
    }



}
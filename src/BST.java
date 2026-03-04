import com.sun.security.jgss.GSSUtil;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
// for INSERT also --- 0(H) time complexity
    public static Node insert (Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
            root.left = insert(root.left,val);
        }else{
            //right subtree
            root.right = insert(root.right,val);
        }
        return root;

    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Search Tree ---- 0(H)
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }

        if(root.data == key ){
            return true;
        }
        if(root.data > key){
            return search(root.left,key);
        } else{
            return search(root.right,key);
        }
    }


    //Delete the node
    public static Node Delete(Node root,int val){

        if(root.data < val){

            root.right = Delete(root.right,val);

        } else if (root.data > val) {

            root.left = Delete(root.left,val);

        }else{
            //case 1 -- leaf node
            if(root.left == null && root.right == null ){
                return null;
            }

            // case 2 -- single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3 -- two childern first we find the inorder sussecor and then replace tht
            // val with original and delete the is node

            Node IS = findinordersuc(root.right);
            root.data = IS.data;
            root.right = Delete(root.right,IS.data);

        }
        return root;
    }

    public static Node findinordersuc(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]){
        int values[] = {5,1,2,4,3,7};
        Node root = null;

        for(int i = 0;i< values.length;i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        root = Delete(root,2);
        System.out.println();
        root = Delete(root,1);
        inorder(root);

    }

}

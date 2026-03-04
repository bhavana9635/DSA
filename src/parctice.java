import java.util.LinkedList;
import java.util.Queue;

public class parctice {

        static class Node {
            int data;
            Node right;
            Node left;

            Node(int data) {
                this.data = data;
                this.right = null;
                this.left = null;
            }
        }


    static class BinaryTree
    {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;

        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void levelorder(Node root){

            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node CurrNode = q.remove();
                if(CurrNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(CurrNode.data+" ");
                    if(CurrNode.left != null){
                        q.add(CurrNode.left);

                    }
                    if(CurrNode.right != null){
                        q.add(CurrNode.right);


                    }


                }
            }

        }
    }


    public static void main(String[] args)
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        //System.out.println(root.data);
        //tree.preorder(root);
        tree.levelorder(root);
    }

}
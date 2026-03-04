public class Balancedtree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node CreateBST(int[] values, int st, int en) {
        if (st > en) {
            return null;
        }

        int mid = (st + en) / 2;
        Node root = new Node(values[mid]);

        root.left = CreateBST(values, st, mid - 1);
        root.right = CreateBST(values, mid + 1, en);

        return root;
    }

    public static void main(String args[]) {
        int values[] = {1, 2, 3, 4, 5, 6, 7};

        Node root = CreateBST(values, 0, values.length - 1);

        preorder(root);
    }
}
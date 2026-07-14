import java.util.*;
public class abc {

    static class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = right = null;
        }
    }
//
    static class Tree {
        Node root;

        void add(int x) {
            root = insert(root, x);
        }
//
        private Node insert(Node node, int x) {
            if (node == null)
                return new Node(x);

            if (x < node.data)
                node.left = insert(node.left, x);
            else if (x > node.data)
                node.right = insert(node.right, x);

            return node;
        }
//
        void inorder(Node node) {
            if (node != null) {
                inorder(node.left);
                System.out.print(node.data + " ");
                inorder(node.right);
            }
        }
//
        void preorder(Node node) {
            if (node != null) {
                System.out.print(node.data + " ");
                preorder(node.left);
                preorder(node.right);
            }
        }
//
        void postorder(Node node) {
            if (node != null) {
                postorder(node.left);
                postorder(node.right);
                System.out.print(node.data + " ");
            }
        }
        //
        void bfs(Node node)
        {
            if(node==null)
            {
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(node);
            while(!q.isEmpty())
            {
                Node current= q.poll();
                System.err.print(current.data + " ");
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }

        }
        //
        int sumofnode(Node node)
        {
            if(node==null) return 0;
            return node.data + sumofnode(node.left) + sumofnode(node.right);
        }
        //
        int lefthight(Node node)
        {
            if(node==null) return 0;
            return 1+ lefthight(node.left);
        }
        //
        int righthight(Node node)
        {
            if(node==null) return 0;
            return 1+ righthight(node.right);
        }
        //
        int countNode(Node node)
        {
            if(node==null)
            {
                return 0;
            }
            return 1+ countNode(node.left)+ countNode(node.right);

        }
        //
        int countleaf(Node node)
        {
            if(node == null)
            {
                return 0;
            }
            if(node.left==null) return 1;
            if(node.right==null) return 1;
            return countleaf(node.left) + countleaf(node.right);
        }
    }

    public static void main(String[] args) {

        Tree t = new Tree();

        t.add(7);
        t.add(2);
        t.add(3);
        t.add(5);
        t.add(6);
        t.add(8);
        t.inorder(t.root);
        System.out.println();
        t.preorder(t.root);
        System.out.println();
        t.postorder(t.root);
        System.out.println();
        t.bfs(t.root);
        System.out.println();
        System.err.println(t.sumofnode(t.root));
        System.err.println(t.lefthight(t.root));
        System.err.println(t.righthight(t.root));
        System.err.println(t.countNode(t.root));
        System.err.println(t.countleaf(t.root));
    }
}
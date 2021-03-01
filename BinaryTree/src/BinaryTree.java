import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	private static Node root;
	private static Node temp=root;
	
	private static class Node{
		Node left,right;
		int data;
		Node(int data){
			this.data=data;
		}
	}
	
	public static void insert(Node temp,int data) {
		  if (temp == null) {
	            root = new Node(data);
	            return;
	        }
	        Queue<Node> q = new LinkedList<Node>();
	        q.add(temp);
	 
	        while (!q.isEmpty()) {
	            temp = q.peek();
	            q.remove();
	 
	            if (temp.left == null) {
	                temp.left = new Node(data);
	                break;
	            }
	            else
	                q.add(temp.left);
	 
	            if (temp.right == null) {
	                temp.right = new Node(data);
	                break;
	            }
	            else
	                q.add(temp.right);
	        }
	}
	
	private static void print(Node temp) {
		if(temp==null)
			return;
		print(temp.left);
		System.out.print(temp.data+" ");
		print(temp.right);
	}
	public static void main(String[] args) {
	 	root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
 
        System.out.print(
            "Inorder traversal before insertion:");
        print(root);
 
        int data = 12;
        insert(root,data);
 
        System.out.print(
            "\nInorder traversal after insertion:");
        print(root);
}
}

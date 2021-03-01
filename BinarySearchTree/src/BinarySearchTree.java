 
public class BinarySearchTree {
	private Node root;
	private class Node{
		private int data;
		private Node left;
		private Node right;
		Node(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		 BinarySearchTree tree = new BinarySearchTree(); 
		  
	        /* Let us create following BST 
	              50 
	           /     \ 
	          30      70 
	         /  \    /  \ 
	       20   40  60   80 */
	        tree.insert(50); 
	        tree.insert(30); 
	        tree.insert(20); 
	        tree.insert(40); 
	        tree.insert(70); 
	        tree.insert(60); 
	        tree.insert(80); 
	  
	        // print inorder traversal of the BST 
//	        tree.print(); 
//	        System.out.println();
//	        tree.search(100);
//	        tree.print();
	        System.out.println(
	                "Inorder traversal of the given tree");
	            tree.print();
	     
	            System.out.println("\nDelete 20");
	            tree.delete(20);
	            System.out.println(
	                "Inorder traversal of the modified tree");
	            tree.print();
	     
	            System.out.println("\nDelete 30");
	            tree.delete(30);
	            System.out.println(
	                "Inorder traversal of the modified tree");
	            tree.print();
	     
	            System.out.println("\nDelete 50");
	            tree.delete(50);
	            System.out.println(
	                "Inorder traversal of the modified tree");
	            tree.print();
	            
	            System.out.println("\nDelete 80");
	            tree.delete(80);
	            System.out.println(
	                "Inorder traversal of the modified tree");
	            tree.print();
	}
	
	private void delete(int data) {
		root=deleteRec(root,data);
	}

	private Node deleteRec(Node root, int data) {
		if(root==null)
			return root;
		if(data<root.data) {
			root.left=deleteRec(root.left, data);
		}else if(data>root.data) {
			root.right=deleteRec(root.right, data);
		}else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			root.data=minValue(root.right);
			
			root.right=deleteRec(root.right, root.data);
		}
		return root;
	}

	private int minValue(Node root) {
		int minv=root.data;
		while(root.left!=null) {
			minv=root.left.data;
			root=root.left;
		}
		return minv;
	}

	private void search(int data) {
		root=searchRec(root,data);
	}

	private Node searchRec(Node root, int data) {
		if(root==null) {
			return null;
		}else if(root.data==data)
			return root;
		if(data<root.data)
			return searchRec(root.left, data);
		return searchRec(root.right, data);
	}

	private void print() {
		printRec(root);
	}

	private void printRec(Node root) {
		if(root==null)
			return;
		printRec(root.left);
		System.out.print(root.data+" ");
		printRec(root.right);
	}

	private void insert(int data) {
		root=insertRec(root,data);
	}

	private Node insertRec(Node root, int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		
		if(data<root.data) {
			root.left=insertRec(root.left, data);
		}else if(data>root.data) {
			root.right=insertRec(root.right, data);
		}
		return root;
	}
}

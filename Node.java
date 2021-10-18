package nodes;

public class Node {
	Node root;
	Node left;
	Node right;
	


	public static void main(String[] args) {
		LeastCommonAncestor  lca=new LeastCommonAncestor() ;
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(20);
		
	}
}

package W3L10;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );
		    System.out.print(t.element+",");
		    printTree( t.right );
		} 
	}
		 
	//Assume the data in the Node is an Integer.	

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		
	public void preOrder(){
		preOrder(root);
	}
	private void preOrder(BinaryNode t){//implement
	//	List<BinaryNode> list= new ArrayList<BinaryNode>();
		List<BinaryNode> ls= new LinkedList<>();
		if(t==null) return;
		else ls.add(t);
		while(ls.size()>0){
				BinaryNode nd= ls.remove(0);
				System.out.print(nd.element+",");
				if(nd.left!=null) ls.add(nd.left);
				if(nd.right!=null) ls.add(nd.right);
			
		}
	}
	
	public void postOrder(){
		postOrder(root);
	}
	private void postOrder(BinaryNode t){ //implement 
		if(t==null) return;
		if(t.left!=null) postOrder(t.left);
		if(t.right!=null) postOrder(t.right);
		System.out.print(t.element+",");
	}
	
	public boolean contains(Integer key){ //implement 
		BinaryNode bd=root;
		if(bd==null) return false;
		while(bd!=null){
			if(bd.element==key) return true;
			else if(bd.element>key) bd=bd.left;
			else bd=bd.right;
		}
		return false;

	}
	
	
	public Integer getRoot(){//implement 
		if(root==null) return null;
		return root.element;
	}
	
	public Integer leafNodes(){
		return leafNodes(root);
	} 
	private int leafNodes(BinaryNode t){// Implement
		if(t==null) return 0;
		if(t.left==null&&t.right==null) return 1;
		else if(t.left!=null&&t.right!=null) return leafNodes(t.left)+leafNodes(t.right);
		else if(t.left!=null) return leafNodes(t.left);
		else  return leafNodes(t.right);
		
	}
	
	public int size(){//implement
		return getSize(root);
	}
	private int getSize(BinaryNode t){
		if(root==null) return 0;
		else if(t.left!=null&&t.right!=null) return getSize(t.left)+getSize(t.right)+1;
		else if(t.left!=null) return  getSize(t.left)+ 1;
		else if(t.right!=null) return getSize(t.right)+1;
		else return 1;
		
	}

	public boolean isEmpty(){//implement
		return root==null? true:false;// check the tree is empty or not
	}
	
	public Integer findMin(){
	      return findMin(root);
	}
	private Integer findMin(BinaryNode t){//implement 
		if(t==null) return null;
		while(t.left!=null) t=t.left;
		return t.element;
	}
	
	public Integer findMax(){
	      return findMax(root);
	}
	public Integer findMax(BinaryNode t){// implement 
		if(t==null) return null;
		while(t.right!=null) t=t.right;
		return t.element;
	}




	
	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
	
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		mybst.insert(12);
		System.out.println("the inorder:");
		mybst.printTree();
		System.out.println("\nthe preOrder:");
		 mybst.preOrder();
		 System.out.println("\nthe postOrder:");
		 mybst.postOrder();
		 
		System.out.println("\ncontians 2 :"+mybst.contains(2));
		System.out.println("contains 4 :"+mybst.contains(4));
		System.out.println("the number of leafNodes :"+mybst.leafNodes());
		System.out.println("the size of tree :"+mybst.size());
		System.out.println("find min :"+mybst.findMin());
		System.out.println("find Max :"+mybst.findMax());
		
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		
//		for (int j = 0; j < a.length; j++ ) {
//			ts.add(a[j]);
//			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
//			Iterator<Integer> it = ts.iterator();		
//			Integer nextItem = null;
//			while(it.hasNext()) {
//				nextItem = it.next();
//				System.out.print(nextItem + " ");
//			} 
//			System.out.println();
//		}
//		
//		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//		map.put(8, "Hello");
//		map.put(10, "World!");
//		map.put(11, "Welcome");
//		map.remove(8);
//		String str = map.get(11)+", "+ map.get(10);
//		System.out.println(str);
			
	}
}

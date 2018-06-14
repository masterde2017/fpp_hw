package W3L9;

interface Stack1<T> {
	public void push(char t);

	public T pop();

	public T peek();

	public boolean isEmpty();

	public int size();
}

class Node{
	Node pre;
	char  value;
	Node next;
	public Node(Node pre,char value, Node next) {
		super();
		this.pre = pre;
		this.value = value;
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
	
	
	
	
	
}

class ArrayStack implements Stack1<Node> {
	private Node top; // stack top
	int size=0;


	
	public void push(char c) // add an item on top of stack
	{
		Node item= new Node(null,c,null);
		if(top==null) top = item;
		else {
			top.next=item;
			item.pre=top;
			top=item;
		}
		size++;


	}

	public Node pop() // remove an item from top of stack
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		Node item = top; // access top item
		if(top.pre!=null)top=top.pre; // decrement top
		else top=null;
		size--;
		return item;
	}

	public Node peek() // get top item of stack
	{
		if (isEmpty())
			return null;
		return top;
	}

	public boolean isEmpty() // true if stack is empty
	{
		return (top == null);
	}

	public int size() // returns number of items in the stack
	{
		return size;
	}



}

public class ArrayStackDemo {

		public static void main(String[] args) {
			ArrayStack stk = new ArrayStack(); 
			Object item;
			stk.push('A'); // push 3 items onto stack
			stk.push('B');
			stk.push('C');
		//	stk.push(4);
			
			System.out.println("size(): "+ stk.size());
			item = stk.pop(); // delete item
			item = stk.pop();
			item = stk.pop();
			System.out.println(item + " is deleted");
			stk.push('D'); // add three more items to the stack
			stk.push('E');
			System.out.println(stk.pop() + " is deleted");
			stk.push('G'); // push one item
			item = stk.peek(); // get top item from the stack
			System.out.println(item + " is on top of stack");
			System.out.println("Size of the Stack : " + stk.size());
	}

}

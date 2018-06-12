package W3L1;



public class MyStringLinkedList {
	Node header;
	MyStringLinkedList() {
		header = null;
	}
           	
	public void addSort(String item){ 
         if(header==null) {
        	 header=new Node(null,item,null);
         }else {
        	 Node temp=header;
        	 while(temp!=null) {
        		 if(temp.value.compareTo(item)<0) {
        			 if(temp.next!=null) temp=temp.next;
        			 else {
        				 Node nd=new Node(temp,item,null);
        				 temp.next=nd;	
        				 return;
        			 }
        		 }
        		 else {
        			 Node nd=new Node(temp.previous,item,temp);
        			 temp.previous.next=nd;
        			 temp.previous=nd;
        			 return;
        		 }
        	 }
        	
        		 
         }
		
    }  // insert in a Sorted Order
	
	public int size(){ 
        Node tp=header;
        int size = 0;
        if(tp==null) return 0;
        else {
        	while(tp != null) {
        		size ++;
        		tp=tp.next;
        	}
        }
        return size;
	 }

	public boolean isEmpty(){
		return size()==0? true:false;
	}  

	public Node getFirst(){
	// Implement
	//	Node nd= new Node(null,header.value,null);
		return header;
	
		
	}

	public Node getLast(){
	// Implement
		Node nd= header;
		if(nd==null) return nd;
		while(nd!=null) {
			if(nd.next!=null) nd=nd.next;
			else break;
		}
		return nd;
		
	}

    public boolean contains(String item){
	// Implement
    	Node nd= header;
		if(nd==null) return false;
		while(nd!=null) {
			if(nd.value.equals(item)) return true;
			else nd=nd.next;
		}
		return false;
    	
	}  

	public void removeFirst(){
	// 
		Node nd = header;
		if(nd==null) return ;
		header=header.next;
		header.previous=null;
		nd.next=null;
	}

    void removeLast(){
    	Node nd = header;
		if(nd==null) return ;
		while(nd!=null) {
			if(nd.next==null) {
				nd.previous.next=null;
				nd.previous=null;
				nd=null;
				return;
			}else nd=nd.next;
		}
	}
    public void print(){
           print(header);
    } 
	
	//Write a recursive print method to display the elements in the list. 
	void  print(Node n) {
		if(n==null) return;
		System.out.println(n.value);
		if(n.next!=null) print(n.next);
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		mySL.addSort("a");
		mySL.addSort("b");
		mySL.addSort("c");
		mySL.addSort("z");
		mySL.addSort("y");
		mySL.addSort("x");
		mySL.addSort("u");
		
		mySL.print(mySL.header);
		
		mySL.removeFirst();
		System.out.println("remove first: ");
		mySL.print(mySL.header);
		
		mySL.removeLast();
		System.out.println("remove last: ");
		mySL.print(mySL.header);
		
		System.out.println("get firt: "+mySL.getFirst());
		System.out.println("get last: "+mySL.getLast());
		System.out.println("contain u: "+mySL.contains("u"));
		System.out.println("contain a: "+mySL.contains("a"));
		
		
		
		
		
		
	}

}

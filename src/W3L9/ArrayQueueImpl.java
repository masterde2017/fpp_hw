package W3L9;

public class ArrayQueueImpl {
	
	private int[] arr = new int[2]; 
	private int front = -1; 
	private int rear = 0; 
	
	public int peek() throws Exception { 
		if(front==-1||front>rear) throw new Exception("Queue is Empty");
		return arr[front];
	//implement 
	} 
	public void enqueue(int obj){ //implement 
		if(front==-1) {
			front =0; 
			arr[rear]=obj;
			return;
		}
		if(rear==arr.length-1) resize();
		arr[++rear]=obj;
	} 
	public int dequeue() throws Exception { 
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		else {
			return arr[front++];
		}
	}
		
	public boolean isEmpty(){ //implement 
		if(front==-1||front>rear) return true;
		else return false; 
	} 
	public int size(){ //implement 
		if(front==-1||front>rear) return 0;
		return rear-front+1; 
	}            
	private void resize(){ //implement 
		int[] temp = new int[(rear-front+1)*2];  //  resize base on the rear and front position
		System.arraycopy(arr, front, temp, 0, rear-front+1);
		rear=rear-front;
		front=0;
		arr=temp;
	}
	
	

	@Override
	public String toString() {
		String s ="";
		for(int a: arr) s+="  "+a;
		return "front = "+front+",rear= "+rear+"\n"+ "ArrayQueueImpl ["+ s+"]";
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayQueueImpl aq=new ArrayQueueImpl();
		aq.enqueue(1);
		aq.enqueue(2);
		aq.enqueue(3);
		aq.enqueue(4);
		aq.enqueue(5);
		aq.enqueue(6);
		aq.enqueue(7);
		aq.enqueue(8);
		aq.enqueue(9);
		aq.enqueue(10);
		aq.enqueue(11);
		System.out.println(aq);
		
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		
		aq.enqueue(12);
		aq.enqueue(13);
		System.out.println("the rear and front have change  and the size is  rear-front+1 \n"+aq);
	//	aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		aq.dequeue();
		
		
		aq.enqueue(14);
		aq.enqueue(15);
		aq.enqueue(16);
		aq.enqueue(17);
		System.out.println("new size of arr base on front and rear \n"+aq);
		

	}

}

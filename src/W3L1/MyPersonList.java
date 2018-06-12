package W3L1;

public class MyPersonList {
	private final int INITIAL_LENGTH = 4;
	private Person[] personArray; 
	private int size;
	
	public MyPersonList() {
		personArray = new Person[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Person s){
		if(size ==personArray.length) resize();
		personArray[size++] = s;
	}
	
	public Person get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return personArray[i];
	}
	
	public boolean find(Person s){
		for(Person test : personArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(Person s, int pos){
		if(pos > size) return;
		if(pos >= personArray.length||size+1 > personArray.length) {
			resize();
		}
		Person[] temp = new Person[personArray.length+1];
		System.arraycopy(personArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(personArray,pos,temp,pos+1, personArray.length - pos);
		personArray = temp;
		++size;
		
	}
	
	public boolean remove(Person s){
		if(s==null) return false;
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(personArray[i].getLast().equals(s.getLast())){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[personArray.length];
		System.arraycopy(personArray,0,temp,0,index);
		System.arraycopy(personArray,index+1,temp,index,personArray.length-(index+1));
		personArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = personArray.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(personArray,0,temp,0,len);
		personArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(personArray[i]+", ");
		}
		sb.append(personArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	
	public boolean search(Person s) {
		boolean b = recurse(0, size-1,s);
		return b;
	}
	
	private boolean recurse(int a, int b, Person s) {
		if(a>b) return false;
		int temp= (a+b)/2;
		if(s.getLast().compareTo(personArray[temp].getLast())>0) return  recurse(temp+1, b,  s);
		else if(s.getLast().compareTo(personArray[temp].getLast())<0)  return recurse(a,temp-1, s);
		else  return true;
	}
	
	public void sort(){
		if(personArray==null||personArray.length<2) return;
		for(int i=0;i<size-1;i++) {
			for(int j = size-1;j>i;j--) {
				 if(personArray[j].getLast().compareTo(personArray[j-1].getLast())<0) swap(j,j-1);
			}
					
		}
	}
	public void swap(int i,int j) {
		Person temp=personArray[i];
		personArray[i]=personArray[j];
		personArray[j]=temp;
		
	}

	
	static class Person {  
		private String lastName;  
		private String firstName;  
		private int age;
		
	// --------------------------------------------------------------  
		public Person(String last, String first, int a) { // constructor   lastName = last;   firstName = first;   age = a;  
			this.lastName=last;
			this.firstName=first;
			this.age=age;
		} 
		public String getLast() {   
			return lastName;  
			}  
		@Override  public String toString() { 
			return "Person [lastName=" + lastName + " FirstName=" + firstName + "  Age=" + age + "]";  } 
		} // end class Person 
		
	
	public static void main(String[] args){
		MyPersonList l = new MyPersonList();
		Person p=new Person("Bob","Bob",2);
		l.add(p);
		l.add(new Person("Steve","Steve",1));
		l.add(new Person("Susan","Susan",1));
		l.add(new Person("Mark","Makr",1));
		l.add(new Person("Dave","Dave",1));
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove(new Person("Mark","Makr",1));
		l.remove(new Person("Bob", "Bob", 1));
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert(new Person("Richard","Richard",1),3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert(new Person("Tonya","Tonya",1),0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);	
		l.sort();
		System.out.println(" after sorted the list is:"+ l);	
		
		System.out.println(" search  Susan :"+ l.search(new Person("Susan","Susan",1)));
		System.out.println(" search  Dusan :"+ l.search(new Person("Dusan","Dusan",1)));
	}
	
}

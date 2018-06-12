package W3L1;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	
	public boolean search(String s) {
		boolean b = recurse(0, size-1,s);
		return b;
	}
	
	private boolean recurse(int a, int b, String s) {
		if(a>b) return false;
		int temp= (a+b)/2;
		if(s.compareTo(strArray[temp])>0) return  recurse(temp+1, b,  s);
		else if(s.compareTo(strArray[temp])<0)  return recurse(a,temp-1, s);
		else  return true;
	}
	
	public void sort(){
		if(strArray==null||size<2) return;
		for(int i=0;i<size;i++) {	
			for(int j = size-1;j>i;j--) {
				//System.out.println(j);
				 if(strArray[j].compareTo(strArray[j-1]) < 0) swap(j,j-1);
			}
					
		}
	}
	public void swap(int i,int j) {
		String temp=strArray[i];
		strArray[i]=strArray[j];
		strArray[j]=temp;
		
	}
	
	

	

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);	
		l.sort();
		System.out.println(" after sorted the list is:"+ l);	
		
		System.out.println(" search  Susan :"+ l.search("Susan"));
		System.out.println(" search  Dusan :"+ l.search("Dusan"));
	}

}

package W2L7;

public class MyTable {  
	
	private Entry[] entries = new Entry[26]; 
	 
	//returns the String that is matched with char c in the table  
	public String get(char c){   //implement   return null; 
		return entries[c-'a'].getValue();
	}  
	//adds to the table a pair (c, s) so that s can be looked up using c   
	public void add(char c, String s) { 
		entries[c-'a'] = new Entry(c,s);
	}

   //returns a String consisting of nicely formatted display  //of the contents of the table  
	public String toString() {  
		String s="";
		for(Entry en: entries) {
			if(en!=null) s+=en.toString()+"\n";
		}
		return s;
	}   
	

	public static void main(String[] args) {
		MyTable mt= new MyTable();
		
		mt.add('a', "Apple");
		mt.add('h', "Horse");
		mt.add('c', "Cat");
		mt.add('b', "Bag");
		mt.add('c', "CCC");
		
		System.out.println(mt);

	}
	
	private class Entry{
		private char c;
		private String s;
		public Entry(char c, String s) {
			this.c=c;
			this.s=s;
		}
		public char getKey() {
			return c;
		}
		public String getValue() {
			return s;
		}
		@Override
		public String toString() {
			return c + " -> " + s ;
		}
		
		
	}
	
}

package W3L11.prog1;


import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		Map<Key, Student>   m= new HashMap<>();
		for(Student st:students) {
			
			m.put(new Key(st.getFirstName(),st.getLastName()),st);
		}
		
		return (HashMap<Key, Student>) m;
	}
}

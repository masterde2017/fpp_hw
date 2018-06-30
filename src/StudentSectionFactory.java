
public class StudentSectionFactory {

	public Section createSection(int secNum, String courseName){
		Section sc= new Section();
		sc.sectionNumber=secNum;
		sc.courseName=courseName;
		return sc;
		  
		  
	}
	public Student createStudent(String id, String name){
		
		 Student st= new Student();
		 st.name=name;
		 st.id=id;
		 return st;
		
	}
	public void newTranscriptEntry(Student s, Section sect, String grade){
		
		 TranscriptEntry te= new  TranscriptEntry();
		 te.grade=grade;
		 te.section=sect;
		 te.student=s;
		 
		 s.grades.add(te);
		 sect.gradeSheet.add(te);
		 
		
	}
	
}

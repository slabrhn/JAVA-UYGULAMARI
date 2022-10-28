public class Course {
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	int examNote;
	int quizNote;
	double quizNoteEtki;
	double examNoteEtki;
	

	
	public Course(String name, String code, String prefix,double quizNoteEtki) {
		
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.examNote = 0 ;
		this.quizNote=0;
		this.quizNoteEtki=quizNoteEtki;
		noteEtki();
		
	}
	
	public void noteEtki() {
		
		examNoteEtki=(1.0 - quizNoteEtki);
		
		
		
	}
	
	
	public void addTeacher(Teacher teacher) {
		
		if (this.prefix.equals(teacher.branch)) {
			
			this.courseTeacher=teacher;
			
		}else {
			 System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
		}
	}
	
	
	public void printTeacher() {
		if (this.courseTeacher  !=null) {
			  System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
			
		}else {
			System.out.println(this.name + " dersine Akademisyen atanmamýþtýr.");
		}
	}

}

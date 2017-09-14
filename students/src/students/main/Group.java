package students.main;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	private String name;
	
	private boolean isRewarded;
	
	private List<Student> studentList = new ArrayList<>();
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setRewarded(boolean isRewarded){
		this.isRewarded = isRewarded; 
	}
	
	public boolean isRewarded(){
		return isRewarded;
	}
	
	public void addStudent(Student newStudent){
		studentList.add(newStudent);
	}
	
	public void addStudent(String name, int id) {
		Student newStudent = new Student();
		newStudent.setName(name);
		newStudent.setId(id);
		studentList.add(newStudent);
	}
	
	public List<Student> getStudentsList(){
		return studentList;
	}

	public void assessGroup(){
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getMark() > 5) {
				isRewarded = true;
			}
		}
	}
}

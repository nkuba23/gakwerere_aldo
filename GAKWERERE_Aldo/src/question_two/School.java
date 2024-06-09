package question_two;


import java.util.ArrayList;
import java.util.List;

public class School {
	private ArrayList<Teacher>teachers;
	private ArrayList<Student>students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}
	public School(List<Teacher> teacherList, List<Student> studentList) {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void addTeacher(Teacher teacher){
		this.teachers.add(teacher);
	}
	public void addStudent(Student student){
		this.students.add(student);
	}
public static void UpdateTotalMoneyEarned(int moneyEarned){
	totalMoneyEarned+=moneyEarned;
}
public static void UpdateTotalMoneySpent(int moneySpent){
	totalMoneySpent+=moneySpent;
}
public static int getTotalMoneyEarned() {
	return totalMoneyEarned;
}
public static int getTotalMoneySpent() {
	return totalMoneySpent;
}

}



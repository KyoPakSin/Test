package chapter7;
import java.util.ArrayList;

class Student {

	int studentID;
	String name;

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}

}

public class StudentArrayList {
	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<Student>();

		arrayList.add(new Student(1001, "James"));
		arrayList.add(new Student(1002, "Tomas"));
		arrayList.add(new Student(1003, "Edward"));

		// 방법 1
		for (Student student : arrayList) {
			student.showStudentInfo();
		}

		System.out.println("");

		// 방법 2
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i).showStudentInfo();
		}

		System.out.println("");

		// 방법 3
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			student.showStudentInfo();
		}

	}
}
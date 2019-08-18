package collections;

public class Student implements Comparable<Student> {

	String id;
	String name;
	Double cgpa;

	public Student(String studentId, String studentName, double studentCGPA) {
		id = studentId;
		name = studentName;
		cgpa = studentCGPA;
	}

	public String toString() {
		return " \n " + id + "  \t  " + name + "  \t  " + cgpa;
	}

	@Override
	public int compareTo(Student thatStudent) {
		// TODO Auto-generated method stub
		return this.id.compareTo(thatStudent.id);
	}

}

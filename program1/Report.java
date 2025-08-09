package program1;

public class Report {
	public static void main(String[] args) {
		Student student=new Student();
		student.studentName="DHANAKRISHNAN";
		student.rollNo=45;
		student.collegeName="VYSYA";
		student.mark=85;
		student.cgpa=7.3f;
		System.out.println("Student Name  : " + student.studentName);
        System.out.println("Roll Number   : " + student.rollNo);
        System.out.println("College Name  : " + student.collegeName);
        System.out.println("Marks Scored  : " + student.mark);
        System.out.println("CGPA          : " + student.cgpa);


	}

}

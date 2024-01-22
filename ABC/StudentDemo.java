public class StudentDemo{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.printStudentDetail();

		Student s2 = new Student(301);
		s2.printStudentDetail();

		Student s3 = new Student(401,"asdf");
		s3.printStudentDetail();

		Student s4 = new Student(501,"qwer","Mech");
		s4.printStudentDetail();

		Student s5 = new Student(601,"zxcv","Civil",5);
		s5.printStudentDetail();
	}
}


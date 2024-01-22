class Student{
	int rollNo;
	String name;
	String department;
	int semester;

	Student(){
		rollNo = 101;
		name = "Name not specified";
		department = "Computer";
		semester = 1;
	}

	Student(int rollNo){
		this();
		this.rollNo = rollNo;
	}

	Student(int rollNo, String name){
		this(rollNo);
		this.name = name;
	}
	Student(int rollNo, String name,String department){
		this(rollNo,name);
		this.department = department;
	}
	Student(int rollNo, String name,String department,int semester){
		this(rollNo,name,department);
		this.semester = semester;
	}

	void printStudentDetail(){
		System.out.println("======== Student Detail ========");
		System.out.println("Name = "+name);
		System.out.println("Roll Number = "+rollNo);
		System.out.println("Department = "+department);
		System.out.println("Semester = "+semester);
	}
}
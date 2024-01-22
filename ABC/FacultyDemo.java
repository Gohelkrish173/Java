public class FacultyDemo{
	public static void main(String[] args) {
		// Faculty fac1 = new Faculty("abc",25);
		// Faculty fac2 = new Faculty("xyz",5);

		// fac1.printFaculty();

		Faculty[] fac = new Faculty[3];

		fac[0] = new Faculty();
		
		fac[0].printFaculty();
	}
}
class Faculty{
	String name;
	int exp;

	Faculty(String name, int exp){
		this.name = name;
		this.exp = exp;
	}

	public void printFaculty(){
		System.out.println("Name = "+name+", exp = "+exp);
	}
}
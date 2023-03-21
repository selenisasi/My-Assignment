package week3.day1;

public class Student extends Department{

		public void studentname()
		{
			System.out.println("Sasirekha");
		}
		public void studentdept()
		{
			System.out.println("Computer");
		}
		public void studentid()
		{
			System.out.println("898");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.collegename();
		s1.collegecode();
		s1.collegerank();
		s1.deptname();
		s1.studentdept();
		s1.studentname();
		s1.studentid();

	}

}

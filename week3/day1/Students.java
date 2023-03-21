package week3.day1;

public class Students {

	public void getstudentinfo(int a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public void getstudentinfo(int c)
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students();
		s1.getstudentinfo(67, "Computer");
		s1.getstudentinfo(56);

	}

}

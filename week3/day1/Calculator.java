package week3.day1;

public class Calculator {

	public void add(int a, int b)
	{
		System.out.println(a+b);
		
	}
	public void add(int a, int b,int c)
	{
		System.out.println(a+b);
	}
	public void multiple(double a, double b)
	{
		System.out.println(a*b);
	}
	public void multiple(double a, double b,int c)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator Cal=new Calculator();
		Cal.add(6, 7);
		Cal.multiple(5, 9);

	}

}

package week3.day1;

public class Axisbank extends Bankinfo{

	public void deposit()
	{
		System.out.println("New deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axisbank A1=new Axisbank();
		A1.deposit();
		A1.fixed();
		A1.saving();
		
	}

}

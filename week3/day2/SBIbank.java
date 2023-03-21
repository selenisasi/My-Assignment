package week3.day2;

public class SBIbank implements RBI {

	@Override
	public void withdrawlimit() {
		// TODO Auto-generated method stub
		System.out.println("100000");
		
	}

	@Override
	public void knowurcust() {
		// TODO Auto-generated method stub
		System.out.println("Aadhar");
		
	}
	
	public void goldloan()
		{
		System.out.println("Gold");
	}
	public static void main(String[] args) {
		SBIbank s1=new SBIbank();
		s1.knowurcust();
		s1.goldloan();
		s1.withdrawlimit();
}
}

package week1.dayone;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =13;
		boolean bprime=true;
for (int i=2;i<input;i++)
{
	if(input%i==0);
	{
		System.out.println("Non Prime");
		bprime=false;
		break;
	}
	}
if(bprime)
{
	System.out.println("prime");
}

}
}

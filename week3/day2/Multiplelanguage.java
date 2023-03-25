package week3.day2;

public abstract class Multiplelanguage implements Language,Testtool {

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
		
	}
	public void python() {
		System.out.println("python");
	}
	public abstract void ruby();
	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

}

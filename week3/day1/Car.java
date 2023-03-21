package week3.day1;

public class Car extends Vehicle{
	public void startcar() {
		System.out.println("startcar");
	}
public static void main(String[] args) {
	Car car1=new Car();
	car1.startcar();
	car1.applyBrake();
}
}

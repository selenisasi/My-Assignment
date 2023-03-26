package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//div[text()='oneplus 9 pro']")).click();
		WebElement W1 = driver.findElement(By.xpath("//span[text()='56,999']"));
		String text = W1.getText();
		System.out.println(text);
		WebElement W2 = driver.findElement(By.xpath("//span[text()='4.2']"));
		String text2 = W2.getText();	
		System.out.println(text2);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String each : windowHandles) {
			System.out.println(each);
			
		}
		List<String> List1=new ArrayList<>(windowHandles);
		String S1= List1.get(1);
		driver.switchTo().window(S1);
		//driver.print(null)
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		WebElement W3 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		String text3 = W3.getText();
		System.out.println(text3);
		if(text2==text3)
		{
			System.out.println("Correct Price");
			
		}
		driver.close();;
		
	}

}

package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Alert alert1 = driver.switchTo().alert();
		String T1 = alert1.getText();
		System.out.println(T1);
		alert1.dismiss();
		String text1 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		if (text1.contains("Cancel"))
		{
			System.out.println("Cancel button pressed");
			
		}
		else {
			System.out.println("Ok button pressed");
		}
	}
}



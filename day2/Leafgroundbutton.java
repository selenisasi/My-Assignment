package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Leafgroundbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String T1=driver.getTitle();
		System.out.println(T1);
		driver.navigate().back();
		WebElement w1 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		if(w1.isEnabled())
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("Disabled");
		}
		
		}
		
		
		

	}

	



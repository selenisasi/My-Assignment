package week4.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Closewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> W1 = driver.getWindowHandles();
		for (String each : W1) {
			if(!each.equals(parentHandle))
			{
				driver.switchTo().window(each);
				driver.close();
			}
			
		}
	}

}

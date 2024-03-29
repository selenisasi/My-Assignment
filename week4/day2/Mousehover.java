package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://www.ajio.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement menElement = driver.findElement(By.linkText("MEN"));
		//Instantiate Actions Class
		Actions builder = new Actions(driver);
		//use the object and call the required method
		builder.moveToElement(menElement).perform();//it is mandatory to call perform()
		WebElement element = driver.findElement(By.linkText("Collections"));
		builder.scrollToElement(element).perform();
	}

}

package week4.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class Scrolltoele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement scrollEle = driver.findElement(By.xpath("//span[text()='© 1996-2023, Amazon.com, Inc. or its affiliates']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(scrollEle).perform();
		String text = scrollEle.getText();
		System.out.println(text);


	}

}

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("http://redbus.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='close-primo']")).click();
		WebElement sleeper = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
        driver.executeScript("arguments[0].click();",sleeper);
		String text1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text1);
		String title = driver.getTitle();
		System.out.println(title);
		
	
	}

}

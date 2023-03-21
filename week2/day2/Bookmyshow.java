package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bookmyshow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//li[@class='sc-gJqsIT jMjMYb']")).click();
		driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("sir");
		driver.findElement(By.xpath("//span[@class='sc-jhaWeW ChCae']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Book tickets')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Not Now')]")).click();
		String s1=driver.findElement(By.xpath("//a[contains(text(),'Arjun 70MM: Kukatpally')]")).getText();
		System.out.println(s1);
		driver.findElement(By.xpath("//div[@class='info-section']")).click();
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'11:30 AM')]")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		driver.findElement(By.xpath("//div[@id='C_1_05']")).click();
		driver.findElement(By.xpath("//div[@id='C_1_06']")).click();
		driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		String s2=driver.findElement(By.xpath("//span[@id='subTT']")).getText();
		System.out.println(s2);

	}

}

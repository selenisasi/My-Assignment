package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.github.sukgu.Shadow;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Marathon1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Set<String> W1 = driver.getWindowHandles();
		List<String> L1=new ArrayList<>(W1);
		String S1 = L1.get(1);
		driver.switchTo().window(S1);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow dom=new Shadow(driver);
		dom.findElementByXPath("//span[text()='Learning']").click();
		WebElement driver1 = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder=new Actions(driver);
		builder.moveToElement(driver1).perform();
		WebElement W6 = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		builder.scrollToElement(W6).perform();
		W6.click();
		WebElement W7 = driver.findElement(By.xpath("//a[text()='Administrator']"));
		builder.scrollToElement(W7);
		W7.click();
		Thread.sleep(3000);	
//		WebElement F1 = driver.findElement(By.xpath("//a[text()='Get the Exam Guide']"));
//		builder.scrollToElement(F1).perform();
		Thread.sleep(6000);
//		WebElement W8 = driver.findElement(By.xpath("//div[text()='Certification']"));
//		builder.scrollToElement(W8).perform();
		List<WebElement> W9 = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for (int i=0;i<W9.size();i++)
		{
			String text1 = W9.get(i).getText();
			System.out.println(text1);
		}
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/salesforcecert.jpg");
		FileUtils.copyFile(source, dest);
		
		
		
		
			}

}

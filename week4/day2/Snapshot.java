package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Snapshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/salesforce.png");
		FileUtils.copyFile(source, destination);
	}

}

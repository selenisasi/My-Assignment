package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webelementsnap {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		opt.addArguments("--disable-notifications");
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		WebElement Applauncher = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));;
		File source = Applauncher.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/Applauncher.jpg");
		FileUtils.copyFile(source, destination);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./snaps/salesforce1.png");
		FileUtils.copyFile(source1, destination1);
	}

	}



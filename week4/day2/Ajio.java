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
import org.openqa.selenium.interactions.Actions;

public class Ajio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement F1 = driver.findElement(By.xpath("//a[text()='Collections']"));
		Actions builder=new Actions(driver);
		builder.scrollToElement(F1).perform();
		File S1 = driver.getScreenshotAs(OutputType.FILE);
		File D1=new File("./snaps/ajio.jpg");
		FileUtils.copyFile(S1, D1);
		

	}

}

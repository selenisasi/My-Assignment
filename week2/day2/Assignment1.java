package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sasirekha");
		driver.findElement(By.name("lastname")).sendKeys("Pasupathy");
		driver.findElement(By.name("reg_email__")).sendKeys("9382883939");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test123!@#");
		WebElement sec1=driver.findElement(By.id("day"));
		Select day=new Select(sec1);
		day.selectByIndex(2);
		WebElement sec2=driver.findElement(By.id("month"));
		Select month=new Select(sec2);
		month.selectByIndex(2);
		WebElement sec3=driver.findElement(By.id("year"));
		Select year=new Select(sec3);
		year.selectByIndex(30);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}

}

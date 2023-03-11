package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chromeleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoCSR");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
String title=driver.getTitle();
System.out.println(title);
driver.findElement(By.linkText("CRM/SFA")).click();
//driver.findElement(By.id("USERNAME")).sendKeys("DemoCSR");
//driver.findElement(By.id("PASSWORD")).sendKeys("crmsfa");
//driver.findElement(By.className("Login")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Companytest");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasirekha");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pasupathy");
WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sec = new Select(source);
sec.selectByIndex(2);
driver.findElement(By.name("submitButton")).click();


	}

}

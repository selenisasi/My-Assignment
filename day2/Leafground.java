package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Sasirekha");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("  India");
		WebElement x1 = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']"));
		if(x1.isDisplayed())
		{
			System.out.println("This textbox is disabled");	
		}
		
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		WebElement x2 = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']"));
		String a = x2.getAttribute("value");
		System.out.println(a);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("psasi_83@rediffmail.com",Keys.TAB);
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("Student of Selenium");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		WebElement x3 = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
		String x4 = x3.getText();
		System.out.println(x4);
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).sendKeys("Test");
		driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']")).click();
//		driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']")).sendKeys("sasirekha");
//		driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("06/06/1983",Keys.TAB);
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("41");
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
		
		
		
		
		
	}

}

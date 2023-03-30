package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.nykaa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement W1 = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(W1).perform();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='SearchIcon']")).click();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("LOreal Paris");
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
//		Set<String> W2 = driver.getWindowHandles();
//		List<String> L1=new ArrayList<>(W2);
//		String S1 = L1.get(1);
//		WebDriver W3 = driver.switchTo().window(S1);
//		String T1 = W3.getTitle();
		String T1 = driver.getTitle();
		System.out.println(T1);
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(3000);
		WebElement X1 = driver.findElement(By.xpath("//span[text()='Concern']"));
		Actions builder1=new Actions(driver);
		builder1.scrollToElement(X1).perform();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='control control-checkbox']")).click();
		X1.click();
		WebElement W4 = driver.findElement(By.xpath("//span[text()='Gender']"));
		Actions builder2=new Actions(driver);
		builder2.scrollToElement(W4).perform();
		driver.findElement(By.xpath("//input[@id='checkbox_Color Protection_10764']/following::label[@class='control control-checkbox']")).click();
		driver.findElement(By.xpath("//img[@class='css-11gn9r6']")).click();
		Set<String> W5 = driver.getWindowHandles();
		List<String> L1=new ArrayList<>(W5);
		String Str1 = L1.get(1);
		driver.switchTo().window(Str1);
		String T5 = driver.getTitle();
		System.out.println(T5);
		WebElement W6 = driver.findElement(By.xpath("//span[@class='css-u05rr']/following::span[@class='css-1jczs19']"));
		String text3 = W6.getText();
		System.out.println(text3);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		Thread.sleep(3000);
//		Set<String> W7 = driver.getWindowHandles();
//		for (String each : W7) {
//			System.out.println(each);
//			
//		}
//		List<String> L7=new ArrayList<>(W7);
//		String K1 = L7.get(2);
		driver.switchTo().frame(1);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='css-1j2bj5f e8tshxd0']//div[@class='css-207d6f e25lf6d6']")).click();
		
	
		
		
	}

}

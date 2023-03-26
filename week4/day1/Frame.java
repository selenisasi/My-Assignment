package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		for (String each : windowHandle1) {
			System.out.println(each);
			
		}
		List<String> List1=new ArrayList<>(windowHandle1);
		String string1 = List1.get(1);
		driver.switchTo().window(string1);
		String title = driver.getTitle();
		System.out.println(title);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/flight.jpg");
		FileUtils.copyFile(source, destination);
	}
		
}

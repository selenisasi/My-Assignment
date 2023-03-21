package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");	
		ChromeDriver driver= new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		  List<WebElement> mobilePriceList = driver.findElements(By.className("a-price-whole"));
	       List<Integer> list = new ArrayList<>();
	       for (WebElement each : mobilePriceList) {
	        String text = each.getText();
	        //60,944
	        System.out.println(text);
	        String replaceAll = text.replaceAll(",", "");//60499
	        System.out.println(replaceAll);
	        if(!replaceAll.isEmpty()) {
	        int parseInt = Integer.parseInt(replaceAll);
	        list.add(parseInt);
	    }
	    //sort it
	       Collections.sort(list);
	       //print the minimum value
	       System.out.println(list.get(0));

	}
	}
}
	

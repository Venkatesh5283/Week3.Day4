package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li")).click();
		driver.findElement(By.xpath("//td[@class='we day']")).click();
		driver.findElement(By.id("search_btn")).click();
		String Buses=driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of Buses: "+Buses);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		Thread.sleep(2000);
		String BusName=driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println("Name Of The Travels: "+BusName);
		String Title=driver.getTitle();
		System.out.println("Title of the Webpage : "+Title);
					
	}

}

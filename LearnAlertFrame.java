package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		
		
		
		//Frame
		
				driver.switchTo().frame("iframeResult");
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		
		
		//Alert
		//prompt Alert
		
		Alert click=driver.switchTo().alert();
		
		click.sendKeys("Venkatesh");
		click.accept();
		Thread.sleep(2000);
		
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		
		
	}

}

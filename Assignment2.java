package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.leafground.com/alert.xhtml");
    
    
    //Simple Alert
    driver.findElement(By.xpath("//span[text()='Show']")).click();
    Alert alarm=driver.switchTo().alert();
    alarm.accept();
    String mes=driver.findElement(By.id("simple_result")).getText();
    System.out.println(mes);
    Thread.sleep(2000);
    
    //Confirm Alert
    driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
    Alert alarm1=driver.switchTo().alert();
    alarm1.dismiss();
    String msg1=driver.findElement(By.id("result")).getText();
    System.out.println(msg1);
    Thread.sleep(3000);
    
    
    //Sweet Alert
    driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
    driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
    Thread.sleep(2000);
    
    //Sweet Alert
    driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
    Thread.sleep(2000);
    
    //Alert Prompt Dialog
    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
    alarm.sendKeys("Venkatesh");
    alarm.accept();
    String msg2=driver.findElement(By.id("confirm_result")).getText();
    System.out.println(msg2);
    Thread.sleep(2000);
    
    //Sweet Alarm Confirmation
    driver.findElement(By.xpath("//span[text()='Delete']")).click();
    driver.findElement(By.xpath("//span[text()='Yes']")).click();
    Thread.sleep(2000);
    
    //Maximize and Minimize
    driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
    driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
    driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
    Thread.sleep(2000);
    
    driver.close();
	}

}

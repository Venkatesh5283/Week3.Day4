package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		/*
		 * Testcase 1 (Amazon) =============== 01) Launch Chrome 02) Load
		 * https://www.amazon.in/ add implicitlyWait
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 03) Type
		 * "Bags" in the Search box 04) Choose the item in the result (bags for boys)
		 * 05) Print the total number of results (like 50000) 1-48 of over 50,000
		 * results for "bags for boys" 06) Select the first 2 brands in the left menu
		 * (like American Tourister, Generic) 07) Choose New Arrivals (Sort) 08) Print
		 * the first resulting bag info (name, discounted price) 09) Get the page title
		 * and close the browser(driver.close())
		 */
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		String text=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)")).getText();
		
		String text1=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3])")).getText();
		System.out.println(text+" "+text1);
		
						
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']")).click();
		
		driver.findElement(By.xpath("//span[@class='a-expander-prompt']")).click();
		
		driver.findElement(By.xpath("//li[@id='p_89/Generic']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	    driver.findElement(By.linkText("Newest Arrivals")).click();
		
		
		
		String name=driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]")).getText();
		String price=driver.findElement(By.xpath("//span[@class='a-letter-space']/following-sibling::span")).getText();
		
		System.out.println("Name :"+name);
		System.out.println("Discounted Price :"+price);
		
		
		String title=driver.getTitle();
		System.out.println("Title of the WebPage: "+title);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}

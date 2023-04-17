package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		01) Launch Edge / Chrome 
//    add  implicitlyWait
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//02) Load https://in.bookmyshow.com/
//03) Type the city as"Hyderabad"in Select City
//04) Confirm the URL has got loaded with Hyderabad 
//05) Search for your favorite movie 
//06) Click on movie
//07) Print the name of the theater displayed first
//08) Click on the info of the theater
//09) Confirm if there is a parking facility in the theater
//10) Close the theater popup
//11) Click on the first green (available) timing
//12) Click Accept
//13) Choose 1 Seat and Click Select Seats
//14) Choose any available ticket and Click Pay
//15) Print the sub total
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.bookmyshow.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//li[@class='sc-gJqsIT jMjMYb']")).click();
		String CurrentURL=driver.getCurrentUrl();
		String city="hyderabad";
		System.out.println(CurrentURL);
		if(city.contains(CurrentURL))
		{
		System.out.println("Current URL is confirmed, it was proceeding with Hyderabad");
	
		}
		else
		{
			System.out.println("Current URL is confirmed, it was not proceeding with Hyderabad");
		}
	}

}

package SelTut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brosweropen {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");


			WebDriver driver= new ChromeDriver();
			//get()- lunch to specific URL
			driver.get("https://www.facebook.com/");

			//get the Title of Current URL
			String Title=driver.getTitle(); 
			// print the Title in Output Console
			System.out.println(Title);

			WebElement wb=driver.findElement(By.id("email"));

			//check object is Enabled state on not
			System.out.println(wb.isEnabled());

			//check element is display or not
			System.out.println(wb.isDisplayed());

			//Enter value in text box
			wb.sendKeys("softtech classes");

			//get the Enter value from Text box
			String a=wb.getAttribute("value");

			//print the Enter value in output console
			System.out.println(a);

			//navigate to another URL (FreeCRM Website)
			driver.navigate().to("https://freecrm.co.in/");

			//get current URL and print in Output console
			String URL=driver.getCurrentUrl();
			System.out.println(URL);

			//Navigate back
			driver.navigate().back();
			//get title
			System.out.println(driver.getTitle());

			//navigate forward and get Title
			driver.navigate().forward();
			System.out.println(driver.getTitle());

			//refresh the page
			driver.navigate().refresh(); 
			//close the current focused browser
			driver.close();

			//close all the browser which is open by selenium in current script
			driver.quit();
			
	}

}

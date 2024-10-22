package demo.PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) {
		// browsersetup
		WebDriverManager.chromedriver().setup();
		//open browser
		WebDriver driver = new ChromeDriver();
		// redirect on google
		driver.get("https://www.google.com/");
		
	WebElement textbox=	driver.findElement(By.id("APjFqb"));
	textbox.sendKeys("Flipkart");
	
	WebElement button= driver.findElement(By.className("gNO89b"));
	button.submit();
	button.clear();
		
		
		
		
	}
	
	

}

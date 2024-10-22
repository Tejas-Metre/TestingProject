package demo.PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	WebElement text=driver.findElement(By.id("APjFqb"));
	text.sendKeys("Sql");
	
//WebElement  button=	driver.findElement(By.name("btnK"));
//button.submit();
	driver.findElement(By.name("btnK")).submit();
	

	}

}

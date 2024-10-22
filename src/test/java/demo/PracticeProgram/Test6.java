package demo.PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//WebElement texbox= driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		//WebElement texbox= driver.findElement(By.cssSelector("input[type=\"text\"]"));
  // WebElement textbox= driver.findElement(By.cssSelector("input#twotabsearchtextbox[type=\"text\"]"));
 //WebElement textbox=  driver.findElement(By.cssSelector("input[type=\"text\"][spellcheck=\"false\"]"));
 WebElement textbox=  driver.findElement(By.cssSelector("input#twotabsearchtextbox[type=\"text\"][spellcheck=\"false\"]"));

		//WebElement textbox=  driver.findElement(By.xpath("//input@[type=\"text\"]"));
		textbox.sendKeys("Samsung Mobile");
		
	
		driver.findElement(By.id("nav-search-submit-button"));
	textbox.submit();
		
	
		
	}

}

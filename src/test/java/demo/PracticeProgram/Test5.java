package demo.PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		//WebElement textbox= driver.findElement(By.id("APjFqb"));
	   // WebElement textbox=	driver.findElement(By.className("gLFyf"));
	  //WebElement textbox=  driver.findElement(By.tagName("textarea"));
		//WebElement textbox=	driver.findElement(By.cssSelector("textarea.gLFyf"));
	//   WebElement textbox=	driver.findElement(By.cssSelector("textarea#APjFqb"));
	  //WebElement textbox= driver.findElement(By.cssSelector("textarea[title=\"Search\"]"));
	//WebElement textbox=	driver.findElement(By.cssSelector("textarea.gLFyf[title=\"Search\"]"));
	//WebElement textbox=	driver.findElement(By.cssSelector("textarea.gLFyf[title=\"Search\"][role=\"combobox\"]"));
	//WebElement textbox=	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/style"));
//WebElement textbox= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		WebElement textbox = driver.findElement(By.xpath("//textarea[@title=\"Search\"]"));

		textbox.sendKeys("HTML");
		//driver.findElement(By.linkText("Business"));
		
		
		
		
//	WebElement textbox= driver.findElement(By.id("APjFqb"));
//	textbox.sendKeys("Python");
//	
//	driver.findElement(By.name("btnK")).submit();
		
		
	}

}

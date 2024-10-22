package demo.PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	
	public static void main(String[] args) {
		//browsersetup
		WebDriverManager.edgedriver().setup();
		//open the browser
		WebDriver driver=new EdgeDriver();
		//redirect to google
		driver.get("https://www.google.com/");
		
	//WebElement text=driver.findElement(By.id("APjFqb"));
	//text.sendKeys("Amazon");
	
//WebElement button=	driver.findElement(By.name("btnK"));
//button.submit();

WebElement box= driver.findElement(By.linkText(" How Search works "))   ;
box.click();
		
	}

}

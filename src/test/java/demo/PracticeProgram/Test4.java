package demo.PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		/*driver.findElement(By.linkText("Advertising")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		*/
	String data=	driver.findElement(By.id("SIvCob")).getText();
	System.out.println("Data:"+data);
	
String title=driver.getTitle();
System.out.println("Title:"+title);

String url =driver.getCurrentUrl();
System.out.println("url:"+url);
	

 WebElement textbox=driver.findElement(By.id("APjFqb"));
 if(textbox.isDisplayed() && textbox.isEnabled())
 {
	 textbox.sendKeys("Java");
 }
 
 
 driver.findElement(By.name("btnK")).submit();
 driver.findElement(By.id("APjFqb")).clear();
 
 
 
 
	
		
	}

}

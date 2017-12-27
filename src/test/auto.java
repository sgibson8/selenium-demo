package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.Test;

public class auto {
	
	@Test
	public void openBrowser() {
		System.setProperty("chromeDriver", "chromeDriver");
		WebDriver driver = new ChromeDriver();
		
		
	}
	
	
}

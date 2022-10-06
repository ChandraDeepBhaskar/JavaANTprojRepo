package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassFour {
	
	 @Test
	  public void ClassFourA() {
		  System.out.println("inside method ClassFourA");
		  System.out.println("inside method ClassOneA");
		  
		  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver105.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://www.amazon.com");
			
			driver.close();
	  }
	  
	 @Test
	  public void ClassFourB() {
		  System.out.println("inside method ClassFourB");
	  }
	  
	 @Test
	  public void ClassFourC() {
		  System.out.println("inside method ClassFourC");
	  }
	  
	 @Test
	  public void ClassFourD() {
		  System.out.println("inside method ClassFourD");
	  }
	  

}

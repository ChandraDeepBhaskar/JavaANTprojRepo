package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTwo {
	  @Test
	  public void ClassTwoA() {
		  System.out.println("inside method ClassTwoA");
		  System.out.println("inside method ClassOneA");
		  
		  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver105.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://www.youtube.com");
			
			driver.close();
	  }
	  
	  @Test
	  public void ClassTwoB() {
		  System.out.println("inside method ClassTwoB");
	  }

}

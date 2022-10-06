package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassThree {

	  @Test
	  public void ClassThreeA() {
		  System.out.println("inside method ClassThreeA");

		  System.out.println("inside method ClassOneA");
		  
		  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver105.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://wwww.facebook.com");
			
			driver.close();
	  }
	  
	  @Test
	  public void ClassThreeB() {
		  System.out.println("inside method ClassThreeB");
	  }
	  
	  @Test
	  public void ClassThreeC() {
		  System.out.println("inside method ClassThreeC");
	  }
}

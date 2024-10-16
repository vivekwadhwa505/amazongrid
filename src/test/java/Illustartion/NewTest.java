package Illustartion;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void finlay() {
	  driver.get("https://www.google.com");
	  driver.getTitle();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\ASUS\\Desktop\\edge1\\msedgedriver.exe");
	    driver=new EdgeDriver();
	   driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

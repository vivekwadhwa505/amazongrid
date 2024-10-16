package Illustartion;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Edge2 {
  @Test
  
	  
	  public void authenticate5()  throws MalformedURLException, URISyntaxException, Exception {
			DesiredCapabilities few = new DesiredCapabilities();
			few.setBrowserName("edge");

			EdgeOptions grew = new EdgeOptions();
			grew.merge(few);

			String x = "http://192.168.29.57:4444";
			WebDriver driver = new RemoteWebDriver(new URI(x).toURL(), grew);

			driver.get("https://www.amazon.in");
			System.out.println("Edge getting launched");

			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input"))
					.sendKeys("mens shirts");
			Thread.sleep(1500);
			System.out.println("searched for mens shirts");

			driver.close();
		}
  }


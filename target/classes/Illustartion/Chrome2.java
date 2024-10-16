package Illustartion;

import org.testng.annotations.Test;


import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Chrome2 {
  @Test
  public void authenticate1() throws Exception {
		DesiredCapabilities few = new DesiredCapabilities();
		few.setBrowserName("chrome");

		ChromeOptions den = new ChromeOptions();
		den.merge(few);

		String x = "http://192.168.29.57:4444";
		WebDriver driver = new RemoteWebDriver(new URI(x).toURL(), den);

		driver.get("https://www.amazon.in");
		System.out.println("chrome getting launched");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input"))
				.sendKeys("mens shirts");
		Thread.sleep(1500);
		System.out.println("searched for mens shirts");

		driver.close();
  }


}

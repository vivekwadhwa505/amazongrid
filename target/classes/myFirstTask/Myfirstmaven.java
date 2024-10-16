package myFirstTask;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Myfirstmaven {

	public static void main(String[] args) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\ASUS\\Desktop\\edge1\\msedgedriver.exe");
		   WebDriver driver=new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.saucedemo.com/");
		   System.out.println(driver.getTitle());

	}

}

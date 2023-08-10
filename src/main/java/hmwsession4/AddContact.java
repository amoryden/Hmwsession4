package hmwsession4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AddContact {
	
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		
		
	}
	
	@Test
	public void login() throws InterruptedException {
		
		By userNameField = By.xpath("//*[@id=\"username\"]");
		By passwordField = By.xpath("//*[@id=\"password\"]");
		By signInButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");
		By customersButtonField = By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]");
	    By addCustomerButtonField = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
	    By firstNameField = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
	    By addCustomerButtonField = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
	    By addCustomerButtonField = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
	    By addCustomerButtonField = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
	    By addCustomerButtonField = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
		
		driver.findElement(userNameField).sendKeys("demo@techfios.com");
		driver.findElement(passwordField).sendKeys("abc123");
		driver.findElement(signInButtonField).click();
		Thread.sleep(2000);
		driver.findElement(customersButton).click();
		driver.findElement(addCustomerButton).click();
		
		
		
		
	}
	

}

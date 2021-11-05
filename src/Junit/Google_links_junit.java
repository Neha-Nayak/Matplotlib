package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_links_junit {
	
	public WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Lang_change() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		Thread.sleep(3000);
	}

}

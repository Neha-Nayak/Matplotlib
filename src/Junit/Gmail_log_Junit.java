package Junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail_log_Junit {
	
	public WebDriver driver;
	
	@Before //precondition
	public void setUp() throws Exception {
		driver= new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}

	@After //postcondition
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test //test scenario
	public void verify_login() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("1jt19cs055@jyothyit.ac.in");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("neha2001");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		Thread.sleep(8000);
	}
	
	@Test //test scenario
	public void verify_logout() {
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div[1]/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	}
	
	@Test
	public void test() {
		System.out.println("Welcome");
	}
}

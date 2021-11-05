package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_log {
	public WebDriver driver;
	
	public void openURL(){
		driver= new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}
	
	public void Verify_login() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("1jt19cs055@jyothyit.ac.in");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("neha2001");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		Thread.sleep(8000);
	}
	
	public void verify_logout() {
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div[1]/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
		
	}
	public static void main(String[] args) throws Exception {
		Gmail_log gm=new Gmail_log();
		gm.openURL();
		gm.Verify_login();
		gm.verify_logout();
	}

}

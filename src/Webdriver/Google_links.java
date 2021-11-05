package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_links {
	
	public WebDriver driver;
	
	public void openURL() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	public void clicklinks(String str) throws Exception {
		driver.findElement(By.xpath(str)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		Thread.sleep(3000);
	}
/*
	public void Hindi() throws Exception{
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		Thread.sleep(3000);
	}
	
	public void Bengali() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		Thread.sleep(3000);
	}
	
	public void Kannada() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		Thread.sleep(3000);
	}    */
	
	public static void main(String[] args) throws Exception {
		Google_links gl=new Google_links();
		gl.openURL();
//		gl.Hindi();
//		gl.Bengali();
//		gl.Kannada();
		gl.clicklinks("//*[@id=\"SIvCob\"]/a[1]");		//hindi
		gl.clicklinks("//*[@id=\"SIvCob\"]/a[2]");		//bengali
		gl.clicklinks("//*[@id=\"SIvCob\"]/a[7]");		//kannada
	}

}

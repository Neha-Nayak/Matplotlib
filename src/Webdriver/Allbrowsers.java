package Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Allbrowsers {
	
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\JAVA_eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}
	
	public static void main(String[] args) {
		Allbrowsers a=new Allbrowsers();
		a.chrome();
	}

}

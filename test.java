package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hii");
	System.setProperty("webdriver.chrome.driver", "G:\\rar file\\sele\\seledrive\\chromedriver.exe");
		//ChromeDriver driv=new ChromeDriver();
		//driv.navigate().to("http://google.com");
		
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http:www.yahoo.com");
		
		
	}

}

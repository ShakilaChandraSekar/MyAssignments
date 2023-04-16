package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
public static void main(String[] args) {
		
	
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.close();
	
	}

}

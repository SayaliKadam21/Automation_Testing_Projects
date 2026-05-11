package Test.Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_operators {
	ChromeDriver driver;
	public static void main(String[]args) {
		test_operators test = new test_operators();
		test.launch();
		
	}
	
	//Launching ChromeDriver;
	void launch() {
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
	}
	
	
	//Addition


}

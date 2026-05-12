package Test.Calculator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_operators {
	ChromeDriver driver;
	public static void main(String[]args) {
		test_operators test = new test_operators();
		test.launch();
		test.addition();
		
		//test.all_clear();
		
	}
	
	//Launching ChromeDriver;
	void launch() {
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
	}
	
	
	//Addition
	void addition()
		{
		
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}
	
	//Subtraction
	
	
 

}

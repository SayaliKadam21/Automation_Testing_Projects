package Test.Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public interface otherFunctions1 {
	static void of1() {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.calculator.net/");
		cd.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.findElement(By.xpath("//span[text()='8']")).click();
		cd.findElement(By.xpath("//span[@onclick=\"r('apow')\"]")).click();
		cd.findElement(By.xpath("//span[text()='2']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		
		
		cd.findElement(By.xpath("//span[@onclick=\"r('3x')\"]")).click();
		cd.findElement(By.xpath("//span[text()='9']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		
		cd.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
		cd.findElement(By.xpath("//span[text()='4']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		
		cd.findElement(By.xpath("//span[@onclick=\"r('ln')\"]")).click();
		cd.findElement(By.xpath("//span[text()='3']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		
		cd.findElement(By.xpath("//span[@onclick=\"r('log')\"]")).click();
		cd.findElement(By.xpath("//span[text()='8']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		cd.close();
		
		
	}
}

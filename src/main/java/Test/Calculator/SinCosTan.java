package Test.Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public interface SinCosTan {
	static void sincostan() {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.calculator.net/");
		cd.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//---------------------------sin------------------------------------
		cd.findElement(By.xpath("//span[text()='sin']")).click();
		cd.findElement(By.xpath("//span[text()='5']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//---------------------------cos------------------------------------
		
		cd.findElement(By.xpath("//span[text()='cos']")).click();
		cd.findElement(By.xpath("//span[text()='1']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//---------------------------tan--------------------------------------
		
		cd.findElement(By.xpath("//span[text()='tan']")).click();
		cd.findElement(By.xpath("//span[text()='3']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//---------------------------Inverse--------------------------------------
		
		cd.findElement(By.xpath("//span[@onclick=\"r('asin')\"]")).click();
		cd.findElement(By.xpath("//span[text()='1']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		
		
		cd.findElement(By.xpath("//span[@onclick=\"r('acos')\"]")).click();
		cd.findElement(By.xpath("//span[text()='0']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.findElement(By.xpath("//span[text()='AC']")).click();
		 
		 
		 
		 
		 cd.findElement(By.xpath("//span[@onclick=\"r('atan')\"]")).click();
		 cd.findElement(By.xpath("//span[text()='1']")).click();
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			cd.findElement(By.xpath("//span[text()='AC']")).click();
			
			
			cd.findElement(By.xpath("//span[@onclick=\"r('pi')\"]")).click();
			
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			cd.findElement(By.xpath("//span[text()='AC']")).click();
			
			
			cd.findElement(By.xpath("//span[@onclick=\"r('e')\"]")).click();
			
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			cd.findElement(By.xpath("//span[text()='AC']")).click();
			
			cd.close();

	}
}

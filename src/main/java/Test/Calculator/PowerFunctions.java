package Test.Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public interface PowerFunctions { 
	
	static void powerfunctions() {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.calculator.net/");
		cd.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.findElement(By.xpath("//span[text()='5']")).click();
		cd.findElement(By.xpath("//span[@onclick=\"r('pow')\"]")).click();
		cd.findElement(By.xpath("//span[text()='2']")).click();
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			cd.findElement(By.xpath("//span[text()='AC']")).click();
			
			
			
			cd.findElement(By.xpath("//span[text()='2']")).click();
			cd.findElement(By.xpath("//span[@onclick=\"r('x3')\"]")).click();
			
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				cd.findElement(By.xpath("//span[text()='AC']")).click();

			
				
				cd.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
				cd.findElement(By.xpath("//span[text()='2']")).click();
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					cd.findElement(By.xpath("//span[text()='AC']")).click();
		
					
					
				cd.findElement(By.xpath("//span[@onclick=\"r('10x')\"]")).click();
				cd.findElement(By.xpath("//span[text()='6']")).click();
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

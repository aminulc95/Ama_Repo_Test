package HeroKuApp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Library.Base;

public class Typos extends Base{
	
	public void GoToWebsite() {
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	public void Typo() throws InterruptedException {
		driver.findElement(By.linkText("Typos")).click();
		Thread.sleep(2000);
		 String ActualText = driver.findElement(By.xpath("//*[@id=\"content\"]/div")).getText();
		  String ExpectingText = "Typos\r\n" + 
		  		"This example demonstrates a typo being introduced. It does it randomly on each page load.\r\n" + 
		  		"\r\n" + 
		  		"Sometimes you'll see a typo, other times you won't.";
		  if (ExpectingText.equalsIgnoreCase(ActualText)) {
			System.out.println("No Typos");
		}
		  else if (!ActualText.equalsIgnoreCase(ExpectingText)) {
				System.out.println("Typos");
		}
	}
	@Test
	public void test() throws InterruptedException {
		GoToWebsite();
		Typo();
	}
}

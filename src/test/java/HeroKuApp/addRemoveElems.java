package HeroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Library.Base;

public class addRemoveElems extends Base{
	
	public void GoToWebsite() {
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	public void ClickAddRemoveElemBttn() throws InterruptedException {
		// AddRemoveBttn is located.Then Clicked. Driver waits for 10sec for the bttn on
		// the next page to load is located the AddElement bttn and clicks it twice.
		driver.findElement(By.linkText("Add/Remove Elements")).click();
		Thread.sleep(2000);
		WebElement AddElementbutton= driver.findElement(By.xpath("//*[@onclick=\"addElement()\"]"));
		AddElementbutton.click();
		Thread.sleep(1000);
		AddElementbutton.click();
		Thread.sleep(2000);
		WebElement DeleteBttn = driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]"));
		DeleteBttn.click();
		Thread.sleep(5000);
		WebElement DeleteBttn2 = driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]"));
		DeleteBttn2.click();
	}
	
	@Test
	public void test() throws InterruptedException {
		GoToWebsite();
		ClickAddRemoveElemBttn();
	}

}

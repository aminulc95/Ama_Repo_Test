package Pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Library.Base;

public class Greyhound extends Base {

	public void GoToWebsite() {
		driver.get("https://www.greyhound.com/");
	}
	public void ClickBookATrip() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"nav-main\"]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		WebElement BookNowBttn = driver.findElement(By.xpath("//*[@id=\"collapseBook\"]/p/a[1]"));
		BookNowBttn.click();
		Thread.sleep(5000);
	}
	public void EnterFromBox() throws InterruptedException {
		WebElement FromTextBox = driver.findElement(By.xpath(
				"//input[@id=\"fromLocation\" or @class=\"form-control non-dynamic-label ui-autocomplete-input\"]"));
		FromTextBox.sendKeys("Washington");
		Thread.sleep(5000);
		FromTextBox.sendKeys(Keys.ARROW_DOWN);
		FromTextBox.sendKeys(Keys.ENTER);
		// selecting washington
		Thread.sleep(5000);
		WebElement ToTextBox = driver.findElement(By.xpath("//*[@id=\"toLocation\"]"));
		ToTextBox.sendKeys("New York");
		ToTextBox.sendKeys(Keys.ARROW_DOWN);
		ToTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//selecting new york
	}
	@Test
	public void GreyHoundBus() throws InterruptedException {
		GoToWebsite();
		ClickBookATrip();
		EnterFromBox();
	}
}
package Pages;

import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Library.Base;

public class AutoTrader extends Base {
//testing intellij git
	public void GoToWebSite() throws InterruptedException {
		driver.get("https://www.costco.com/");
		Thread.sleep(5000);
		WebElement GroceryOption = driver.findElement(By.xpath("//a[@id='Home_Ancillary_0' and @data-flyout=\"Home_Ancillary_Popover_0\"]"));
		GroceryOption.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"postal-code-input\"]")).sendKeys("22191");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"postal-code-submit\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[6]/div/div/div[1]/div[2]/div[5]/a")).click();
		Thread.sleep(5000);
		WebElement PeanutButter = driver.findElement(By.xpath("//*[@id=\"value-5\"]"));
		PeanutButter.clear();
		PeanutButter.sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"addbutton-5\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"cart-d\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"cart-d\"]")).click();
		Thread.sleep(5000);
		String PB = driver.findElement(By.xpath("//*[@id=\"order-items-grocery\"]/div/div/div[2]/div[1]/a")).getText();
		assertEquals(PB, "Kirkland Signature Organic Peanut Butter, 28 oz, 2-count");
		driver.findElement(By.xpath("//*[@id=\"shopCartCheckoutSubmitButton\"]")).click();
	}
//
	@Test
	public void AllTests() throws InterruptedException {
		GoToWebSite();
	}

}

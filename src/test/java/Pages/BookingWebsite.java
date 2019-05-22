package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Library.Base;

public class BookingWebsite extends Base{
	
	public void GoToWebsite() {
		driver.get("https://www.booking.com/index.html?aid=376370;label=bdot-YLKLehG9gYGiZhzjWOm8iwS267725060040:pl:ta:p1:p22,360,000:ac:ap1t1:neg:fi:tiaud-297601666795:kwd-334108349:lp9008126:li:dec:dm;ws=&gclid=Cj0KCQjwzunmBRDsARIsAGrt4mvFjq_4VamkrTqW0qOAl9hcQe1PUYq4v3jn_xFMwjl1UwujaZVJCq0aAjY0EALw_wcB");
	}
	public void EnterDestination() {
		 WebElement WhereAreYouGoingBox = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		 WhereAreYouGoingBox.sendKeys("New York");
		 WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement waitingForFirstOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")));
			 WebElement FirstOption = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
			FirstOption.click();
	}
	public void ClickCheckInCheckOutDate() {
		 WebElement CheckInCalender = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[5]"));
		 CheckInCalender.click();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement WaitingForCheckOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[5]/td[5]")));
		 WebElement CheckOutDate = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[5]/td[5]"));
		 CheckOutDate.click();
	}
	public void ClickNumOfHumans() {
		 WebElement NumOfPeopleBox = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]"));
		 NumOfPeopleBox.click();
		 driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/button[2]")).click();
	}
	public void ClickSearchBttn() {
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
	}
	public void SelectingRoom() throws InterruptedException {
Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@data-click-store-id=\"sr-compset-181844\"]")).click();
	}

	@Test
	public void TestingFirstThree() throws InterruptedException {
		GoToWebsite();
		EnterDestination();
		ClickCheckInCheckOutDate();
		ClickNumOfHumans();
		ClickSearchBttn();
		SelectingRoom();
	}
	
}

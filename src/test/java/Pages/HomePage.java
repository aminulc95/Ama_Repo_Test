package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Library.Base;
import freemarker.cache.WebappTemplateLoader;
import freemarker.core.ReturnInstruction.Return;

public class HomePage extends Base {
	
	public void GoToWebsite() {
		driver.get(
				"https://www.travelocity.com/lp/Nearby-Destinations?SEMCID=TRAVELOCITY-US.UB.GOOGLE.GT-c-EN.EPACKAGE&SEMDTL=a1190321540.b19452483500.d1273986224951.e1c.f11t2.g1kwd-20860151.h1e.i1.j19008126.k1.l1g.m1.n1&gclid=CjwKCAjw5dnmBRACEiwAmMYGOVPPC8e3w0GjpwF2OXXadebGG8t_LK45-pZ5U5XxmrIJLs14qLrQ7hoCtboQAvD_BwE&gclsrc=aw.ds&paandi=true");
	}
	public void EnteringInfoToLeavingfrombox() {
		WebElement LeavingFromBox = driver.findElement(By.id("FH-origin"));
		LeavingFromBox.sendKeys("Washington");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement waitingFor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aria-option-0")));
		WebElement firstOption = driver.findElement(By.id("aria-option-0"));
		firstOption.click();
	}
	public void EnteringInfoToGoingToBox() {
		WebElement GoingToBox = driver.findElement(By.xpath("//input[@id='FH-destination']"));
		GoingToBox.sendKeys("Arizona");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement waitingFor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aria-option-0")));
		WebElement firstOption = driver.findElement(By.id("aria-option-0"));
		firstOption.click();
	}
	public void EnteringLeavingDtae() {
		WebElement Calender = driver.findElement(By.xpath("//input[@id='FH-fromDate']"));
		Calender.clear();
		Calender.sendKeys("09/20/2019");
		driver.findElement(By.xpath("//div[@id='lite-wizard-form']//header[contains(@class,'')]")).click();
	}
	public void EnteringRetureDate() {
		 WebElement ReturnCalenderDate = driver.findElement(By.xpath("//input[@id='FH-toDate']"));
		 ReturnCalenderDate.clear();
		 ReturnCalenderDate.sendKeys("09/26/2019");
		 driver.findElement(By.xpath("//div[@id='lite-wizard-form']//header[contains(@class,'')]")).click();
	}
	public void SelectingNumOfRooms() {
		WebElement RoomsFromDropDown = driver.findElement(By.xpath("//select[@id='FH-NumRoom']"));
		Select DropDown = new Select(RoomsFromDropDown);
		DropDown.selectByValue("1");
		}
	public void SelectingNumOfAdults() {
		WebElement RoomsFromDropDown = driver.findElement(By.xpath("//select[@id='FH-NumAdult1']"));
		Select DropDown = new Select(RoomsFromDropDown);
		DropDown.selectByValue("1");
	}
	public void SelectiongNumOfChildren() throws InterruptedException {
		WebElement RoomsFromDropDown = driver.findElement(By.xpath("//select[@id='FH-NumChild1']"));
		Select DropDown = new Select(RoomsFromDropDown);
		DropDown.selectByValue("3");
		Thread.sleep(2000);
		WebElement devil1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[4]/form[1]/div[1]/fieldset[2]/label[1]/select[1]"));
		Select DropDown1 = new Select(devil1);
		DropDown1.selectByValue("2");
		WebElement devil2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[4]/form[1]/div[1]/fieldset[2]/label[2]/select[1]"));
		Select DropDown2 = new Select(devil2);
		DropDown2.selectByValue("12");
		WebElement devil3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[4]/form[1]/div[1]/fieldset[2]/label[3]/select[1]"));
		Select DropDown3 = new Select(devil3);
		DropDown3.selectByValue("12");
	}
	public void ClickingDirectBox() {
		WebElement CheckBoxForDirectFlight  = driver.findElement(By.xpath("//form[@id='wizardFHform']//input[@id='Direct']"));
		CheckBoxForDirectFlight.click();
	}
	public void clickSubmit() {
		driver.findElement(By.xpath("//form[@id='wizardFHform']//button[@class='btn-primary btn-action']")).click();
	}
	public void VerifyPageLoad() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement waitingFor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bold announce-able']")));}
		catch (Exception e) {
			System.out.println("Elem not found");
			e.printStackTrace();
		}
	}
	
	
	@Test
public void TestingTravelWebsite() throws InterruptedException {
	GoToWebsite();
	EnteringInfoToLeavingfrombox();
	EnteringInfoToGoingToBox();
	EnteringLeavingDtae();
	EnteringRetureDate();
	SelectingNumOfRooms();
	SelectingNumOfAdults();
	SelectiongNumOfChildren();
	ClickingDirectBox();
	clickSubmit();
	VerifyPageLoad();
	
}
}

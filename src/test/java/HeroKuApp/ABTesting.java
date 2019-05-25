package HeroKuApp;

import org.openqa.selenium.By;

import Library.Base;

public class ABTesting extends Base{

	public void GoToWebsite() {
		driver.get("http://the-internet.herokuapp.com/");
	}

	public void ClickOnABTesting() {
		driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/ul/li[1]/a")).click();
	}
	
}

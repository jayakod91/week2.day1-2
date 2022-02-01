package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Allow']")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Jaya");
		driver.findElement(By.name("secondname")).sendKeys("JK");
		Thread.sleep(2000);
		driver.findElement(By.name("MobileNo")).sendKeys("9984356789");
		driver.findElement(By.id("password")).sendKeys("JK@Dhi_4@");
		WebElement day = driver.findElement(By.id("day"));
		Select obj = new Select(day);
		obj.selectByVisibleText("4");
		WebElement month = (WebElement) driver.findElements(By.id("month"));
		Select obj1 = new Select(month);
		obj1.selectByValue("4");
		WebElement year = driver.findElement(By.id("year"));
		Select obj2 = new Select(year);
		obj2.selectByVisibleText("1993");
		driver.findElement(By.xpath("//input[@name='Female']/preceding::label")).click();
	


	}

}

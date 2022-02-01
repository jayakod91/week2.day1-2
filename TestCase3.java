package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jaya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Udhaya");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("4/04/1991");
		driver.findElement(By.id("createLeadForm_primaryPhoneCode")).sendKeys("04142");
		driver.findElement(By.id("createLeadForm_primaryEmailId")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+91-6383767429");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("siva");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Block 3, Kalapai Street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Neyveli");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Cuddalore");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalCountryProvinceGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("607803");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("607803");
		driver.findElement(By.name("submit")).click();
		driver.close();
	}

}

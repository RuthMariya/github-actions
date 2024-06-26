package selenium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LibertyDemoSelenium {

	private WebDriver driver;

	private Map<String, Object> vars;

	JavascriptExecutor js;

	final static String APPLICATION_BASE_URL = "https://test-actions-ruth.liberty-test-cluster-7e2996fc95fd6eb4a4c7a63aa3e73699-0000.us-south.containers.appdomain.cloud/";

	@Before
	public void setUp() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--headless=new");
		driver = new ChromeDriver(options);
		driver.get(APPLICATION_BASE_URL);
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		//driver.quit();
		if (driver != null) {
			// LogUtil.setLogString("Quit driver for new browser", true);
			driver.quit();
		}
	}

	@Test
	public void testSearchOwner() {
		// driver.get("https://liberty-demo-petclinic-demo.liberty-test-cluster-7e2996fc95fd6eb4a4c7a63aa3e73699-0000.us-south.containers.appdomain.cloud/");
		driver.manage().window().setSize(new Dimension(1050, 660));
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) span:nth-child(2)")).click();
		driver.findElement(By.id("lastName")).click();
		driver.findElement(By.id("lastName")).sendKeys("franklin");
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.cssSelector("b")).click();
		assertThat(driver.findElement(By.cssSelector("b")).getText(), is("George Franklin"));
		driver.close();
	}

	@Test
	public void testAddOwner() {
		// driver.get("https://liberty-demo-petclinic-demo.liberty-test-cluster-7e2996fc95fd6eb4a4c7a63aa3e73699-0000.us-south.containers.appdomain.cloud/");
		driver.manage().window().setSize(new Dimension(1050, 660));
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) span:nth-child(2)")).click();
		driver.findElement(By.linkText("Add Owner")).click();
		driver.findElement(By.id("firstName")).click();
		driver.findElement(By.id("firstName")).sendKeys("Karthik");
		driver.findElement(By.id("lastName")).click();
		driver.findElement(By.id("lastName")).sendKeys("D");
		driver.findElement(By.id("address")).click();
		driver.findElement(By.id("address")).sendKeys("abc");
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).sendKeys("xxyz");
		driver.findElement(By.id("telephone")).click();
		driver.findElement(By.id("telephone")).sendKeys("9878965454");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.cssSelector(".active")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".fa-step-forward")).click();
		driver.findElement(By.cssSelector(".fa-step-forward")).click();
		driver.findElement(By.cssSelector(".fa-step-forward")).click();
		driver.findElement(By.cssSelector(".fa-step-forward")).click();
		driver.findElement(By.linkText("Karthik D")).click();
		assertThat(driver.findElement(By.cssSelector(".xd-container")).getText(), is(
				"Owner Information\nName Karthik D\nAddress abc\nCity xxyz\nTelephone 9878965454\nEdit Owner Add New Pet\n\n\nPets and Visits"));

	}

	@Test
	public void testEditOwner() {
		// driver.get("https://liberty-demo-petclinic-demo.liberty-test-cluster-7e2996fc95fd6eb4a4c7a63aa3e73699-0000.us-south.containers.appdomain.cloud/");
		driver.manage().window().setSize(new Dimension(1050, 660));
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) span:nth-child(2)")).click();
		driver.findElement(By.id("lastName")).click();
		driver.findElement(By.id("lastName")).sendKeys("franklin");
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		driver.findElement(By.id("telephone")).click();
		driver.findElement(By.id("telephone")).click();
		{
			WebElement element = driver.findElement(By.id("telephone"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		driver.findElement(By.id("telephone")).sendKeys("9677500809");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.cssSelector(".active")).click();
		driver.findElement(By.cssSelector(".col-sm-offset-2")).click();
		driver.findElement(By.id("lastName")).click();
		driver.findElement(By.id("lastName")).sendKeys("franklin");
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.cssSelector("tr:nth-child(4) > td")).click();
		driver.findElement(By.cssSelector("tr:nth-child(4) > td")).click();
		{
			WebElement element = driver.findElement(By.cssSelector("tr:nth-child(4) > td"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > td")).getText(), is("9677500809"));
		driver.close();
	}

	@Test
	public void testAddPet() {
		driver.manage().window().setSize(new Dimension(1050, 660));
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) span:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.linkText("Eduardo Rodriquez")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("tim");
		driver.findElement(By.id("birthDate")).click();
		driver.findElement(By.id("birthDate")).sendKeys("2023-03-02");
		driver.findElement(By.id("type")).click();
		{
			WebElement dropdown = driver.findElement(By.id("type"));
			dropdown.findElement(By.xpath("//option[. = 'dog']")).click();
		}
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.cssSelector(".active")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.linkText("Eduardo Rodriquez")).click();
		// driver.findElement(By.cssSelector("tr:nth-child(3) dd:nth-child(2)")).click();
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(3) dd:nth-child(2)")).getText(), is("tim"));
		// driver.findElement(By.cssSelector("tr:nth-child(3) >
		// td:nth-child(4)")).click();
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(3) dd:nth-child(4)")).getText(), is("2023-03-02"));
		// driver.findElement(By.cssSelector("tr:nth-child(3) dd:nth-child(6)")).click();
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(3) dd:nth-child(6)")).getText(), is("dog"));
	}

	@Test
	public void testEditPet() {
		// driver.get("https://liberty-demo-petclinic-demo.liberty-test-cluster-7e2996fc95fd6eb4a4c7a63aa3e73699-0000.us-south.containers.appdomain.cloud/");
		driver.manage().window().setSize(new Dimension(1050, 660));
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) > .nav-link")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".fa-step-forward")).click();
		driver.findElement(By.linkText("Carlos Estaban")).click();
		driver.findElement(By.linkText("Edit Pet")).click();
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Luckie");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.cssSelector(".active > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".fa-step-forward")).click();
		driver.findElement(By.linkText("Carlos Estaban")).click();
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(2) dd:nth-child(6)")).getText(), is("cat"));
	}

	@Test
	public void testAddVisit() {
		// driver.get("https://liberty-demo-petclinic-demo.liberty-test-cluster-7e2996fc95fd6eb4a4c7a63aa3e73699-0000.us-south.containers.appdomain.cloud/");
		driver.manage().window().setSize(new Dimension(1050, 660));
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) span:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.linkText("Peter McTavish")).click();
		driver.findElement(By.linkText("Add Visit")).click();
		driver.findElement(By.id("date")).click();
		driver.findElement(By.id("date")).sendKeys("2023-03-25");
		driver.findElement(By.id("description")).click();
		driver.findElement(By.id("description")).sendKeys("regular");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.cssSelector(".active")).click();
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.linkText("Peter McTavish")).click();
		driver.findElement(By.cssSelector("tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)")).click();
		assertThat(
				driver.findElement(By.cssSelector("tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)")).getText(),
				is("2023-03-25"));
		driver.findElement(By.cssSelector("tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")).click();
		assertThat(
				driver.findElement(By.cssSelector("tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")).getText(),
				is("regular"));
	}

	@Test
	public void testListVeterinarians() {
		// driver.get("https://liberty-demo-petclinic-demo.liberty-test-cluster-7e2996fc95fd6eb4a4c7a63aa3e73699-0000.us-south.containers.appdomain.cloud/");
		driver.manage().window().setSize(new Dimension(1050, 660));
		driver.findElement(By.cssSelector(".nav-item:nth-child(3) > .nav-link")).click();
		assertThat(driver.findElement(By.cssSelector(".xd-container")).getText(), is(
				"Veterinarians\nName Specialties\nJames Carter none\nHelen Leary radiology\nLinda Douglas dentistry surgery\nRafael Ortega surgery\nHenry Stevens radiology\nPages: [ 1 2 ] "));
	}

}


package new_client;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


//import org.openqa.selenium.support.ui.*;


public class client_onboard {

	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		
	    String appUrl = "https://tempqacore.wellyx.com";
	    driver.get(appUrl);
	    //maximize the browser window
	    driver.manage().window().maximize();
	    //implicit wait for 3o seconds
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	    //Login to Core site
	    driver.findElement(By.name("txtEmail")).click();
	    driver.findElement(By.name("txtEmail")).clear();
	    driver.findElement(By.name("txtEmail")).sendKeys("m@harybeauty.hu");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("12345678");
	    //driver.findElement(By.cssSelector("//input.btn.next_btn")).click();
	    //driver.findElement(By.xpath("//input[@value='Login']")).click();
	    //driver.findElement(By.id("txtPassword")).clear();
	    //driver.findElement(By.id("txtPassword")).sendKeys("12345678");
	    driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
	    
	    WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).click().perform();
	   
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
		//ChromeDriver driver = new ChromeDriver(options);
		
	    //	driver.switchTo().alert().accept();
	    
    	    driver.findElement(By.linkText("Client")).click();
    	    driver.get("https://tempqacore.wellyx.com/client/details/0");
    	    //driver.get("https://tempqacore.wellyx.com/client/search");
    	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    	    //Enter name
    	    driver.findElement(By.name("FirstName")).clear();
    	    driver.findElement(By.name("FirstName")).sendKeys("Ármin   ");
    	    driver.findElement(By.name("LastName")).clear();
    	    driver.findElement(By.name("LastName")).sendKeys("T Orosz ");
    	    //Enter email adrs
    	    driver.findElement(By.name("Email")).click();
    	    driver.findElement(By.name("Email")).clear();
    	    driver.findElement(By.name("Email")).sendKeys("Armin@yopmail.com");
    	    //Select gender
    	    driver.findElement(By.name("Gender")).click();
    	    new Select(driver.findElement(By.name("Gender"))).selectByVisibleText("Male");
    	    driver.findElement(By.name("Gender")).click();
    	    //Enter phone number
    	    driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
    	    driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
    	    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("+36 10107123");
    	    //Enter country
    	    driver.findElement(By.name("Country")).click();
    	    new Select(driver.findElement(By.name("Country"))).selectByVisibleText("Hungary");
    	    driver.findElement(By.name("Country")).click();
    	    //Enter address line 1
    	    driver.findElement(By.name("Address1")).click();
    	    driver.findElement(By.name("Address1")).clear();
    	    driver.findElement(By.name("Address1")).sendKeys("Apor Péter u. 60.");
    	    //Enter State
    	    driver.findElement(By.name("State")).click();
    	    driver.findElement(By.name("State")).clear();
    	    driver.findElement(By.name("State")).sendKeys("Jász-Nagykun-Szolnok");
    	    //Enter City
    	    driver.findElement(By.name("CityName")).click();
    	    driver.findElement(By.name("CityName")).clear();
    	    driver.findElement(By.name("CityName")).sendKeys("Tiszabô");
    	    //Enter Post code
    	    driver.findElement(By.name("PostCode")).click();
    	    driver.findElement(By.name("PostCode")).clear();
    	    driver.findElement(By.name("PostCode")).sendKeys("5232");
    	    driver.findElement(By.xpath("//button[@type='submit']")).click();
    	    
    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	    
    	    //Search client
    	    driver.findElement(By.linkText("Dashboard")).click();
    	    driver.findElement(By.linkText("Clients")).click();
    	    //driver.findElement(By.xpath("//search-client/div/div/div[2]")).click();
    	    
    	    //Test print message in debugger window
    	    System.out.println("Test Passed!");
    	    
   //it closes all windows that webDriver has opened 	    
driver.quit();
    }
}

 

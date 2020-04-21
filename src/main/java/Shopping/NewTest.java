package Shopping;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest 
{
	public String url = "http://weathershopper.pythonanywhere.com/";
	//public String driverpath = "E:\\Automation\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
	public WebElement element;
	
		
  @Test
  public void Shopmoisturizers()
  {
	  String path = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", path + "\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get(url);
	  driver.manage().window().maximize();
	  
	  
	  //Verify Current Temprature
	  
	  WebElement temprature = driver.findElement(By.id("temperature"));
	  
	  int waeather = Integer.parseInt(temprature.getText());
	  
	  System.out.println(waeather);
	  
	  int i=19;
	  	  
	  if(waeather < i )
	  {
		  //click on By Moisturizers
		  
		  WebElement clkbuymoisturizers = driver.findElement(By.xpath("//button[contains(text(),'Buy moisturizers')]"));
		  clkbuymoisturizers.click();
		  
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Moisturizers')]")));
		  
		  // Click on least expensive mositurizer that contains Aloe
		  
		  WebElement leastexpensivealoe = driver.findElement(By.xpath("//div[2]//div[3]//button[1]"));
		  leastexpensivealoe.click();
		  
		  //Click on least expensive mositurizer that contains Almond
		  
		  WebElement leastexpensivealmond = driver.findElement(By.xpath("//div[3]//div[1]//button[1]"));
		  leastexpensivealmond.click();
		  
		  
		  //Click on cart
		  
		  WebElement clickcart = driver.findElement(By.xpath("//button[@class='thin-text nav-link']"));
		  clickcart.click();
		  
		  //Click on Pay with card
		  
		  WebElement clickpaywithcard = driver.findElement(By.xpath("//span[contains(text(),'Pay with Card')]"));
		  clickpaywithcard.click();
		  
		  //switch to payment detail frame
		  
		  WebElement frame = driver.findElement(By.xpath("//iframe[@name='stripe_checkout_app']"));
		  driver.switchTo().frame(frame);
		  
		  
		  //Fill up details
		  
		  WebElement email = driver.findElement(By.id("515587e0-839f-11ea-bee8-a9b397999e4c")); 
		  email.sendKeys("nehalprajapati89@gmail.com+");
		  
		  WebElement cardnumber = driver.findElement(By.id("5155fd10-839f-11ea-bee8-a9b397999e4c"));
		  cardnumber.sendKeys("4000056655665556");
		  
		  WebElement monthyear = driver.findElement(By.id("51562420-839f-11ea-bee8-a9b397999e4c"));
		  monthyear.sendKeys("0521");
		  
		  WebElement csvcode = driver.findElement(By.id("51564b30-839f-11ea-bee8-a9b397999e4c"));
		  csvcode.sendKeys("0521");
		  
		  WebElement zipcode = driver.findElement(By.id("d53fddc0-83a0-11ea-bee8-a9b397999e4c"));
		  zipcode.sendKeys("382481");
		  
		  WebElement clickpay = driver.findElement(By.xpath("//*[@id=\"container\"]/section/span[2]/div/div/main/form/nav/div/div/div/button"));
		  clickpay.click();
		  
		  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'PAYMENT SUCCESS')]")));
		  
		  String Expectedmessage = "PAYMENT SUCCESS";
		  
		  WebElement success = driver.findElement(By.xpath("//h2[contains(text(),'PAYMENT SUCCESS')]"));
		  
		  String successmessage = success.getText();
		  
		  Assert.assertEquals(successmessage, Expectedmessage);
		  
		  	  
		  
	  }
	  
	  else
	  {
		  //Click on Buy Sunscreens
		  
		  WebElement clkbuysunscreen = driver.findElement(By.xpath("//button[contains(text(),'Buy sunscreens')]"));
		  clkbuysunscreen.click();
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Sunscreens')]")));
		  
		  //Less Expensive sunscreen which has SPF-50
		  
		  WebElement leastexpensivespf50 = driver.findElement(By.xpath("//body//div[3]//div[3]//button[1]"));
		  leastexpensivespf50.click();
		  
		//Less Expensive sunscreen which has SPF-30
		  
		  WebElement leastexpensivespf30 = driver.findElement(By.xpath("//div[2]//div[3]//button[1]"));
		  leastexpensivespf30.click();
		  
		//Click on cart
		  
		  WebElement clickcart = driver.findElement(By.xpath("//button[@class='thin-text nav-link']"));
		  clickcart.click();
		  
		  
		//Click on Pay with card
		  
		  WebElement clickpaywithcard = driver.findElement(By.xpath("//span[contains(text(),'Pay with Card')]")); 
		  clickpaywithcard.click();
		 
		  
		//switch to payment detail frame
		  
		  WebElement frame = driver.findElement(By.xpath("//iframe[@name='stripe_checkout_app']"));
		  driver.switchTo().frame(frame);
		  
		//Fill up details
		  
		  WebElement email = driver.findElement(By.id("62509ea0-83a3-11ea-aaf9-2159fee780f1")); 
		  email.sendKeys("nehalprajapati89@gmail.com+");
		  
		  WebElement cardnumber = driver.findElement(By.id("625113d0-83a3-11ea-aaf9-2159fee780f1"));
		  cardnumber.sendKeys("4000056655665556");
		  
		  WebElement monthyear = driver.findElement(By.id("62513ae0-83a3-11ea-aaf9-2159fee780f1"));
		  monthyear.sendKeys("0521");
		  
		  WebElement csvcode = driver.findElement(By.id("625161f0-83a3-11ea-aaf9-2159fee780f1"));
		  csvcode.sendKeys("0521");
		  
		  WebElement zipcode = driver.findElement(By.id("ed911e40-83a3-11ea-aaf9-2159fee780f1"));
		  zipcode.sendKeys("382481");
		  
		  WebElement clickpay = driver.findElement(By.xpath("//*[@id=\"container\"]/section/span[2]/div/div/main/form/nav/div/div/div/button"));
		  clickpay.click();  
		  
		  
		 // Click on pay
		  WebElement clickpay1 = driver.findElement(By.xpath("//*[@id=\"container\"]/section/span[2]/div/div/main/form/nav/div/div/div/button"));
		  clickpay1.click();
		  
		  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'PAYMENT SUCCESS')]")));
		  
		  String Expectedmessage = "PAYMENT SUCCESS";
		  
		  WebElement success = driver.findElement(By.xpath("//h2[contains(text(),'PAYMENT SUCCESS')]"));
		  
		  String successmessage = success.getText();
		  
		  Assert.assertEquals(successmessage, Expectedmessage);
		
		  
		  
	  }
	  
	  
	  
	  
	  
  }
}

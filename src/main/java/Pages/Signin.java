package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.Base;
import io.github.sukgu.Shadow;

public class Signin extends Base
{

	public Signin()
	{
		
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//*[@class='mb-7 text-6gpx']")
//	private WebElement username;
//	
//	@FindBy(xpath="//*[@class='mb-2 text-6gpx']")
//	private WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="(//*[@class='hydrated'])[2]")
	private WebElement Signin;
	
	
	public void Login()
	{
		try 
		{
			System.out.println("Launching the browser");
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


           
            
		}
	
		catch (Exception e) 
			{
				System.out.println("Issue in Login method"+e);
			}
	}
	
	public void Signme()
	{
		try 
		{
			Thread.sleep(6000);

			driver.findElement(By.xpath("//*[@name='username']")).sendKeys("11000834");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Admin@2022");
			Thread.sleep(2000);
			login.click();
			Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            Thread.sleep(10000);
            Signin.click();
            
            
//            Shadow shadow = new Shadow(driver);
//            WebElement element = shadow.findElement("");
            
//            JavascriptExecutor jse=(JavascriptExecutor)driver;
//            WebElement element = (WebElement)jse.executeScript("document.querySelector(\"body > app > ng-component > div > div > div.container-fluid.app-container.px-0 > div > ghr-home > div.page.page-home.ng-star-inserted > div > gt-home-dashboard > div > div:nth-child(2) > gt-component-loader > gt-attendance-info > div > div > div.btn-container.mt-3x.flex.flex-row-reverse.justify-between.ng-star-inserted > gt-button:nth-child(1)\").shadowRoot.querySelector(\"button\")");
//            String js ="arguments[0].setAttributes('value','')";
//            jse.executeScript(js, element);
            
            // driver.close();

           
            
		}
	
		catch (Exception e) 
			{
				System.out.println("Issue in Signme method"+e);
			}
	}
	
	
}

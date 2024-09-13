//This script is for testing Frames
package Demo.assignment_MVN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class IFrames {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
    }

    @Test
    public void switching() throws InterruptedException {        
    
    	try
    	{
        WebElement iframe = driver.findElement(By.id("singleframe"));        
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Testing iframe using selenium.");
        }
    	catch(Exception e)
    	
    	{
    		 System.err.println("An error occurred during the drag-and-drop test: " + e.getMessage());
             e.printStackTrace();
             Assert.fail("Test failed due to an exception: " + e.getMessage());
    	}
    	}

    @AfterClass
   public void quit() {
        driver.quit();
    }
    }
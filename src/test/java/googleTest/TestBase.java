package googleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    protected void setUp(){
        driver = new ChromeDriver();
        System.out.println("aliona");
        //wait = new WebDriverWait(driver,15);
    }

    @AfterTest
    protected void tearDown(){
        driver.quit();
    }
}

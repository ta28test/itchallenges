package pages;

import googleTest.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;

public class SearchPage {

    WebDriver driver;
    String baseUrl = "http://google.com/ncr";
    By searchBar = By.name("q");

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(baseUrl);
    }

    public void searchFor(String text){
        driver.findElement(searchBar).sendKeys(text);
        driver.findElement(searchBar).sendKeys(Keys.ENTER);
    }

}

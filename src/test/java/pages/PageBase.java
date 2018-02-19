package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    public WebDriver driver;
    protected WebDriverWait wait;

    public PageBase(WebDriver driver){
        this.driver = driver;
    }
//
//    public boolean isPageLoaded(){
//        return (driver.getTitle().contains(pageTitle));
//    }

    public void open(String url){
        driver.get("https://google.com");
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void sendText(WebElement element, String text){
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public boolean isTextPresent(String text){
        return driver.getPageSource().contains(text);
    }

    public boolean isElementPresent(By by){
        try {
            driver.findElement(by);//if it does not find the element throw NoSuchElementException, thus returns false.
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

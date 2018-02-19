package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ImagesPage {

    WebDriver driver;
    By imageLocator = By.cssSelector("img[class='rg_ic rg_i']");
    By allResultsLink = By.cssSelector("a[class='q qs']");

    public ImagesPage(WebDriver driver){
        this.driver = driver;
    }

    public int getImagesCount(){
        List<WebElement> images = driver.findElements(imageLocator);
        return images.size();
    }

    public void switchBackToAllResults(){
        driver.findElement(allResultsLink).click();
    }
}

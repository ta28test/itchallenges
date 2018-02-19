package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultsPage {

    WebDriver driver;
    By resLinksLocator = By.className("_Rm");
    By imagesLink = By.cssSelector("a[class='q qs']");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResultLinkText(int position) {
        List<WebElement> links = driver.findElements(resLinksLocator);
        return links.get(position - 1).getText();
//        for (WebElement e : links) {
//            System.out.println(e.getText());
//        }
    }

    public void openImagesSearch() {
        driver.findElement(imagesLink).click();
    }
}

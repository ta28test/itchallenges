package googleTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ImagesPage;
import pages.SearchPage;
import pages.ResultsPage;

public class GoogleSearch extends TestBase{

    SearchPage searchPage ;
    ResultsPage resultsPage ;
    ImagesPage imagesPage ;
    String keyword = "selenide";
    String searchResult = "selenide.org";

    @Test
    public void searchForPhrase(){
         searchPage = new SearchPage(driver);
        resultsPage = new ResultsPage(driver);
        imagesPage = new ImagesPage(driver);

         searchPage.open();
         searchPage.searchFor(keyword);
        Assert.assertTrue(resultsPage.getResultLinkText(1).contains(searchResult));
        resultsPage.openImagesSearch();
        //check that images are present
        Assert.assertNotEquals(0,imagesPage.getImagesCount());
        imagesPage.switchBackToAllResults();
        System.out.println(resultsPage.getResultLinkText(3));
        Assert.assertTrue(resultsPage.getResultLinkText(3).contains(searchResult));
    }
}

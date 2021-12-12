package workHome5test;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SearchTest extends BasicTest{


    @Test
    void SearchTest() {
        webDriver.get(url);
        webDriver.findElement(By.name("search_query")).sendKeys("Printed");
        webDriver.findElement(By.name("submit_search")).click();


        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Prin")));

    }
}

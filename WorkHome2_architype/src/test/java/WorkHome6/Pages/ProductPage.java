package WorkHome6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseView{
    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProductPage clickWomenCatalog() {
        webDriver.findElement(By.xpath("//a[text() = 'Women']")).click();
        return this;
    }

    public ProductPage selectProduct(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//*[@class='product-name' and contains(text(),'Blouse')]")))
                .build().perform();
        webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();
        return this;
    }

    public ProductPage checkProduct(){
        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"icon-ok\"]")));
        return this;
    }
}

package WorkHome6.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseView{
    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Переходим в каталог женской одежды")
    public ProductPage clickWomenCatalog() {
        webDriver.findElement(By.xpath("//a[text() = 'Women']")).click();
        return this;
    }
    @Step("Ищем в отобразившемся каталоге Блузку, и добавляем в корзину")
    public ProductPage selectProduct(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//*[@class='product-name' and contains(text(),'Blouse')]")))
                .build().perform();
        webDriver.findElement(By.xpath(".//*[text()='Add to cart']")).click();
        return this;
    }
    @Step("Проверить, что продукт добавлен в корзину")
    public ProductPage checkProduct(){
        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"icon-ok\"]")));
        return this;
    }
}

package workHome5test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddShopingCartTest extends BasicTest{
    @Test
    void AddShopingCartTest() {
        webDriver.get(url);
        webDriver.findElement(By.xpath("//a[contains(@class, 'login')]")).click();
        webDriver.findElement(By.id("email")).sendKeys("fetaddeppapo-7697@yopmail.com");
        webDriver.findElement(By.name("passwd")).sendKeys("qwerty123456");
        webDriver.findElement(By.name("SubmitLogin")).click();
        webDriver.findElement(By.xpath("//a[text() = 'Women']")).click();


        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//a[@class='product-name' and contains(.,'Blouse')]")))
                .build().perform();


        webDriver.findElement(By.xpath(".//*[text()='Add to cart']")).click();

        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"icon-ok\"]")));

    }
}

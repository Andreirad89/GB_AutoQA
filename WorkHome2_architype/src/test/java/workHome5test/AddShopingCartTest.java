package workHome5test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        actions.moveToElement(webDriver.findElement(By.xpath("//*[@class='product-name' and contains(text(),'Blouse')]")))
                .build().perform();

        webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();

        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"icon-ok\"]")));

    }
}

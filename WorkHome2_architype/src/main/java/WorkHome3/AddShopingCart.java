package WorkHome3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddShopingCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("http://automationpractice.com/index.php");
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

        Thread.sleep(10000);
        webDriver.quit();

    }
}

package WorkHome3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateUser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("http://automationpractice.com/index.php");
        webDriver.findElement(By.xpath("//a[contains(@class, 'login')]")).click();
        webDriver.findElement(By.id("email_create")).sendKeys("fetaddeppapo-7697@yopmail.com");
        webDriver.findElement(By.name("SubmitCreate")).click();
        webDriver.findElement(By.id("uniform-id_gender1")).click();
        webDriver.findElement(By.id("customer_firstname")).sendKeys("Test");
        webDriver.findElement(By.name("customer_lastname")).sendKeys("Testtest");
        webDriver.findElement(By.name("passwd")).sendKeys("qwerty123456");

        webDriver.findElement(By.name("address1")).sendKeys("Ordy67");
        webDriver.findElement(By.name("city")).sendKeys("Minsk");
        webDriver.findElement(By.name("postcode")).sendKeys("00000");
        new Select(webDriver.findElement(By.id("id_state"))).selectByVisibleText("California");


        webDriver.findElement(By.name("phone_mobile")).sendKeys("768696906");

        webDriver.findElement(By.name("submitAccount")).click();

        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text() = 'My account']")));

        Thread.sleep(10000);
        webDriver.quit();
    }
}
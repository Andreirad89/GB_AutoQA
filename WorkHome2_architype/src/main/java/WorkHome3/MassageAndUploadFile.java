package WorkHome3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class MassageAndUploadFile {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("http://automationpractice.com/index.php");
        webDriver.findElement(By.id("contact-link")).click();
        webDriver.findElement(By.name("id_contact")).click();

        webDriver.findElement(By.xpath("//*[text()='Customer service']")).click();
        webDriver.findElement(By.id("email")).sendKeys("andreirad@yandex.ru");
        webDriver.findElement(By.id("id_order")).sendKeys("12345678");
        webDriver.findElement(By.id("fileUpload")).sendKeys("/Users/zalasupport/Desktop/HomeWorkAutomaticJAVA/GB_AutoQA/WorkHome2_architype/src/main/resources/обращение.txt");
        webDriver.findElement(By.name("message")).sendKeys("Hello,my new massage");
        webDriver.findElement(By.xpath("//*[text()='Send']")).click();
        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class, 'alert alert-success') and text() = 'Your message has been successfully sent to our team.']")));

        Thread.sleep(10000);
        webDriver.quit();
    }
}

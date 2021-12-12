package workHome5test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MassageAndUploadFileTest extends BasicTest{
    @Test
    void MassageAndUploadFileTest() {
        webDriver.get(url);
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

    }
}

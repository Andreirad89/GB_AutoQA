package WorkHome6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage extends BaseView{

    public ContactUsPage(WebDriver webDriver) {
        super(webDriver);
    }
    public ContactUsPage clickContactUs(){
        webDriver.findElement(By.id("contact-link")).click();
        return this;
    }

    public ContactUsPage filingFields(){
        webDriver.findElement(By.xpath("//*[text()='Customer service']")).click();
        webDriver.findElement(By.name("message")).sendKeys("Hello,my new massage");
        webDriver.findElement(By.xpath("//*[text()='Send']")).click();
        return this;
    }

    public ContactUsPage uploadFile() {
            webDriver.findElement(By.id("fileUpload")).sendKeys("/Users/zalasupport/Desktop/HomeWorkAutomaticJAVA/GB_AutoQA/WorkHome2_architype/src/main/resources/обращение.txt");
            return this;
        }

    public ContactUsPage checkContactUsMessage() {
        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class, 'alert alert-success') and text() = 'Your message has been successfully sent to our team.']")));
        return this;
    }
}

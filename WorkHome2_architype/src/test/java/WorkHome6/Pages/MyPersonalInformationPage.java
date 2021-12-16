package WorkHome6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyPersonalInformationPage extends BaseView{

    public MyPersonalInformationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MyPersonalInformationPage changeFirstName(String newname){
        webDriver.findElement(By.id("firstname")).clear();
        webDriver.findElement(By.id("firstname")).sendKeys(newname);
        return this;
    }
    public MyPersonalInformationPage changeLastName(String newlastname){
        webDriver.findElement(By.id("lastname")).clear();
        webDriver.findElement(By.id("lastname")).sendKeys(newlastname);
        return this;
    }
    public MyPersonalInformationPage inputPassword(String password){
        webDriver.findElement(By.name("old_passwd")).sendKeys(password);
        return this;
    }
    public MyPersonalInformationPage savePassword(){
        webDriver.findElement(By.name("submitIdentity")).click();
        return this;
    }

    public MyAccountPages clickBackToAccount(){
        webDriver.findElement(By.xpath("//a[contains(.,'Back to your account')]")).click();
        return new MyAccountPages(webDriver);
    }

    public MyPersonalInformationPage checkFirstName(String name) {
        assertThat(webDriver.findElement(By.id("firstname")).getAttribute("value"))
                .isEqualTo(name);
        return this;
    }

    public MyPersonalInformationPage checkLastName(String name) {
        assertThat(webDriver.findElement(By.id("lastname")).getAttribute("value"))
                .isEqualTo(name);
        return this;
    }
}

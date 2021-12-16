package WorkHome6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPages extends BaseView {

    public MyAccountPages(WebDriver webDriver) {
        super(webDriver);
    }
    public MyPersonalInformationPage clickMyPersonInformation(){
        webDriver.findElement(By.xpath("//a[.='My personal information']")).click();
        return new MyPersonalInformationPage(webDriver);

    }
}

package WorkHome6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages extends BaseView {

    public LoginPages(WebDriver webDriver) {
        super(webDriver);
    }

    public MyAccountPages Login(String username, String password){
    webDriver.findElement(By.id("email")).sendKeys(username);
    webDriver.findElement(By.id("passwd")).sendKeys(password);
    webDriver.findElement(By.id("SubmitLogin")).click();
    return new MyAccountPages(webDriver);
    }
}

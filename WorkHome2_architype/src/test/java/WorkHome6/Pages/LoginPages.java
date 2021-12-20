package WorkHome6.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages extends BaseView {

    public LoginPages(WebDriver webDriver) {
        super(webDriver);
    }
    @Step("Авторизоваться юзером {0} с паролем {1}")
    public MyAccountPages Login(String username, String password){
    webDriver.findElement(By.id("email")).sendKeys(username);
    webDriver.findElement(By.id("passwd")).sendKeys(password);
    webDriver.findElement(By.id("SubmitLogin")).click();
    return new MyAccountPages(webDriver);
    }
}

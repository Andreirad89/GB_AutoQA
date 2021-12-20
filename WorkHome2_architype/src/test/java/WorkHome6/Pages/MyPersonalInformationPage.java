package WorkHome6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyPersonalInformationPage extends BaseView{

    public MyPersonalInformationPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Изменить имя на {0}")
    public MyPersonalInformationPage changeFirstName(String newname){
        webDriver.findElement(By.id("firstname")).clear();
        webDriver.findElement(By.id("firstname")).sendKeys(newname);
        return this;
    }
    @Step("Изменить фамилию на {0}")
    public MyPersonalInformationPage changeLastName(String newlastname){
        webDriver.findElement(By.id("lastname")).clear();
        webDriver.findElement(By.id("lastname")).sendKeys(newlastname);
        return this;
    }
    @Step("Ввести пароль")
    public MyPersonalInformationPage inputPassword(String password){
        webDriver.findElement(By.name("old_passwd")).sendKeys(password);
        return this;
    }
    @Step("Нажимаем кнопку Сохранить")
    public MyPersonalInformationPage savePassword(){
        webDriver.findElement(By.name("submitIdentity")).click();
        return this;
    }
    @Step("Нажимаем кнопку Вернуться в свой аккаунт")
    public MyAccountPages clickBackToAccount(){
        webDriver.findElement(By.xpath("//a[contains(.,'Back to your account')]")).click();
        return new MyAccountPages(webDriver);
    }
    @Step("Проверяем, что имя равно {0}")
    public MyPersonalInformationPage checkFirstName(String name) {
        assertThat(webDriver.findElement(By.id("firstname")).getAttribute("value"))
                .isEqualTo(name);
        return this;
    }
    @Step("Проверить, что фамилия равна {0}")
    public MyPersonalInformationPage checkLastName(String name) {
        assertThat(webDriver.findElement(By.id("lastname")).getAttribute("value"))
                .isEqualTo(name);
        return this;
    }
}

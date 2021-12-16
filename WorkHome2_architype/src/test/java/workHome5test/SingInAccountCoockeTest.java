package workHome5test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingInAccountCoockeTest extends BasicTest{
    @Test
    void SingInAccountCoockeTest() {
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        webDriver.manage().deleteAllCookies();
        webDriver.manage().addCookie(new Cookie("PrestaShop-a30a9934ef476d11b6cc3c983616e364","P1FCHJTjoM8QGn5c0vE0%2BmMpu%2FTFL7JowD1HuXYpr%2BbeoElM9Z5Yyw66aqtw5yoyKJzUu8XGP7C%2Biq%2Fc%2By1Mej0fQvyixSH%2FYG1Rntcvnj8fFsvU%2Fa3AKbSfl4CItBs5agQiQPj0ynzeKje9233%2BkkSeOKjzq4%2BFrSEcsRmApRRhTxkKDya0K51y3IAxM71NK9SqFw9J9dECs1aDiIHfVY8UAwR2kMPslZLdJbwY8%2BrZP0KkTYLXDkM7m9z1u3nY4MiK5pQ7sIV%2FiK4d0cxtIuR1rgEX0VADKsK0VcCSnXy1x8qubSPu7p4ukkuCqTaXBDuEDye%2FU54ySNjp0cxsDH8eA0mn9SiHoGVZFi0RxGaRd0mEUEURdQRb0zDUtwvrALmFrCdOfzWT06L4u6MmSuVIX85pUm5d%2FdMFU4ch%2F3dZe8uBP4YpFCTkWs5tImKQZ9OZiHI%2BKeD%2BAUCX9lrYgmu0PNoFAXiSxRzVPH9H24U4dovXajqUcMFsrdJgQdLZ000370"));
        webDriver.get("http://automationpractice.com/index.php?controller=my-account");

        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text() = 'My account']")));

    }
}

package workHome5test;

import WorkHome6.Pages.Listener.ActionEventListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@ExtendWith(AllureJunit5.class)
public class BasicTest {
    protected EventFiringWebDriver webDriver;
    protected WebDriverWait webDriverWait;
    String url = "http://automationpractice.com/index.php";

    @BeforeEach
    void setUp() {
        webDriver =new EventFiringWebDriver(WebDriverManager.chromedriver().create());
        webDriver.register(new ActionEventListener());
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriverWait =new WebDriverWait(webDriver,5);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }
}

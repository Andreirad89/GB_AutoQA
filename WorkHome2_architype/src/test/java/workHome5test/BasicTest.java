package workHome5test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasicTest {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;
    String url = "http://automationpractice.com/index.php";

    @BeforeEach
    void setUp() {
        webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriverWait =new WebDriverWait(webDriver,5);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }
}

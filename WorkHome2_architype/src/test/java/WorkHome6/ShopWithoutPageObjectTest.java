package WorkHome6;

import WorkHome6.Pages.ContactUsPage;
import WorkHome6.Pages.LoginPages;
import WorkHome6.Pages.ProductPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import workHome5test.BasicTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopWithoutPageObjectTest extends BasicTest {
    private final String username = "poppy8257@getmail.lt";
    private final String password = "qwerty123456";
    private final Faker faker = new Faker();

    @Test
    @DisplayName("Изменение имени в профиле")
    void changeFirstNameTest() {
        String newname = faker.name().firstName();
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        new LoginPages(webDriver).Login(username,password)
                .clickMyPersonInformation()
                .changeFirstName(newname)
                .inputPassword(password)
                .savePassword()
                .clickBackToAccount()
                .clickMyPersonInformation()
                .checkFirstName(newname);
        /*webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=identity");
        webDriver.findElement(By.id("email")).sendKeys(username);
        webDriver.findElement(By.id("passwd")).sendKeys(password);
        webDriver.findElement(By.id("SubmitLogin")).click();

        webDriver.findElement(By.xpath("//a[.='My personal information']")).click();

        webDriver.findElement(By.id("firstname")).clear();
        webDriver.findElement(By.id("firstname")).sendKeys(newname);

        webDriver.findElement(By.name("old_passwd")).sendKeys(password);
        webDriver.findElement(By.name("submitIdentity")).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Your personal information has been successfully updated.')]")));

        webDriver.findElement(By.xpath("//a[contains(.,'Back to your account')]")).click();

        webDriver.findElement(By.xpath("//a[.='My personal information']")).click();

        assertThat(webDriver.findElement(By.id("firstname")).getAttribute("value"))
                .isEqualTo(newname);*/
    }

    @Test
    @DisplayName("Изменение фамилии профиля")
    void changeLastNameTest() {
        String newlastname = faker.name().lastName();

        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        new LoginPages(webDriver).Login(username,password)
                .clickMyPersonInformation()
                .changeLastName(newlastname)
                .inputPassword(password)
                .savePassword()
                .clickBackToAccount()
                .clickMyPersonInformation()
                .checkLastName(newlastname);
        /*webDriver.findElement(By.id("email")).sendKeys(username);
        webDriver.findElement(By.id("passwd")).sendKeys(password);
        webDriver.findElement(By.id("SubmitLogin")).click();

        webDriver.findElement(By.xpath("//a[.='My personal information']")).click();


        webDriver.findElement(By.id("lastname")).clear();
        webDriver.findElement(By.id("lastname")).sendKeys(newlastname);

        webDriver.findElement(By.name("old_passwd")).sendKeys(password);

        webDriver.findElement(By.name("submitIdentity")).click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Your personal information has been successfully updated.')]")));

        webDriver.findElement(By.xpath("//a[contains(.,'Back to your account')]")).click();

        webDriver.findElement(By.xpath("//a[.='My personal information']")).click();

        assertThat(webDriver.findElement(By.id("lastname")).getAttribute("value"))
                .isEqualTo(newlastname);*/
    }

    @Test
    @DisplayName("Положить товар в корзину")
    void AddShopCartTest() {
            webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
            new LoginPages(webDriver).Login(username,password);
            new ProductPage(webDriver).clickWomenCatalog()
                    .selectProduct()
                    .checkProduct();

            /*webDriver.findElement(By.id("email")).sendKeys(username);
            webDriver.findElement(By.id("passwd")).sendKeys(password);
            webDriver.findElement(By.name("SubmitLogin")).click();
            webDriver.findElement(By.xpath("//a[text() = 'Women']")).click();


            Actions actions = new Actions(webDriver);
            actions.moveToElement(webDriver.findElement(By.xpath("//*[@class='product-name' and contains(text(),'Blouse')]")))
                    .build().perform();

            webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();

            new WebDriverWait(webDriver, 8)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"icon-ok\"]")));*/
    }


    @Test
    @DisplayName("Отправка сообщения+загрузка файла")
    void MessageAndUploadFileTest() {
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        new LoginPages(webDriver).Login(username,password);
        new ContactUsPage(webDriver).clickContactUs().uploadFile()
            .filingFields()
                .checkContactUsMessage();
        /*webDriver.findElement(By.id("email")).sendKeys(username);
        webDriver.findElement(By.id("passwd")).sendKeys(password);
        webDriver.findElement(By.name("SubmitLogin")).click();
        webDriver.findElement(By.id("contact-link")).click();
        //webDriver.findElement(By.name("id_contact")).click();

        webDriver.findElement(By.xpath("//*[text()='Customer service']")).click();
        //webDriver.findElement(By.id("email")).sendKeys(username); //todo "после авторизации поле заполнено автоматически"
        //webDriver.findElement(By.id("id_order")).sendKeys("12345678"); //todo "после авторизации на странице поле не заполняется"
        webDriver.findElement(By.id("fileUpload")).sendKeys("/Users/zalasupport/Desktop/HomeWorkAutomaticJAVA/GB_AutoQA/WorkHome2_architype/src/main/resources/обращение.txt");
        webDriver.findElement(By.name("message")).sendKeys("Hello,my new massage");
        webDriver.findElement(By.xpath("//*[text()='Send']")).click();
        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(@class, 'alert alert-success') and text() = 'Your message has been successfully sent to our team.']")));
*/
    }

    @Test
    @DisplayName("Поиск")
    void SearchTest() {
        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        //webDriver.findElement(By.id("email")).sendKeys(username);
        //webDriver.findElement(By.id("passwd")).sendKeys(password);
        new LoginPages(webDriver).Login(username,password);

        webDriver.findElement(By.name("search_query")).sendKeys("Printed");
        webDriver.findElement(By.name("submit_search")).click();

        new WebDriverWait(webDriver, 8)
                .until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Prin")));


    }
}


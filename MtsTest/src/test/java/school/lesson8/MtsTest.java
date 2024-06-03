package school.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MtsTest {

    private ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        WebElement cancelCookie = driver.findElement(By.xpath("//button[contains(@class, 'cookie__cancel')]"));
        cancelCookie.click();
    }


    @Test(description = "Проверка названия блока «Онлайн пополнение 'Без комиссии'", priority = 0)
    public void checkTitle () {
        WebElement block = driver.findElement(By.xpath("//section[@class = 'pay']"));
        WebElement element = block.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
        assertEquals(element.getText(), "Онлайн пополнение\nбез комиссии", "Название блока не совпадает с ожидаемым результатом");

    }

    @Test(description = "Проверка наличия логотипов платёжных систем", priority = 1)
    public void checkLogoPayments() {

        WebElement block = driver.findElement(By.xpath("//section[@class = 'pay']"));
        List<WebElement> elements = block.findElements(By.xpath("//div[@class = 'pay__partners']/ul/li"));
        int actual = elements.size();
        assertEquals(actual, 5, "Количество логотипов платежных систем не совпадает с ожидаемым результатом");

        WebElement visa = block.findElement(By.xpath("//img[@alt='Visa']"));
        assertTrue(visa.isDisplayed());

        WebElement verifiedByVisa = block.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        assertTrue(verifiedByVisa.isDisplayed());

        WebElement mastercard = block.findElement(By.xpath("//img[@alt='MasterCard']"));
        assertTrue(mastercard.isDisplayed());

        WebElement mastercardSecureCode = block.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        assertTrue(mastercardSecureCode.isDisplayed());

        WebElement belcard = block.findElement(By.xpath("//img[@alt='Белкарт']"));
        assertTrue(belcard.isDisplayed());
    }

    @Test(description = "Проверка работы ссылки «Подробнее о сервисе»", priority = 3)
    public void checkLink(){

        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();
        String getUrl = driver.getCurrentUrl();
        assertEquals(getUrl,"https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", "Ссылки не совпадают!");

    }

    @Test(description = "Заполнение полей и проверка работы кнопки «Продолжить»", priority = 2)
    public void checkFieldsAndButton(){

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");

        WebElement sumField = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        sumField.click();
        sumField.sendKeys("457");

        WebElement email = driver.findElement(By.xpath("//input[@id='connection-email']"));
        email.click();
        email.sendKeys("test@test.com");

        WebElement button = driver.findElement(By.xpath("//form[@id = 'pay-connection']/button[@type = 'submit']"));
        button.click();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement testFrame = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(testFrame);

        WebElement closeButton = driver.findElement(By.xpath("//div/svg-icon[@class='header__close-icon']"));
        assertTrue(closeButton.isEnabled(), "Кнопка недоступна");
        closeButton.click();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}



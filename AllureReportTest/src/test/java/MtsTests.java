import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MtsTests {
    private WebDriver driver;
    private final String SUMM_XPATH = "//input[@id='connection-sum']";
    private final String SUMM_EXPECTED = "Сумма";
    private final String EMAIL_XPATH = "//input[@id='connection-email']";
    private final String EMAIL_EXPECTED = "E-mail для отправки чека";
    private final String DROPDOWN_XPATH = "//span[@class = 'select__arrow']";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        WebElement cancelCookie = driver.findElement(By.xpath("//button[contains(@class, 'cookie__cancel')]"));
        cancelCookie.click();
    }

    @Test(testName = "Проверка надписей в незаполненных полях для 'Услуги связи'", description = "Проверка надписей в незаполненных полях для варианта оплаты 'Услуги связи'", priority = 0)
    public void сheckFieldsForCommunicationServices() {
        String phoneNumber = driver.findElement(By.xpath("//input[@id='connection-phone']")).getAttribute("placeholder");
        String phoneNumberExpected = "Номер телефона";
        String sumField = driver.findElement(By.xpath(SUMM_XPATH)).getAttribute("placeholder");
        String email = driver.findElement(By.xpath(EMAIL_XPATH)).getAttribute("placeholder");
        assertEquals(phoneNumber, phoneNumberExpected, "Ошибка в названии надписи в поле 'Номер телефона'");
        assertEquals(sumField, SUMM_EXPECTED, "Ошибка в названии надписи в поле 'Сумма'");
        assertEquals(email, EMAIL_EXPECTED, "Ошибка в названии надписи в поле 'E-mail для отправки чека'");
    }

    @Test(testName = "Проверка надписей в незаполненных полях для 'Домашний интернет'", description = "Проверка надписей в незаполненных полях для варианта оплаты 'Домашний интернет'", priority = 1)
    public void сheckFieldsForHomeInternet(){
        driver.findElement(By.xpath(DROPDOWN_XPATH)).click();
        driver.findElement(By.xpath("//p[contains(text(), 'Домашний интернет')]")).click();
        String subscriberNumber = driver.findElement(By.xpath("//input[@id='internet-phone']")).getAttribute("placeholder");
        String subscriberNumberExpected = "Номер абонента";
        String sumField = driver.findElement(By.xpath(SUMM_XPATH)).getAttribute("placeholder");
        String email = driver.findElement(By.xpath(EMAIL_XPATH)).getAttribute("placeholder");
        assertEquals(subscriberNumber, subscriberNumberExpected, "Ошибка в названии надписи в поле 'Номер абонента");
        assertEquals(sumField, SUMM_EXPECTED, "Ошибка в названии надписи в поле 'Сумма'");
        assertEquals(email, EMAIL_EXPECTED, "Ошибка в названии надписи в поле 'E-mail для отправки чека'");
    }

    @Test(testName = "Проверка надписей в незаполненных полях для 'Рассрочка'", description = "Проверка надписей в незаполненных полях для варианта оплаты 'Рассрочка'", priority = 2)
    public void сheckFieldsForInstallmentPlan() {
        driver.findElement(By.xpath(DROPDOWN_XPATH)).click();
        driver.findElement(By.xpath("//li/p[contains(text(), 'Рассрочка')]")).click();
        String accountNumber = driver.findElement(By.xpath("//input[@id='score-instalment']")).getAttribute("placeholder");
        String accountNumberExpected = "Номер счета на 44";
        String sumField = driver.findElement(By.xpath(SUMM_XPATH)).getAttribute("placeholder");
        String email = driver.findElement(By.xpath(EMAIL_XPATH)).getAttribute("placeholder");
        assertEquals(accountNumber,accountNumberExpected, "Ошибка в названии надписи в поле 'Номер счета на 44'");
        assertEquals(sumField, SUMM_EXPECTED, "Ошибка в названии надписи в поле 'Сумма'");
        assertEquals(email, EMAIL_EXPECTED, "Ошибка в названии надписи в поле 'E-mail для отправки чека'");
    }

    @Test(testName = "Проверка надписей в незаполненных полях для 'Задолженность'", description = "Проверка надписей в незаполненных полях для варианта оплаты 'Задолженность'", priority = 3)
    public void сheckFieldsForDebt() {
        driver.findElement(By.xpath(DROPDOWN_XPATH)).click();
        driver.findElement(By.xpath("//li/p[contains(text(), 'Задолженность')]")).click();
        String accountNumber = driver.findElement(By.xpath("//input[@id='score-arrears']")).getAttribute("placeholder");
        String accountNumberExpected = "Номер счета на 2073";
        String sumField = driver.findElement(By.xpath(SUMM_XPATH)).getAttribute("placeholder");
        String email = driver.findElement(By.xpath(EMAIL_XPATH)).getAttribute("placeholder");
        assertEquals(accountNumber,accountNumberExpected,"Ошибка в названии надписи в поле 'Номер счета на 2073'");
        assertEquals(sumField, SUMM_EXPECTED, "Ошибка в названии надписи в поле 'Сумма'");
        assertEquals(email, EMAIL_EXPECTED, "Ошибка в названии надписи в поле 'E-mail для отправки чека'");
    }

    @Test(testName = "Проверка отображения данных для 'Услуги связи' в открывшемся окне", description = "Проверка отображения данных для варианта оплаты 'Услуги связи'", priority = 4)
    public void checkDisplayElements(){
        driver.findElement(By.xpath(DROPDOWN_XPATH)).click();
        driver.findElement(By.xpath("//p[contains(text(), 'Услуги связи')]")).click();

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");

        WebElement sumField = driver.findElement(By.xpath(SUMM_XPATH));
        sumField.click();
        sumField.sendKeys("457");

        WebElement email = driver.findElement(By.xpath(EMAIL_XPATH));
        email.click();
        email.sendKeys("test@test.com");

        WebElement button = driver.findElement(By.xpath("//form[@id = 'pay-connection']/button[@type = 'submit']"));
        button.click();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement testFrame = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(testFrame);

        WebElement summText = driver.findElement(By.xpath("//div[@class = 'pay-description__cost']"));
        new WebDriverWait(driver,5).until(d -> summText.isDisplayed());

        String summExpected = "457.00 BYN";
        assertEquals(summText.getText(), summExpected, "Отображение суммы некорректно" );

        WebElement summButton = driver.findElement(By.xpath("//div/div/button[@type = 'submit']"));
        String buttonExpected = "Оплатить " + summExpected;
        assertEquals(summButton.getText(), buttonExpected, "Отображение суммы некорректно" );

        WebElement phoneNumberText = driver.findElement(By.xpath("//span[@class = 'pay-description__text']"));
        assertTrue(phoneNumberText.isDisplayed(), "Номер телефона не отображается");
        String phoneNumberActual = phoneNumberText.getText();
        String phoneNumberExpected = "Оплата: Услуги связи Номер:375297777777";
        assertEquals(phoneNumberActual,phoneNumberExpected,"Отображается неверный Номер телефона");

        WebElement cardNumber = driver.findElement(By.xpath("//label[@class= 'ng-tns-c45-1 ng-star-inserted']"));
        assertTrue(cardNumber.isDisplayed(), "Не отображается номер карты");
        String cardNumberActual = cardNumber.getText();
        String cartNumberExpected = "Номер карты";
        assertEquals(cardNumberActual, cartNumberExpected, "Отображается неверная надпись для поля 'Номер карты'");

        WebElement validityDate = driver.findElement(By.xpath("//label[@class= 'ng-tns-c45-4 ng-star-inserted']"));
        assertTrue(validityDate.isDisplayed(), "Не отображается срок действия");
        String validityDateActual = validityDate.getText();
        String validityDateExpected = "Срок действия";
        assertEquals(validityDateActual,validityDateExpected,"Отображается неверная надпись для поля 'Срок действия'");

        WebElement cvc = driver.findElement(By.xpath("//label[@class= 'ng-tns-c45-5 ng-star-inserted']"));
        assertTrue(cvc.isDisplayed(), "Не отображается cvc");
        String cvcActual = cvc.getText();
        String cvcExpected = "CVC";
        assertEquals(cvcActual,cvcExpected,"Отображается неверная надпись для поля 'CVC'");

        WebElement holderName = driver.findElement(By.xpath("//label[@class= 'ng-tns-c45-3 ng-star-inserted']"));
        assertTrue(holderName.isDisplayed(), "Не отображается Имя держателя карты");
        String holderNameActual = holderName.getText();
        String holderNameExpected = "Имя держателя (как на карте)";
        assertEquals(holderNameActual,holderNameExpected,"Отображается неверная надпись для поля 'Имя держателя (как на карте)'");

        WebElement iconMastercard = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']"));
        assertTrue(iconMastercard.isDisplayed(),"Иконка Mastercard не отображается");
        WebElement iconVisa = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']"));
        assertTrue(iconVisa.isDisplayed(), "Иконка Visa не отображается");
        WebElement iconBelcart = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']"));
        assertTrue(iconBelcart.isDisplayed(), "Иконка Белкарта не отображается");
        WebElement iconRandomCardState = driver.findElement(By.xpath("//div[@class='cards-brands cards-brands_random ng-tns-c60-0 ng-star-inserted']"));
        assertTrue(iconRandomCardState.isDisplayed(), "Иконка для карты Mir/Maestro не отображается");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


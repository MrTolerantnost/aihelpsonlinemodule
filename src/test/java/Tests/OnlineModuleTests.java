package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.OnlineModuleObjects;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class OnlineModuleTests {

    WebDriver driver;
    WebDriverWait wait;
    OnlineModuleObjects onlineModuleObjects;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize( new Dimension(600,1000) );
        onlineModuleObjects = new OnlineModuleObjects(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        wait = new WebDriverWait(this.driver,10);


    }
    @Ignore
    @Test
    public void FullSmoke() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(this.driver,10);

        onlineModuleObjects.
                open().clickChooseGenderButton().clickChooseDateAndTimeButton().clickDate().
                clickTime().clickContinue().clickServiceFromListButton().clickContinue().
                clickSpecialistButton().clickContinue().clickContinueOrderButton().
                clearInputPhoneNumber().sendInputPhoneNumber().enterButton().clearInputPhoneNumber().
                sendConfirmationNumber().
                enterButton().checkCheckBox().clickContinueOrderButton();




    }
    //@Ignore
    @Test
    public void isTFWSOn() {
        onlineModuleObjects.open();


    }

    @Test
    public void smokeTestFlowWithoutSpecialistIsOnEn () {
    onlineModuleObjects.open().clickChooseGenderButton();
        String service = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[1]")).getText();
        Assert.assertNotEquals("a professional",service);
        String date = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[2]")).getText();
        Assert.assertNotEquals("a professional",date);
        try {

            WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[3]"));

        } catch (NoSuchElementException e) {

// Element wasn't found. Do something here

        }


    }
    @Test
    public void smokeTestFlowWithoutSpecialistIsOnRu () {
        onlineModuleObjects.open().clickChooseGenderButton();
        String service = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[1]")).getText();
        Assert.assertNotEquals("Выберите"+"\n"+ "специалиста", service);
        String date = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[2]")).getText();
        Assert.assertNotEquals("Выберите"+"\n"+ "специалиста", date);
        //try {

           // WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[3]"));

       // } catch (NoSuchElementException e) {

    // Element wasn't found. Do something here

       // }
        System.out.println(service);

    }
    @After
    public void driverQuit() {
        driver.quit();
    }




}

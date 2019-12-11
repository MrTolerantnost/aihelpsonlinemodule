package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GenderPageObjects;
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

public class GenderPageButtonTests {

    WebDriver driver;
    WebDriverWait wait;
    GenderPageObjects genderPageObjects;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize( new Dimension(600,1000) );
        genderPageObjects = new GenderPageObjects(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(this.driver,10);
    }





    @Test
    public void clickFemaleButton () {
        genderPageObjects
                .open().clickFemaleButton();

    }
    @Test
    public void clickMaleButton () {
        genderPageObjects
                .open().clickMaleButton();


    }
    @Test
    public void clickFirstLocation() {
        genderPageObjects
                .open().clickFemaleButton().clickFirsrtLocation();
    }

    @Test
    public void clickChoseDateAndTime() {
        genderPageObjects
                .open().clickFemaleButton().clickFirsrtLocation().clickChoseDateAndTime();
    }
    @Test
    public void clickChoseService() {
        genderPageObjects
                .open().clickFemaleButton().clickFirsrtLocation().clickChoseService();
    }
    @Test
    public void clickChoserofesional() {
        genderPageObjects
                .open().clickFemaleButton().clickFirsrtLocation().clickChoseProffesional();
    }
    @After

    public void driverQuit() {

        driver.quit();
    }
}

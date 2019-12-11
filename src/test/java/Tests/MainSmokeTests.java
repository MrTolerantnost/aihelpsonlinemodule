package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GenderPageObjects;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainSmokeTests {





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
    public void createAppointmentStartingFromDateAndTime () throws InterruptedException {
        genderPageObjects
                .open().clickFemaleButton().clickFirsrtLocation().clickChoseDateAndTime().markDate().markTime()
                .clickContinueButtonFromCalendar().clickFirstAvailebleService().clickContinueButtonFromService()
                .clickFirstAveliableSpecialist().clickContinueButtonFromSpecialist();
        Thread.sleep(500);
    }

    @After

    public void driverQuit() {

        driver.quit();
    }
}

package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GenderPageObjects;
import org.junit.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AboutPageTests {
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
    public void isAboutButtonWork () {
        genderPageObjects
                .open().clickAboutButton();

    }
    @Ignore
    @Test
    public void openSite () {
        String newTab = "AlHelps";

        genderPageObjects
                .open().clickAboutButton().clicksiteIcon();
        //driver.switchTo().window()

        driver.switchTo().window(newTab);
        String actualTitle = driver.getTitle();
        String expectedTitle = "AlHelps";
        //Assert.assertEquals(note,noteMainPage.getNoteContent())
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Ignore
    @Test
    public void openSite1 () throws InterruptedException {
        String expectedTitle = "AIHelps";
        String parentWinHandle = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWinHandle);

        genderPageObjects
                .open().clickAboutButton().clicksiteIcon();

        Set<String> winHandles = driver.getWindowHandles();
        // Loop through all handles
        for(String handle: winHandles){
            if(!handle.equals(parentWinHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(1000);
                System.out.println("Title of the new window: " +
                        driver.getTitle());

                System.out.println("Closing the new window...");
                driver.close();
            }

        }
        String actualTitle = driver.getTitle();
        // Switching the control back to parent window
        driver.switchTo().window(parentWinHandle);
        // Print the URL to the console
        System.out.println("Parent window URL: " + driver.getCurrentUrl());
        Assert.assertEquals(expectedTitle,actualTitle);

    }


    @Ignore
    @Test
    public void openSite2 () {
        String expectedTitle = "AIHelps";
        String parentWinHandle = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWinHandle);

        genderPageObjects
                .open().clickAboutButton().clicksiteIcon();





    }





    @Test
    public void openInstagramm () {
        genderPageObjects
                .open().clickAboutButton().clickInstagrammIcon();
    }

    @Test
    public void openFacebook () {
        genderPageObjects
                .open().clickAboutButton().clickFacebookIcon();
    }

    @Test
    public void openViber () {
        genderPageObjects
                .open().clickAboutButton().clickViberIcon();
    }

    @Test
    public void openTelegramm () {
        genderPageObjects
                .open().clickAboutButton().clickTelegramIcon();
    }





    @After

    public void driverQuit() {

        driver.quit();
    }
}

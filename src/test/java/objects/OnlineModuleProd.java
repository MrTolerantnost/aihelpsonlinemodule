package objects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OnlineModuleProd {


    WebDriver driver;
    WebDriverWait wait;
    OnlineModuleObjects onlineModuleObjects;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(600, 1000));
        onlineModuleObjects = new OnlineModuleObjects(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(this.driver, 10);
        driver.switchTo().frame(0);


    }


    @Test
    public void smoke () {
        onlineModuleObjects.open127453();
        String text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/div")).getText();
        Assert.assertEquals("Давайте начнём! Просто выберите один из пунктов и следуйте дальнейшим инструкциям",text);
    }


        @After
        public void driverQuit() {
            driver.quit();
        }

    }




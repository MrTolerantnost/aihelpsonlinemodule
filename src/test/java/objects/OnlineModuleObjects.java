package objects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OnlineModuleObjects {
    private static final String url = "https://online-booking-ts-70edvzn3p.now.sh/696320";
    private static final String url127453 = "https://beautyprosoftware.com/b/127453/";
    private static final String testPhone = "+18005550110";
    private static final String confirmationNumber ="1337";
    private static final By chooseGender = By.xpath("/html/body/div/div/div/main/div[2]/div[1]");
    private static final By chooseDateAndTimeButton = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[1]");
    private static final By chooseServiceButton = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[2]");
    private static final By chooseSpecialistButton = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[3]");
    private static final By dateButton = By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/div[2]/label[1]");
    private static final By timeButton = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/label[1]");
    private static final By continueButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/button");
    private static final By serviceFromList = By.xpath("/html/body/div/div/div/main/label[1]/div[1]/div[2]");
    private static final By specialistFromList = By.xpath("//*[@id=\"root\"]/div/div/main/label[1]/div[1]");
    private static final By continueOrderButton = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a");
    private static final By confirmPhoneButton =By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/button");
    private static final By inputPhoneNumber = By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/input");
    private static final By checkBoxAgreement = By.xpath("//*[@id=\"root\"]/div/div/form/div/div[3]/div/div[1]/svg");
    private static final By confirmNumberButton = By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/button");
    //public static final By chooseServiceButtonPublic = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[2]");


    private WebDriver driver;
    private WebDriverWait wait;

    public OnlineModuleObjects(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }


    public OnlineModuleObjects open() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects open127453() {
        driver.get(url127453);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public OnlineModuleObjects clickChooseGenderButton() {
        driver.findElement(chooseGender).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickChooseServiceButton() {
        driver.findElement(chooseServiceButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects getChooseServiceButtonText() {
        driver.findElement(chooseServiceButton).getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickChooseSpecialistButton() {
        driver.findElement(chooseSpecialistButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickChooseDateAndTimeButton() {
        driver.findElement(chooseDateAndTimeButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickDate() {
        driver.findElement(dateButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickTime() {
        driver.findElement(timeButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickContinue() {
        driver.findElement(continueButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickServiceFromListButton() {
        driver.findElement(serviceFromList).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickSpecialistButton() {
        driver.findElement(specialistFromList).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickContinueOrderButton() {
        driver.findElement(continueOrderButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clearInputPhoneNumber() {
        driver.findElement(inputPhoneNumber).clear();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public OnlineModuleObjects sendInputPhoneNumber() {
        driver.findElement(inputPhoneNumber).sendKeys(testPhone);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects sendConfirmationNumber() {
        driver.findElement(inputPhoneNumber).sendKeys(confirmationNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public OnlineModuleObjects clickCheckBoxAgreement() {
        driver.findElement(checkBoxAgreement).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public OnlineModuleObjects clickConfirmPhoneButton() {
        driver.findElement(confirmPhoneButton);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public OnlineModuleObjects clickConfirmNumberButton() {
        driver.findElement(confirmNumberButton);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public OnlineModuleObjects enterButton() {
        driver.findElement(inputPhoneNumber).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public OnlineModuleObjects checkCheckBox() {
        List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button"));
        ((WebElement) checkbox.get(0)).click();
        return this;
    }

    public OnlineModuleObjects waitStep () throws InterruptedException {
            wait.wait(5000);
            return this;
    }

}

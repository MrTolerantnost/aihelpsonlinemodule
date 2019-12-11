package objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GenderPageObjects {
    private static final By stop = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[3]/div");
                    //GenderPage
    private static final String url = "https://online-booking-ts-a7but0bhd.now.sh/online-booking-src/696320";
    private static final By backButton = By.xpath("/html/body/div/div/div/header/button[1]");
    private static final By aboutButton = By.xpath("//*[@id=\"root\"]/div/div/header/button/a");
    private static final By femaleButton = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[1]");
    private static final By maleButton = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/div[2]");
    private static final By officialPageLink = By.xpath("/html/body/div/div/div/footer/a");
                    //LocationPage
    private static final By locationFirst = By.xpath("//*[@id=\"root\"]/div/div/main/div/a[3]");
    private static final By locationSecond = By.xpath("//*[@id=\"root\"]/div/div/main/div/a[2]");
    private static final By locationTherd = By.xpath("//*[@id=\"root\"]/div/div/main/div/a[3]");
    //private static final By locationFirst = By.className("locations__Item-sc-1ta3b1t-3 kdDggA");

                    //AboutPage
    private static final By siteIcon = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/a[1]");
    private  static final By instagrammIcon = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/a[2]");
    private static final By facebookIcon = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/a[3]");
    private static final By viberIcon = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/a[4]");
    private static final By telegramIcon = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/a[5]");

                    //* Online-module/Order/Default */
    private static final By choseDateAndTime = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[1]/div");
    private static final By choseService = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[2]/div");
    private static final By choseProffesional = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/a[3]/div");

                    //*Calendar

    private static final  By date = By.xpath("//*[@id=\"root\"]/div/div/main/div[1]/div[2]/label[1]");
    private static final By time = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/label[1]");
    private static final By continueButtonFromCalendar = By.xpath("//*[@id=\"root\"]/div/div/div[2]/button");

                    //*Service
    private static final By service = By.xpath("//*[@id=\"root\"]/div/div/main/div[2]/label");
    private static final By continueButtonFromService = By.xpath("//*[@id=\"root\"]/div/div/div[2]/button");

                    //*Specialists
    private static final By specialist =By.xpath("//*[@id=\"root\"]/div/div/main/label[1]");
    private static final By continueButtonFromSpecialist = By.xpath("//*[@id=\"root\"]/div/div/div[2]/button");



    private WebDriver driver;
    private WebDriverWait wait;


    public GenderPageObjects (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public GenderPageObjects open() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public GenderPageObjects clickBackButton () {
        driver.findElement(backButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickAboutButton () {
        driver.findElement(aboutButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickFemaleButton () {
        driver.findElement(femaleButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickMaleButton () {
        driver.findElement(maleButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickOfficialPageLink () {
        driver.findElement(officialPageLink).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public GenderPageObjects clickFirsrtLocation () {
        driver.findElement(locationFirst).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clicksiteIcon () {
        driver.findElement(siteIcon).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public GenderPageObjects clickInstagrammIcon () {
        driver.findElement(instagrammIcon).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickFacebookIcon () {
        driver.findElement(facebookIcon).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickViberIcon() {
        driver.findElement(viberIcon).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickTelegramIcon () {
        driver.findElement(telegramIcon).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickChoseDateAndTime () {
        driver.findElement(choseDateAndTime).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;

    }

    public GenderPageObjects clickChoseService () {
        driver.findElement(choseService).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;

    }

    public GenderPageObjects clickChoseProffesional () {
        driver.findElement(choseProffesional).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;

    }

    public GenderPageObjects markDate () {
        driver.findElement(date).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;

    }
    public GenderPageObjects markTime () {
        driver.findElement(time).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;

    }


    public GenderPageObjects stop(){
        driver.findElement(stop).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickContinueButtonFromCalendar () {
        driver.findElement(continueButtonFromCalendar).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }


    public GenderPageObjects clickFirstAvailebleService () {
        driver.findElement(service).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;

    }

    public GenderPageObjects clickContinueButtonFromService () {
        driver.findElement(continueButtonFromService).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public GenderPageObjects clickFirstAveliableSpecialist() {
        driver.findElement(specialist).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;

    }

    public GenderPageObjects clickContinueButtonFromSpecialist() {
        driver.findElement(continueButtonFromSpecialist).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

}

/**
 * Created by fwrmoral on 10/29/2017.
 */

//package ewmloginpage;
//import java.sql.Driver;
//import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.concurrent.TimeUnit;
public class ewmLogin {


    public static void main (String[] args) {

        String myURL = ("http://10.1.100.197:9082");
        String myLOGIN =("/ewm/login.html");
        String myHOME =("/ewm/home.htm");


        //Chrome options setup
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("chrome.switches","--disable-extensions");
        //To Disable any browser notifications
        //options.addArguments("--disable-notifications");
        //To disable yellow strip info bar which prompts info messages
        options.addArguments("disable-infobars");

        //This returns the driver from the projects root location
        WebDriver driver = new ChromeDriver(options);


        //////////////////////////////////////////////////////////////////////////////////////////////////
        // Open eWM login page
        driver.get(myURL+myLOGIN);

        //////////////////////////////////////////////////////////////////////////////////////////////////
        // Maximize browser
       // driver.manage().window().maximize();

        //////////////////////////////////////////////////////////////////////////////////////////////////
        //input username
        WebElement myElement = driver.findElement(By.name("j_username"));
        myElement.sendKeys("prime");


        //////////////////////////////////////////////////////////////////////////////////////////////////
        //input password
        WebElement myPass = driver.findElement(By.name("j_password"));
        myPass.sendKeys("awesome");


        //////////////////////////////////////////////////////////////////////////////////////////////////
        //click on the submit button to login
        driver.findElement(By.name("btn_login")).click();

        // Open eWM login page
        driver.get(myURL+myHOME);

        ////////////////////////////////////////////////////////////////////////////////////////////////
        //warehouse global dropdown selection - This works 9109 but not 9082
        //driver.findElement(By.xpath("//div[@id='globalWarehouseSelect_chosen']/a/span")).click();//9109



        //Chrome options setup
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-infobars");


        //This returns the driver from the projects root location
//        WebDriver driver = new ChromeDriver(options);

        // click on "searchText" once the page is reloaded
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        By searchText = By.id("searchText");
//        wait.until(ExpectedConditions.presenceOfElementLocated(searchText)).click();


        //input search name in phenix search
        WebElement searchEWM = driver.findElement(By.id("searchText"));
        searchEWM.sendKeys("customer management");


        // click on "customer management label to load customer page
        driver.findElement(By.xpath("//*[@id=\"globalMenuNavigation\"]/li[3]/ul/li[2]/a/img")).click();



        //Click on create button - customer mgmt
        driver.findElement(By.xpath("//button[@id='createNewBtn']")).click();



        //Click on account type dropdown - focus
        driver.findElement(By.xpath("//div[@id='type_chosen']/a/span")).click();
        //Click on account type dropdown - Click on the Label
        driver.findElement(By.xpath("//div[@id='type_chosen']/div/ul/li[2]")).click();


        //input corporateName
        WebElement corporateName = driver.findElement(By.id("corporateName"));
        corporateName.sendKeys("Test Customer Auto 1");


        //input customerName
        WebElement customerName = driver.findElement(By.id("txt_ConsigneeName"));
        customerName.sendKeys("Test Customer Auto 1");


        //input addressLineOne
        WebElement addressLineOne = driver.findElement(By.id("addressLine1"));
        addressLineOne.sendKeys("1 INFINITE LOOP");


        //input addressLineOne
        WebElement cityName = driver.findElement(By.id("city"));
        cityName.sendKeys("CUPERTINO");


        //Click on State dropdown - focus
        driver.findElement(By.xpath("//*[@id=\"stateList_chosen\"]/a/span")).click();
        //Click on State dropdown - Click on the Label
        driver.findElement(By.xpath("//*[@id=\"stateList_chosen\"]/div/ul/li[7]")).click();


        //input addressLineOne
        WebElement zipCode = driver.findElement(By.id("zip"));
        zipCode.sendKeys("95014");


        //click on the next button
        driver.findElement(By.name("btn_next")).click();



        // click on "searchText" once the page is reloaded
//            WebDriverWait wait = new WebDriverWait(driver, 20);
//            By uspsID = By.id("addverify_enter");
//            wait.until(ExpectedConditions.presenceOfElementLocated(uspsID));



        // click on "searchText" once the page is reloaded
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        By searchText = By.id("addverify_USPS");
//        wait.until(ExpectedConditions.presenceOfElementLocated(searchText));//.click();



        //click on the address entered button
//        driver.findElement(By.id("addverify_enter")).click();





    }




}


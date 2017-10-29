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
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.concurrent.TimeUnit;
public class ewmLogin {


    public static void main (String[] args) {

        String myURL = ("http://10.1.100.197:9109");
        String myLOGIN =("/ewm/login.html");
        String myHOME =("/ewm/home.htm");


//This returns the driver from the projects root location
         WebDriver driver = new ChromeDriver();


        //////////////////////////////////////////////////////////////////////////////////////////////////
        // Open eWM login page
        driver.get(myURL+myLOGIN);

        //////////////////////////////////////////////////////////////////////////////////////////////////
        // Maximize browser
        driver.manage().window().maximize();

        //////////////////////////////////////////////////////////////////////////////////////////////////
        //input username
        WebElement myElement = driver.findElement(By.name("j_username"));
        myElement.sendKeys("fwrmoral");


        //////////////////////////////////////////////////////////////////////////////////////////////////
        //input password
        WebElement myPass = driver.findElement(By.name("j_password"));
        myPass.sendKeys("Password123");


        //////////////////////////////////////////////////////////////////////////////////////////////////
        //click on the submit button to login
        driver.findElement(By.name("btn_login")).click();


        ////////////////////////////////////////////////////////////////////////////////////////////////
        //warehouse global dropdown selection
        driver.findElement(By.xpath("//div[@id='globalWarehouseSelect_chosen']/a/span")).click();
        driver.findElement(By.xpath("//div[@id='globalWarehouseSelect_chosen']/div/ul/li[7]")).click();

        driver.get(myURL+myHOME);

        //input search name in phenix search
        WebElement ewmModuleSearch = driver.findElement(By.xpath("//input[@id='searchText']"));
        ewmModuleSearch.sendKeys("customer management");


        //////////////////////////////

        driver.findElement(By.xpath("//ul[@id='globalMenuNavigation']/li[10]/ul/li[3]/a")).click();


        //////////////////////////////

        driver.findElement(By.xpath("//button[@id='createNewBtn']")).click();

        ////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////



        //with wait_for_page_load(browser):
        //  browser.find_element_by_link_text(myURL+myLOGIN).click();

////////////////////////////////////////////////////////////////////////////////////////////////
//Wait for page to load
//	webDriverWait(driver, pageLoadTimeout).until(
        //          webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));


        // click on "Add Item" once the page is reloaded
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchText"))).click();

        //Hover and click on the ewm home icon
        //driver.findElement(By.name("//img[@id='logo']")).click();

        //driver.findElement(By.xpath("//img[@id='logo']")).click();
        //driver.findElement(By.name("//ul[@id='globalMenuNavigation']/li[10]/ul/li[3]/a")).click();


        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//div[@id='sel_Module_chosen']/a/span")).click();
        //driver.findElement(By.xpath("//div[@id='sel_Module_chosen']/div/ul/li[3]")).click();
        //driver.findElement(By.xpath("//ul[@id='subModule']/li[3]/div[1]/a/img")).click();

        //driver.navigate().to("http://10.1.100.205:9083/ewm/receipt/receiptsMaintenance");
        //driver.navigate().to("http://10.1.100.205:9083/ewm/receipt/receiptsMaintenance").refresh();
        //driver.navigate().to("http://10.1.100.205:9083/ewm/receipt/receiptsMaintenance");

        //driver.navigate().to("http://10.1.100.205:9083/ewm/receipt/receiptsMaintenance");

        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.findElement(By.id("createNewBtn")).click();


        //driver.navigate().to("http://10.1.100.205:9083/ewm/customer/searchRecords/?showAdvSearchPannel=true");



        ////////////////////////////////////////////////////////////////////////////////////////////////
        //Create New process on the customer landing page
//	driver.findElement(By.name("//button[@id='createNewBtn']")).click();


    }




}


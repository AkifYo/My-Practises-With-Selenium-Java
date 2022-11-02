import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class A01_AmazonSearch {
    public static void main(String[] args) {
       //System.setProperty("Webdriver.chromedriver", "C:\\Users\\Lenovo X270\\Documents\\Selenium Dependencies\\Drivers\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo X270\\Documents\\Selenium Dependencies\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement searxBox= driver.findElement(By.id("twotabsearchtextbox"));
        searxBox.sendKeys("Nutella");
        searxBox.sendKeys(Keys.ENTER);
        String result= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")).getText();
        System.out.println("Total number of product: "+result);
        driver.quit();
        }
    }


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A02FacebookLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo X270\\Documents\\Selenium Dependencies\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com");

        //WebElement cookiesBtn= driver.findElement(By.xpath("//*[@id=\"u_0_e_2g\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.manage().deleteCookie();
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
        //w.until(ExpectedConditions.presenceOfElementLocated( By.id("u_0_e_WM")));

        WebElement cookieButton = driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']"));

        cookieButton.click();


        WebElement emailBox= driver.findElement(By.id("email"));
        emailBox.sendKeys("mrdnbfk@yandex.com");
        WebElement passwordBox= driver.findElement(By.id("pass"));
        passwordBox.sendKeys("Ay123456");
        WebElement logBtn= driver.findElement(By.xpath("//button[@name='login']"));
        logBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement uyariText= driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
        if (uyariText.isDisplayed()){
            System.out.println("the warning is displayed");
        }else{
            System.out.println("the warning is not displayed");
        }
        System.out.println(uyariText.getText());
        driver.close();
        driver.quit();
    }
}

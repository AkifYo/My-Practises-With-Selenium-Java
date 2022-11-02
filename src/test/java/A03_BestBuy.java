import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class A03_BestBuy {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo X270\\Documents\\Selenium Dependencies\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.bestbuy.com");
        List<WebElement> btnList=driver.findElements(By.tagName("button"));
        System.out.println(btnList.size());
        for (WebElement each:btnList
             ) {
            System.out.println(each.getText());

        }
        driver.quit();

    }
}

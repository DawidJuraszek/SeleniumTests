import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class SeleniumTest {

    @Test
    public void openGooglePage() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumdemo.com/");
        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        WebElement seleniumProduct = driver.findElement(By.xpath("//h2[text()='Java Selenium Webdriver']"));
        Assert.assertTrue(seleniumProduct.isDisplayed());
        driver.quit();






    }
}

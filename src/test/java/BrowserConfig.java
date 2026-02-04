import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserConfig {


    @Test
    public void browserConfig() {
        ChromeOptions options   = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("==window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

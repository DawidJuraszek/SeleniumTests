import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class UploadTest {

    @Test
    public void uploadFile() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File before = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(before,new File("src/test/resources/beforeUpload.png"));
        driver.findElement(By.id("myFile")).sendKeys("/Users/dawidjuraszek/Desktop/conduit .xml");
        File after = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(after,new File("src/test/resources/afterUpload.png"));


    }


}

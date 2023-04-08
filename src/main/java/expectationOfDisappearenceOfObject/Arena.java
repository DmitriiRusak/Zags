package expectationOfDisappearenceOfObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;

public class Arena {
    public static void main(String[] args) {
        //ok and here is some more fantastic comments from master branch
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\CHROME_DRIVER\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://cars.av.by/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='button button--link']")).click();
        js.executeScript("window.scrollBy(0,600)");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement avtozzyrnal=driver.findElement(By.xpath("//a[@href='https://av.by/news']"));
        avtozzyrnal.click();
        js.executeScript("window.scrollBy(0,600)");
        WebElement cerber = driver.findElement(By.xpath("//h2[@class='journal-item__title']"));
        cerber.click();


        WebElement moc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img" +
                "[@src='https://avcdn.av.by/journalarticlemainphoto/0001/8985/9152.jpg']")));
        Actions action= new Actions(driver);
        action.contextClick(moc).build().perform();//правый клик на элемент




    }
}

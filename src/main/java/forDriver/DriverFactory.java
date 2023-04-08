package forDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private ChromeDriver driver;
    private ChromeOptions options = new ChromeOptions();

    public DriverFactory() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\CHROME_DRIVER\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://user:senlatest@regoffice.senla.eu/");//здесь+имя пользователя и пароль
        driver.manage().window().maximize();

    }

    public ChromeDriver getChromeDriver(){
        return driver;
    }
}
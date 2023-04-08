package TipesOfRegistration;

import FillingOutTheForm.Applicant_data;
import FillingOutTheForm.Citizen_data;
import forDriver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DethRegistration {
    private final ChromeDriver driver = new DriverFactory().getChromeDriver();
    private final Applicant_data fierstPage = new Applicant_data();
    private final Citizen_data therdPage = new Citizen_data();
    private WebElement elementOfAnketa;

    public void createDethRequest() {
        fierstPage.getFiestPageToBeDone(driver);

        driver.findElement(By.xpath("//button[contains(text(),'Далее')]")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Регистрация смерти')]")).click();

        therdPage.getTherdPageToBeDone(driver);

        driver.findElement(By.xpath("//button[contains(text(),'Далее')]")).click();

        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-13']"));
        elementOfAnketa.sendKeys("01");
        elementOfAnketa.sendKeys("07");
        elementOfAnketa.sendKeys("2023");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-14']"));
        elementOfAnketa.sendKeys("Moscow");
        driver.findElement(By.xpath("//button[contains(text(),'Завершить')]")).click();
        driver.close();

    }
}
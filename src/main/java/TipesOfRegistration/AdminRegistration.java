package TipesOfRegistration;

import FillingOutTheForm.Applicant_data;
import FillingOutTheForm.Citizen_data;
import forDriver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminRegistration {
    private final ChromeDriver driver = new DriverFactory().getChromeDriver();
    private WebElement elementOfAnketa;

    public void createAdminRegistration() {
        driver.findElement(By.xpath("//button[text()='Войти как администратор']")).click();
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-1']"));
        elementOfAnketa.sendKeys("LastName");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-2']"));
        elementOfAnketa.sendKeys("Name");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-3']"));
        elementOfAnketa.sendKeys("middleName");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-4']"));
        elementOfAnketa.sendKeys("1534234");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-5']"));
        elementOfAnketa.sendKeys("N534vsd4176");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-6']"));
        elementOfAnketa.sendKeys("23");
        elementOfAnketa.sendKeys("04");
        elementOfAnketa.sendKeys("2022");
        driver.findElement(By.xpath("//button[text()='Далее']")).click();
        driver.findElement(By.xpath("//button[text()='Закрыть']")).click();
        driver.close();



    }

}

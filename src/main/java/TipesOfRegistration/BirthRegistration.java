package TipesOfRegistration;

import FillingOutTheForm.Applicant_data;
import FillingOutTheForm.Citizen_data;
import forDriver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BirthRegistration {
    private final ChromeDriver driver=new DriverFactory().getChromeDriver();
    private final Applicant_data fierstPage=new Applicant_data();
    private final Citizen_data therdPage=new Citizen_data();
    private WebElement elementOfAnketa;

    public void createBirthRequest() {
        fierstPage.getFiestPageToBeDone(driver);

        driver.findElement(By.xpath("//button[contains(text(),'Далее')]")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Регистрация рождения')]")).click();

        therdPage.getTherdPageToBeDone(driver);

        driver.findElement(By.xpath("//button[contains(text(),'Далее')]")).click();

        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-13']"));
        elementOfAnketa.sendKeys("Place of birth");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-14']"));
        elementOfAnketa.sendKeys("Mather");
        elementOfAnketa= driver.findElement(By.xpath("//input[@id='TextInputField-15']"));
        elementOfAnketa.sendKeys("Father");
        driver.findElement(By.xpath("//button[contains(text(),'Завершить')]")).click();
        driver.close();
    }
}

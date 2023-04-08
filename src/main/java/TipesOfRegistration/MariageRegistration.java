package TipesOfRegistration;

import FillingOutTheForm.Applicant_data;
import FillingOutTheForm.Citizen_data;
import forDriver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MariageRegistration {

    private final ChromeDriver driver=new DriverFactory().getChromeDriver();
    private final Applicant_data fierstPage=new Applicant_data();
    private final Citizen_data therdPage=new Citizen_data();
    private WebElement elementOfAnketa;


    public void createMariageRequest() {

        fierstPage.getFiestPageToBeDone(driver);

        driver.findElement(By.xpath("//button[contains(text(),'Далее')]")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Регистрация брака')]")).click();

        therdPage.getTherdPageToBeDone(driver);

        driver.findElement(By.xpath("//button[contains(text(),'Далее')]")).click();

        //data services
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-13']"));
        elementOfAnketa.sendKeys("01");
        elementOfAnketa.sendKeys("12");
        elementOfAnketa.sendKeys("2001");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-14']"));
        elementOfAnketa.sendKeys("New last name");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-15']"));
        elementOfAnketa.sendKeys("Last name husband");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-16']"));
        elementOfAnketa.sendKeys("some name");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-17']"));
        elementOfAnketa.sendKeys("some middle name");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-18']"));
        elementOfAnketa.sendKeys("01");
        elementOfAnketa.sendKeys("12");
        elementOfAnketa.sendKeys("2001");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-19']"));
        elementOfAnketa.sendKeys("54ghd");
        driver.findElement(By.xpath("//button[contains(text(),'Завершить')]")).click();
        //driver.findElement(By.xpath("//button[@style='margin-right: 15px;']")).click();//close when its done
        driver.close();
    }
}

package FillingOutTheForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citizen_data {

    public void getTherdPageToBeDone(ChromeDriver driver) {
        WebElement elementOfAnketa;
        elementOfAnketa = driver.findElement(By.xpath("//input[@id='TextInputField-7']"));
        elementOfAnketa.sendKeys("Some lastname");
        elementOfAnketa = driver.findElement(By.xpath("//input[@id='TextInputField-8']"));
        elementOfAnketa.sendKeys("firstname");
        elementOfAnketa = driver.findElement(By.xpath("//input[@id='TextInputField-9']"));
        elementOfAnketa.sendKeys("middle name");
        elementOfAnketa = driver.findElement(By.xpath("//input[@type='date']"));
        elementOfAnketa.sendKeys("01");
        elementOfAnketa.sendKeys("10");
        elementOfAnketa.sendKeys("2000");
        elementOfAnketa = driver.findElement(By.xpath("//input[@id='TextInputField-11']"));
        elementOfAnketa.sendKeys("43dfds");
        elementOfAnketa = driver.findElement(By.xpath("//input[@id='TextInputField-12']"));
        elementOfAnketa.sendKeys("Man");
    }
}

package FillingOutTheForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applicant_data {

    public void getFiestPageToBeDone(ChromeDriver driver){


        WebElement enterAsUserButton=driver.findElement(By.xpath("//button[@style='margin-bottom: 20px; width: 213px; font-family: \"Times New Roman\"; font-size: 16px; height: 38px;']"));
        enterAsUserButton.click();

        WebElement elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-1']"));
        elementOfAnketa.sendKeys("VERSION FROM IDEA");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-2']"));
        elementOfAnketa.sendKeys("Some namee");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-3']"));
        elementOfAnketa.sendKeys("Some middle name");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-4']"));
        elementOfAnketa.sendKeys("423465345");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-5']"));
        elementOfAnketa.sendKeys("tgfs32423e");
        elementOfAnketa=driver.findElement(By.xpath("//input[@id='TextInputField-6']"));
        elementOfAnketa.sendKeys("privet MMMedVed*******************");



    }
}

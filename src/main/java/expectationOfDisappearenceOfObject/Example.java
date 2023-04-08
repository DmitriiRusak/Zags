package expectationOfDisappearenceOfObject;
//Primer primeneniia ozzidaniia ischeznoveniia elementa + rabota s list.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\CHROME_DRIVER\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        try {                       //<-tak-kak thread dolzzen bit v bloke try/catch
            Thread.sleep(0);
            driver.get("https://pagination.js.org/");
            List <WebElement> elements=driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
            List <WebElement> pages=driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));
            System.out.println("Проверяем,что мы записали элементы на первой странице (c 1-го по 10-ый) в list и" +
                            "ожидаем вывод на экран текста 6 элемента: "+ elements.get(5).getText());//proveriaem tekst, ozzidaem '6'

            pages.get(2).click();
            wait.until(ExpectedConditions.stalenessOf(elements.get(5)));//zzdem poka etot element propodet
            elements=driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
            System.out.println("Проверяем наличия элементов с (10 по 20), ожидаем вывод на экран " +
                            "текст 16-го элемент: "+elements.get(5).getText());//proveriaem tekst, ozzidaem '16'

            WebElement element=driver.findElement(By.xpath("//a[@class='build-button-zipped']"));
//            System.out.println(element.getAttribute("href"));

            System.out.println(wait.until(ExpectedConditions.attributeContains(By.xpath("//script[@type='text/template']"),"id","te")));
            System.out.println("++++++"+wait.until(ExpectedConditions.elementToBeClickable(element)));
            //System.out.println(wait.until(ExpectedConditions.attributeToBe(element,"id","template-demo2")));

            //System.out.println(wait.until(ExpectedConditions.attributeToBe(By.xpath("//a[@class='build-button-zipped']"),"href","https://pagination.js.org/dist/2.6.0/pagination.min.js")));


        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Ошибка в try");
        }






    }
}

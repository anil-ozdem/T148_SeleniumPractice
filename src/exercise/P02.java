package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "kurulum/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // "https://www.trendyol.com/" sayfasina gidin
        driver.get("https://www.trendyol.com/");
        driver.findElement(By.xpath("(//*[@*='homepage-popup-img'])[2]"))
                .click();

        // arama kutusuna pijama takimi yazin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@data-testid='suggestion']"));
        aramaKutusu.sendKeys("pijama takimi"+ Keys.ENTER);

        // karsimiza cikan ilk urunu bulup acin
        driver.findElement(By.xpath("(//div[@class='product-card-grid-layout'])[1]"))
                .click();

        // acilan urunun fiyatini alip konsola yazdirin
        driver.findElement(By.xpath("(//div[@class='product-card-grid-layout'])[1]"))
                .click();
        WebElement urunFiyati = driver.findElement(By.xpath("(//span[@class='prc-dsc'])[1]"));
        System.out.println(urunFiyati.getText());

        // urunu sepete atin
        driver.findElement(By.xpath("(//div[@class='add-to-basket-button-text'])[1]"))
                .click();

        Thread.sleep(5000);
        driver.quit();


    }
}

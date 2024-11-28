package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // 1-Driver oluşturalim
        System.setProperty("Webdriver.chrome.driver", "kurulum/chromedriver.exe");

        // 2-Java class'imiza chromedriver.exe i tanitalim
        WebDriver driver = new ChromeDriver();

        // 3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();

        // 4-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklemesini
        //    söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 5-"https://www.testotomasyonu.com" adresine gidelim
        driver.get("https://www.testotomasyonu.com");

        // 6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String expectedTitle = "Test";
        String actualTitle = driver.getTitle();

        String expectedUrl = "testotomasyonu";
        String actualUrl = driver.getCurrentUrl();

        // 7-Title'ın Test ve url inin testotomasyonu kelimesini içerip icermedigini kontrol edelim
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Url testi PASSED");
        } else System.out.println("Url testi FAILED");

        // 8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.get("https://wisequarter.com/");

        // 9-Bu adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String expectedWiseTitle = "Quarter";
        String actualWiseTitle = driver.getTitle();

        if (actualWiseTitle.contains(expectedWiseTitle)) {
            System.out.println("Wise title testi PASSED");
        } else System.out.println("Wise title testi FAILED");

        // 10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();

        // 11-Sayfayı yenileyelim
        driver.navigate().refresh();
        // 12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.get("https://wisequarter.com/");

        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
        Thread.sleep(3000);
        driver.quit();


    }
}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_DriverMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulum/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Thread.sleep(2500);
        driver.manage().window().minimize();

        driver.quit();
    }
}

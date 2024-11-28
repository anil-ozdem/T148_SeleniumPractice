package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03_DriverMethods {

    //....Exercise-1:...
    public static void main(String[] args) throws InterruptedException {

        // Create a new class with main method
        // Set Path
        System.setProperty("Webdriver.chrome.driver", "kurulum/chromedriver.exe");

        // Create a chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open google home page https://www.google.com
        driver.get("https://www.google.com");

        // On the same class, navigate to wisequarter home page https://www.wisequarter.com and navigate back to google
        driver.navigate().to("https://www.wisequarter.com");

        driver.navigate().back();

        // Wait about 4 sn
        Thread.sleep(4000);

        // Navigate forward to wisequarter
        driver.navigate().forward();

        // Refresh page
        driver.navigate().refresh();
        Thread.sleep(3000);

        // Close/quit the browser
        driver.quit();
        // And Last step print "All is well" on console
        System.out.println("All is well");


    }

}

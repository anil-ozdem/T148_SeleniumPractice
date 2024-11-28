package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","kurulum/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest"))
                .click();

        // Type any number in the first input
        WebElement firstInput = driver.findElement(By.id("number1"));
        firstInput.sendKeys("1905");

        // Type any number in the second input
        WebElement secondInput = driver.findElement(By.id("number2"));
        secondInput.sendKeys("2024");

        // Click on Calculate
        driver.findElement(By.id("calculate"))
                .click();
        // Get the result
        String result = driver.findElement(By.id("answer")).getText();
        // Print the result
        System.out.println(result);

        driver.quit();
    }
}

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.By;

public class Stocks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/Jacob/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.finance.yahoo.com/most-active");

        driver.quit();

    }
}

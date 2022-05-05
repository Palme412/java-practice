import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleInput {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "/Users/Jacob/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement name = driver.findElement(By.cssSelector("input"));

        name.click();
        name.sendKeys("Rainbows");
        name.sendKeys(Keys.RETURN);

        driver.quit();
    }
}

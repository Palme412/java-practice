import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

// login works... find some function for after that

public class Facebook {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "/Users/Jacob/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.name("email"));
        email.click();
        // email.sendKeys("");

        WebElement pass = driver.findElement(By.name("pass"));
        pass.click();
        // pass.sendKeys("");

        driver.findElement(By.name("login")).click();

        WebElement search = driver.findElement(By.className(""));
        search.click();
        // search.sendKeys("");
        search.sendKeys(Keys.RETURN);

        driver.findElement(By.className("")).click();

        WebElement message = driver.findElement(By.className(""));
        message.click();
        message.sendKeys("");
        message.sendKeys(Keys.RETURN);

    }
}
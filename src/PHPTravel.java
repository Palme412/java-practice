import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;

public class PHPTravel {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Jacob/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.phptravels.net/login");

        WebElement email = driver.findElement(By.name("email"));
        email.click();
        email.sendKeys("agent@phptravels.com");

        WebElement password = driver.findElement(By.name("password"));
        password.click();
        password.sendKeys("demoagent");

        driver.findElement(By.className("ladda-label")).click();

        driver.findElement(By.className("user_wallet")).click();

        driver.findElement(By.id("gateway_bank-transfer")).click();

        // WebElement price = driver.findElement(By.className("form-control
        // form-control-lg"));
        // price.sendKeys("5000");

        // driver.findElement(By.className("btn btn-primary btn-block btn-lg my-3
        // waves-effect")).click();

        driver.quit();
    }
}

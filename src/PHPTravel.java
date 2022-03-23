import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
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

        WebElement price = driver.findElement(By.name("price"));
        price.click();
        price.sendKeys("5000");

        driver.findElement(
                By.xpath("/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button"))
                .click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.className("btn-front")).click();

        driver.findElement(By.className("yes")).click();

        driver.quit();
    }
}

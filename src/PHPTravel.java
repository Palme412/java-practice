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

        driver.quit();
    }
}

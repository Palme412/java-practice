import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Shopping {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Jacob/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.automationpractice.com/index.php");

        WebElement search = driver.findElement(By.className("search_query form-control ac_input"));
        search.click();
        search.sendKeys("shirt");

        driver.quit();
    }
}

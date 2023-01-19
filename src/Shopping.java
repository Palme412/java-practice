import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Shopping {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Jacob/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/");

        WebElement firstItem = driver.findElement(By.id("ControlID-7"));
        firstItem.click();

        WebElement cart = driver.findElement(By.id("ControlID-5"));
        cart.click();

        WebElement viewCart = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[1]"));
        viewCart.click();

        driver.quit();
    }
}

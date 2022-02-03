import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ASUS/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete= driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("A-513");
        Thread.sleep(1000);
        WebElement streetnum= driver.findElement(By.id("street_number"));
        streetnum.sendKeys("Avas Vikas");
        Thread.sleep(1000);

        driver.quit();
    }
}

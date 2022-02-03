import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.*;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ASUS/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown= driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();
        sleep(1000);

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.click();
        sleep(1000);
        driver.quit();
    }
}

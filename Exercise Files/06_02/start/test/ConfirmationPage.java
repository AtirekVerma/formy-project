import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {

    public static void waitForAlert(WebDriver driver)
    {
        WebDriverWait wait= new WebDriverWait(driver, 10);
        WebElement alert= wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }
}

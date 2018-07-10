import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public class Autocomplete {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akadam\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        WebDriverWait wait = new WebDriverWait(driver,10);


        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(className("pac-item")));
        autocompleteResult.click();

        driver.quit();
    }
}

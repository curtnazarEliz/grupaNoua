import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        openBrowser();

    }

    public static void openBrowser() {
        ChromeDriver driver = BrowserManager.getChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("abc@d.com");

        WebElement formElement = driver.findElement(By.className("text-field-container"));
//      formElement.getText();
        WebElement usernameInput = driver.findElement(By.cssSelector("#userName-wrapper #userName"));
        usernameInput.sendKeys("selenium");

        WebElement currentAdressInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/textarea"));
        currentAdressInput.sendKeys("hello selenium");
        System.out.println(currentAdressInput.getAttribute("value"));
        //get.text() folosim cand nu sunt inputuri daca sunt inputuri facem cu getAttribute("value")


        driver.quit();
    }
}
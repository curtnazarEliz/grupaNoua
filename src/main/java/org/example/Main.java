package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        openBrowser();
    }

    public static void openBrowser() {
        ChromeDriver driver =new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }
}

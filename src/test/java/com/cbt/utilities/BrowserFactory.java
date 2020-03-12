package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("safari")) {
            return null;
        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        }else{
            WebDriverManager.operadriver().setup();
                return new OperaDriver();
        }
    }
}

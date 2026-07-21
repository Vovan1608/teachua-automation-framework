package com.zevovan.driver;

import com.zevovan.framework.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver createDriver() {
        Browser browser = Browser.valueOf(ConfigReader.getProperty("browser").toUpperCase());

        return switch (browser) {
            case CHROME -> new ChromeDriver();
            case FIREFOX -> new FirefoxDriver();
            case EDGE -> new EdgeDriver();
            default -> throw new RuntimeException("Unknown browser: " + browser);
        };
    }
}

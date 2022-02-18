package org.example.untitled;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {

    //Driver to use by Selenium
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/sxntx/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.es/");
    }
    public static void main(String[] args) {
        MainPage obj = new MainPage();
        obj.launchBrowser();
    }

}
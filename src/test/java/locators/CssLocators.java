package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CssLocators {
    WebDriver wd;
    @Test
    public void textBox() {
        wd = new ChromeDriver();
        wd.navigate().to("https://demoqa.com/text-box");

        WebElement fullName = wd.findElement(By.cssSelector("input"));
        //System.out.printf("-->" + fullName.getAttribute("placeholder"));
        fullName.click();
        fullName.clear();

        WebElement elEmail = wd.findElement(By.cssSelector("input[type='email']")); //find by tag + attribute
        //System.out.printf("-->" + elEmail.getAttribute("placeholder"));

        WebElement elAddress = wd.findElement(By.cssSelector("#currentAddress")); //find by id
        //System.out.printf("-->" + elAddress.getTagName);
        wd.close();

        }
    @Test
    public void checkButtons() {
        wd = new ChromeDriver();
        wd.navigate().to("https://demoqa.com/buttons");

        WebElement button1 = wd.findElement(By.cssSelector("#doubleClickBtn"));
        WebElement button2 = wd.findElement(By.cssSelector("#rightClickBtn"));
        WebElement button3 = wd.findElement(By.cssSelector("#MPfhZ"));

    }
    @AfterClass
    public void close() {
        wd.quit();
    }
}

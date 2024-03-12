package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface AppManager {

    WebDriver wd = new ChromeDriver();

    default  void init() {
        wd.navigate().to("https://demoqa.com/");
        wd.manage().window().maximize();
    }

    default void stop() {
        wd.quit();
    }
}

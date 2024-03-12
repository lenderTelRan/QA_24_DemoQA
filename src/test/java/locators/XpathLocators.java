package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class XpathLocators {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.navigate().to("https://demoqa.com/");
    }

    @Test
    public void xPathLocators() {
        WebElement btnElements = wd.findElement(By.xpath("//div[@class='avatar mx-auto white']"));
        btnElements.click();

        WebElement btnCheckBox = wd.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[@id='item-1']"));
        btnCheckBox.click();

        WebElement btnToggle = wd.findElement(By.xpath("//*[@aria-label='Toggle']"));
        btnToggle.click();

        WebElement btnExpandAll = wd.findElement(By.xpath("//button[@aria-label='Expand all']"));
        btnExpandAll.click();

        WebElement checkBoxHome = wd.findElement(By.xpath("//label[@for='tree-node-home']"));
        WebElement checkDesktop = wd.findElement(By.xpath("//span[text()='Desktop']"));
        WebElement checkDocuments = wd.findElement(By.xpath("//span[text()='Documents']"));
        WebElement checkDownloads = wd.findElement(By.xpath("//span[text()='Downloads']"));

        WebElement checkOffice = wd.findElement(By.xpath("//label[@for='tree-node-office']"));
        checkOffice.click();

        WebElement checkExcel = wd.findElement(By.xpath("//label[@for='tree-node-excelFile']"));
//        checkExcel.click();

        WebElement btnCollapseAll = wd.findElement(By.xpath("//button[@title='Collapse all']"));

    }

    @AfterClass
    public void close() {
        wd.close();
    }
}

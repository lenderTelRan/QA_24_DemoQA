package manager;

import org.openqa.selenium.By;

public interface HelperStudent extends HelperBase {
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By eMail = By.cssSelector("input[placeholder='name@example.com']");
    By mobile = By.id("userNumber");
    By dateOfBirth = By.id("dateOfBirthInput");
    By subject = By.id("subjectInput");
    By checkBoxSport = By.id("hobbies-checkbox-1");
    By checkBoxReading = By.id("hobbies-checkbox-2");
    By checkBoxMusic = By.id("hobbies-checkbox-3");
}

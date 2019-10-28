import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginPromise {

    WebDriver webDriver;

    public LoginPromise(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //нормасно залогинились
    public UserPage andUserPageOpen() {
        return new UserPage(webDriver);
    }

    //Ошибочка произошла при логине
    public void andWaitForError(LoginPage loginPage) {
        assertTrue("Че-то не так.", loginPage.isErrorDisplaed());
    }

}

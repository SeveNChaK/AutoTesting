import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest extends TestBase {

    private final String BASE_URL = "https://ok.ru";

    @Override
    public void setup(){
        super.setup();
        driver.get(BASE_URL);
    }

    @Test
    public void loginOkTest(){
        LoginPage loginPage = new LoginPage(driver);
        UserPage userPage = loginPage.login("hello", "qwerty").andUserPageOpen();
    }

    @Test
    public void loginFailedTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("hello", "").andWaitForError();
    }

    private boolean elementIsPresent(By selector){
        return false;
    }
}

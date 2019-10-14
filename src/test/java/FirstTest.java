import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    private final String BASE_URL = "https://ok.ru";

    private WebDriver webDriver;

    @Before
    public void setup(){
        webDriver = new ChromeDriver();
        webDriver.get(BASE_URL);
    }

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("hello", "qwerty");
        loginPage.pressSubmit();
//        new WebDriverWait(webDriver, 10).until(new ExpectedCondition<Boolean>() {
//            @NullableDecl
//            @Override
//            public Boolean apply(@NullableDecl WebDriver input) {
//                return input.getCurrentUrl().equals(BASE_URL);
//            }
//        });

    }

    private boolean elementIsPresent(By selector){
        return false;
    }

    @After
    public void destroy(){
        webDriver.close();
    }
}

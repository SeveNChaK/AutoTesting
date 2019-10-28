import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPromise login(final String login, final String password){
        insertLogin(login);
        insertPassword(password);
        pressSubmit();
        return new LoginPromise(webDriver);
    }

    public void insertLogin(String login){
        WebElement loginField = webDriver.findElement(By.xpath("//div[@class='it_w']/input[@name='st.email']"));
        loginField.sendKeys(login);
    }

    public void insertPassword(String pass){
        WebElement passField = webDriver.findElement(By.xpath("//div[@class='it_w']/input[@name='st.password']"));
        passField.sendKeys(pass);
    }

    public void pressSubmit(){
        WebElement btnLogin = webDriver.findElement(By.xpath("//input[@value='Войти']"));
        btnLogin.submit();
    }

    public boolean isErrorDisplaed() {
        return webDriver.findElement(By.xpath("//div[@class='input-e login_error']")).isDisplayed();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver webDriver;

    private WebElement loginField, passField, btnLogin;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        //TODO проверять правильную/полную загрузку страницы с assert (use WebDriverWait)
        //TODO перекинуть в свои методы
        loginField = webDriver.findElement(By.xpath("//div[@class='it_w']/input[@name='st.email']"));
        passField = webDriver.findElement(By.xpath("//div[@class='it_w']/input[@name='st.password']"));
        btnLogin = webDriver.findElement(By.xpath("//input[@value='Войти']"));
    }

    public void login(final String login, final String password){
        insertLogin(login);
        insertPassword(password);
        pressSubmit();
    }

    public void insertLogin(String login){
        loginField.sendKeys(login);
    }

    public void insertPassword(String pass){
        passField.sendKeys(pass);
    }

    public void pressSubmit(){
        btnLogin.submit();
    }

}

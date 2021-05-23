package test;

import com.thoughtworks.gauge.Step;
import model.loginModel;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static driver.Driver.webDriver;

public class loginTest {
    loginModel model = new loginModel();


    @Step("Enter Button")
    public void enterButton(){
       model.enterButton();
    }
    @Step("Enter Username")
    public void setUserName (){
        model.setUserName();
    }
    @Step("Enter Password")
    public void setPassword (){
        model.setPassword();
    }
    @Step("Enter Login Button")
    public void clickButton (){
        model.clickButton();
    }
    @Step("correct password and user name ?")
    public void loginControl (){

      Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",model.checkTitle());

    }

}

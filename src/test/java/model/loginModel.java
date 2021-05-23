package model;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class loginModel extends Driver {

    public By txtEnterButtonField = By.cssSelector("div>a[data-cy='header-login-button']>span");
    public By txtUserNameField = By.id("L-UserNameField");
    public By txtPasswordField = By.id("L-PasswordField");
    public By txtLoginButtonField = By.id("gg-login-enter");
    public By chkControl = By.className("header-gg-logo robot-header-logoContainer-logo");

    public void enterButton(){

        Actions action = new Actions(webDriver);
        WebElement we = webDriver.findElement(By.cssSelector("div[data-cy='header-user-menu']"));
        action.moveToElement(we).build().perform();

     try {
         Thread.sleep(1000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
      webDriver.findElement(txtEnterButtonField).click();
    }

    public void setUserName() {

      webDriver.findElement(txtUserNameField).sendKeys("onat-kahraman@hotmail.com");
    }

    public void setPassword() {

      webDriver.findElement(txtPasswordField).sendKeys("Onat.2712");
    }

    public void clickButton() {


        webDriver.findElement(txtLoginButtonField).click();
    }

    public String checkTitle(){

        return webDriver.getTitle();
  }
}





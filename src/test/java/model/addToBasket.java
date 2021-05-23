package model;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class addToBasket extends Driver {

    public By btnAddBasket = By.id("add-to-basket");
    public By btnBasket = By.className("icon-sepet-line-wrapper");
    public By cntrlFirstPrice = By.id("sp-price-discountPrice");
    public By cntrlSecondPrice = By.className("extra-discounted");
    public By btnAmount = By.xpath("//select[@class='amount']");
    public By deleteBasket = By.xpath("//a[@title='Sil']");
    public By emptyMessage = By.xpath("//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]/h2");

    public void clickAddBasket (){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", webDriver.findElement(btnAddBasket));
        webDriver.findElement(btnAddBasket).click();
    }
    public void clickBasket (){

        webDriver.findElement(btnBasket).click();
    }
    public String getFirstPrice() {

        return webDriver.findElement(cntrlFirstPrice).getText();
    }
    public String getSencondPrice() {

        return webDriver.findElement(cntrlSecondPrice).getText();
    }
    public void clickAmount (){

        Select select = new Select(webDriver.findElement(btnAmount));
        select.selectByValue("2");
    }
    public void deleteToBasket(){
        webDriver.findElement(deleteBasket).click();

    }
    public String getEmptyMessage(){
        return webDriver.findElement(emptyMessage).getText();

    }

}

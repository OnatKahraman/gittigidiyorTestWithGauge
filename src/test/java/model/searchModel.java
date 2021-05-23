package model;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class searchModel extends Driver {

    public By txtSearch = By.name("k");
    public By clkSearchButton = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");

    public By clkSecondPage = By.xpath("//a[text()='2']");


    public void setSearch(){
        webDriver.findElement(txtSearch).sendKeys("bilgisayar");
        webDriver.findElement(clkSearchButton).click();
    }
    public void setSecondPage(){

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", webDriver.findElement(clkSecondPage));
        webDriver.findElement(clkSecondPage).click();
    }
}

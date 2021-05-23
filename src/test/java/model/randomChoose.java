package model;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;


public class randomChoose extends Driver {


    public By selectProduct = By.cssSelector("ul.catalog-view>li");
    public void setRandomChoose(){
        Random random = new Random();
        List<WebElement> products = webDriver.findElements(selectProduct); //listeye attık
        int index = random.nextInt(products.size());
        products.get(index).click();

    }
}

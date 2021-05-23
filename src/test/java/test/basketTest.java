package test;

import com.thoughtworks.gauge.Step;
import model.addToBasket;
import org.junit.Assert;

public class basketTest {

    addToBasket basket = new addToBasket();

    @Step("add to basket")
    public void clickAddBasket(){
        basket.clickAddBasket();
    }
    @Step("go to basket")
    public void clickBasket(){
        basket.clickBasket();
    }
    @Step("Control Price")
    public void controlPrice(){
        Assert.assertEquals(basket.getFirstPrice(),basket.getSencondPrice());
    }
    @Step("increase to basket")
    public void ıncToBasket(){
        basket.clickAmount();
    }
    @Step("delete all basket")
    public void deleteAllBasket(){
        basket.deleteToBasket();
    }
    @Step("control empty message")
    public void getEmptyMessage(){
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır.",basket.getEmptyMessage());
    }
}

package test;

import com.thoughtworks.gauge.Step;


import model.homePage;
//import org.assertj.core.api.Assert;
import org.junit.Assert;

import static driver.Driver.webDriver;

public class homeTest  {
    homePage page = new homePage();

    @Step("Go to the gittigidiyor")
    public void goToUrl(){
        page.goToUrl();
        Assert.assertEquals("https://www.gittigidiyor.com/",webDriver.getCurrentUrl());
        System.out.println("test basladı");
    }


}

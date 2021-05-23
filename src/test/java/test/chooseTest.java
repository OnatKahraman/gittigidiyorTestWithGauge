package test;

import com.thoughtworks.gauge.Step;
import model.randomChoose;

public class chooseTest {
    randomChoose choose = new randomChoose();

    @Step("random choose")
    public void setRandomChoose(){

        choose.setRandomChoose();
    }
}

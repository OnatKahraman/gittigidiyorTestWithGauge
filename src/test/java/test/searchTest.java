package test;

import com.thoughtworks.gauge.Step;
import model.searchModel;

public class searchTest {
    searchModel search = new searchModel();

    @Step("Search bilgisayar")
    public void setSearch(){
        search.setSearch();
    }
    @Step("second page")
    public void setSecondPage() {
        search.setSecondPage();
    }

}

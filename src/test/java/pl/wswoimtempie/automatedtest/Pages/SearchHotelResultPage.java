package pl.wswoimtempie.automatedtest.Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class SearchHotelResultPage {

    public SearchHotelResultPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.phptravelsnative:id/titlename")
    private List<WebElement> namesOfHotels;

    @FindBy(id = "com.phptravelsnative:id/price")
    private List<WebElement> pricesOfHotels;

    public List<String> getHotelNames() {
        return namesOfHotels.stream().map(el -> el.getText()).collect(Collectors.toList());
    }

    public List<String> getHotelPrices() {
        return pricesOfHotels.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}

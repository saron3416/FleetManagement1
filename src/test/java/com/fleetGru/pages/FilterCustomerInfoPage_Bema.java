package com.fleetGru.pages;

import com.fleetGru.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterCustomerInfoPage_Bema {

    public FilterCustomerInfoPage_Bema() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="(//span[@class='title title-level-1'])[1]")
    public WebElement customerModuleBtn;
    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboardHeader;

    @FindBy
    public WebElement hjgj;
}

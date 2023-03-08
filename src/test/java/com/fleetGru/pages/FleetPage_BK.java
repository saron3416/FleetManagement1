package com.fleetGru.pages;

import com.fleetGru.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetPage_BK extends BasePage{


    public FleetPage_BK(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetOpt;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicleOpt;

    // @FindBy(xpath = "(//td/input[@type='checkbox'])[1]")
    //  public WebElement checkBox;

    @FindBy(xpath = "(//i[@class='caret'])[1]")
    public WebElement checkBox;


}

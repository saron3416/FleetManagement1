package com.fleetGru.utilities;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class BrowserUtils {

      /*
    This method will accept int(in seconds)
    and execute Thread.sleep method for given duration
    Arg: int second
     */

    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }

    }

    public static void switchWindowAndVerify(String expectedUrl, String expectedTitle){

        //Return and store all window handels in a Set.
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: "+ Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedUrl)){
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }
    public static void verifyTitleContains(String expectedInTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    /*
   This method accepts WebElement target,
   and waits for that WebElement not to be displayed on the page
    */
    public static void waitForInvisibilityOf(WebElement target){
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    /*
    This method accepts String title,
    and waits for that Title to contain given String value.
     */
    public static void waitForTitleContains(String title){
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.titleContains(title));
    }

    /**
     * This method accepts a dropdown element and returns a List<String> that contains all options value as a String
     * @param dropDownElement
     * @return actualMonth_as_STRING
     */

    public static List<String> dropdownOptions_as_String(WebElement dropDownElement){

        Select month = new Select(dropDownElement);
        //Storing all the ACTUAL options into a List of WebElements

        List<WebElement> actualMonth_as_WEBELEMENT = month.getOptions();

        //Creating an EMPTY list of String to store ACTUAL <option> as String
        List<String> actualMonth_as_STRING = new ArrayList<>();

        //Looping through the List<WebElement>, getting all options' text and storing them into List<String>
        for (WebElement each : actualMonth_as_WEBELEMENT) {

            actualMonth_as_STRING.add(each.getText());

        }

        return actualMonth_as_STRING;

    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {
        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                each.click();
            }

        }
    }


    /**
     * This method will accept a String as expected value and verify actual URL CONTAINS the value.
     * @param expectedInURL
     */
    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    /**
     * Switches to new window by the exact title. Returns to original window if target title not found
     * @param targetTitle
     */
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    /**
     * Moves the mouse to given element
     *
     * @param element on which to hover
     */
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }


}
package com.nopcommerce.pf.sw5.pages;
import com.aventstack.extentreports.Status;
import com.nopcommerce.pf.sw5.customlisterners.CustomListeners;
import com.nopcommerce.pf.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='block block-category-navigation']/descendant::a[2]")
    WebElement desktops;

    public void clickOnDesktop() {
        Reporter.log("Select HDD: " + desktops.toString() + "<br>");
        clickOnElement(desktops);
        CustomListeners.test.log(Status.PASS, "Click on Desktop ");
    }


}
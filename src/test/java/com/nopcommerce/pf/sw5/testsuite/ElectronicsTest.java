package com.nopcommerce.pf.sw5.testsuite;

import com.nopcommerce.pf.sw5.customlisterners.CustomListeners;
import com.nopcommerce.pf.sw5.pages.*;
import com.nopcommerce.pf.sw5.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {

    HomePage homePage;
    CellPhonesPage cellPhonesPage;
    NokiaLumiaPage nokiaLumiaPage;
    ShoppingCartPage shoppingCartPage;
    SignInPage signInPage;
    RegisterPage registerPage;
    CheckOutPage checkoutPage;


    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void inIt() {
        homePage = new HomePage();
        cellPhonesPage = new CellPhonesPage();
        nokiaLumiaPage = new NokiaLumiaPage();
        shoppingCartPage = new ShoppingCartPage();
        signInPage = new SignInPage();
        registerPage = new RegisterPage();
        checkoutPage = new CheckOutPage();
    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToCellPhonePageSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverAndClickOnCellPhones();
        cellPhonesPage.verifyTextCellPhone("Cell phones");
        cellPhonesPage.clickOnListTab();
        Thread.sleep(1000);
        cellPhonesPage.clickOnNokiaLumia1020();
        nokiaLumiaPage.verifyTextNokiaLumia1020("Nokia Lumia 1020");
        nokiaLumiaPage.verifyThePrice("$349.00");
        nokiaLumiaPage.changeQuantity("2");
        nokiaLumiaPage.clickOnCartBtn();
        // 2.10 Verify the Message "The product has been added to your shopping cart" on Top green bar
        nokiaLumiaPage.verifyShoppingCartMessage("The product has been added to your shopping cart");
        // Click On Green button click
        nokiaLumiaPage.clickOnGreenBtn();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        // Click on Go to Cart
        nokiaLumiaPage.clickOnGoToCart();
        // 2.12 Verify the message "Shopping cart"
        shoppingCartPage.verifyShoppingCartTitle("Shopping cart");
        // 2.13 Verify the quantity is 2
        shoppingCartPage.verifyTheQuantity();
        // 2.14 Verify the Total $698.00
        shoppingCartPage.verifyTotal("$698.00");
        // 2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsOfServiceCheckbox();
        // 2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutBtn();
        // 2.17 Verify the Text “Welcome, Please Sign In!”
        signInPage.verifyWelcomeText("Welcome, Please Sign In!");
        // 2.18 Click on “REGISTER” tab
        signInPage.clickOnRegisterBtn();
        // 2.19 Verify the text “Register”
        registerPage.verifyTextRegister("Register");
        // Input First Name
        registerPage.inputFirstNameField("Henry");
        // Input Last Name
        registerPage.lastNameField("smith");
        // Input Email
        registerPage.emailField(getRandomEmail());
        // Input Password
        registerPage.passwordField("password123");
        // Input Confirm Password
        registerPage.confirmPasswordField("password123");
        // 2.21 Click on “REGISTER” Button
        registerPage.clickOnRegister();
        // 2.22 Verify the message “Your registration completed”
        registerPage.verifyRegisterTextMessage("Your registration completed");
        // 2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueBtn();
        // 2.24 Verify the text “Shopping card”
        //shoppingCartPage.verifyShoppingCartTitle("Shopping cart");
        // 2.25 click on checkbox “I agree with the terms of service”
        //shoppingCartPage.clickOnTermsOfServiceCheckbox();
        // 2.26 Click on “CHECKOUT”
        //shoppingCartPage.clickOnCheckOutBtn();
        // 2.27 Fill the Mandatory fields
        // Select Country
        //checkoutPage.selectCountry("India");
        // Input City
        //checkoutPage.inputCity("London");
        // Input Address
        //checkoutPage.inputAddress("123 London Road");
        // Input Zip code
        //checkoutPage.inputZipCode("SW1 1AA");
        // Input Telephone
        //checkoutPage.inputTelephoneNumber("0192929292");
        // 2.28 Click on “CONTINUE”
        //checkoutPage.clickOnContinue();
        // 2.29 Click on Radio Button “2nd Day Air ($0.00)”
        //checkoutPage.clickOnRadioBtn2ndDayAir();
        // 2.30 Click on “CONTINUE”
        //checkoutPage.clickOnContinueOnShipping();
        // 2.31 Select Radio Button “Credit Card”
        //checkoutPage.selectCreditCard("Visa");
        // 2.32 Select “Visa” From Select credit card dropdown
        //checkoutPage.clickOnPaymentContinue();
        // 2.33 Fill all the details
        // Enter cardholder name
        //checkoutPage.inputCardHolderName("Rishi Patel");
        // Enter Card number
        //checkoutPage.inputCardNumber("4700 1234 5678 7840");
        // Select expire month
        //checkoutPage.selectExpireMonth("11");
        // select Year
        //checkoutPage.selectExpireYear("2025");
        // Input Card code
        //checkoutPage.inputCardCode("123");
        //  2.34 Click on “CONTINUE”
        //checkoutPage.clickOnContinuCardPayment();
        // 2.35 Verify “Payment Method” is “Credit Card”
        //checkoutPage.verifyPaymentMethod("Credit Card");
        // 2.36 Verify “Shipping Method” is “2nd Day Air”
        //checkoutPage.verifyShippingMethod("Next Day Air");
        // 2.37 Verify Total is “$698.00”
        //checkoutPage.verifyNokiaCartTotal("$698.00");
        // 2.38 Click on “CONFIRM”
        //checkoutPage.clickOnConfirm();
        // 2.39 Verify the Text “Thank You”
        //checkoutPage.verifyThankYou("Thank you");
        // 2.40 Verify the message “Your order has been successfully processed!”
        //checkoutPage.verifyOrderConfirmation("Your order has been successfully processed!");
        // 2.41 Click on “CONTINUE”
        //checkoutPage.clickOnContinue();
        // 2.42 Verify the text “Welcome to our store”
        //homePage.verifyTheTextWelcomeToOurStore("Welcome to our store");
        // 2.43 Click on “Logout” link
        //homePage.clickOnLogoutLink();
        // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
        //homePage.getURL();
    }
}

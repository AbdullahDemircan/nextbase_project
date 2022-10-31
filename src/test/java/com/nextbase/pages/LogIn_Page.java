package com.nextbase.pages;

import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {
    public LogIn_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement logInBtn;

    public void loginAs (String loginType){
       String username = null;
       String password = null;

        switch(loginType){
            case "Helpdesk":
                username = ConfigurationReader.getProperty("helpdesk_username");
                password = ConfigurationReader.getProperty("helpdesk_password");
                break;
            case "Human Resource":
                username = ConfigurationReader.getProperty("hr_username");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "Marketing":
                username = ConfigurationReader.getProperty("marketing_username");
                password = ConfigurationReader.getProperty("marketing_password");
                break;
            default:
                System.out.println("invalid entry");

        }
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        logInBtn.click();

    }
}

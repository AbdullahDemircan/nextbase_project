package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Dashboard_Page {
    public User_Dashboard_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@id='user-name']")
    public WebElement accountBoard;

    @FindBy (xpath = "(//span[.='More']/span)[1]")
    public WebElement more;

    @FindBy (xpath = "(//span[.='Appreciation']/span)[2]")
    public WebElement appreciation;

    @FindBy (xpath = "(//span[@title='Upload files'])[1]")
    public WebElement upLoadFilesIcon;

    @FindBy (xpath = "//input[@class='diskuf-fileUploader wd-test-file-light-inp ']")
    public WebElement upLoadFilesBox;

    @FindBy (xpath = "(//span[@class='f-wrap'])[1]")
    public WebElement firstLoadFile;

    @FindBy (xpath = "(//span[@class='f-wrap'])[2]")
    public WebElement secondLoadFile;

    @FindBy (xpath = "(//span[@class='f-wrap'])[3]")
    public WebElement thirdLoadFile;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy (xpath = "( //img[contains(@id, 'disk-attach-image')])[1]")
    public WebElement uploadedImage;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[2]")
    public WebElement secondInsertInTextButton;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[1]")
    public WebElement firstInTextButton;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[2]")
    public WebElement secondInTextButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement allowCheckBox;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeButton;

    @FindBy(xpath = "//span[@class='files-name-edit-btn']/../..")
    public WebElement filesNameEditButton;

    @FindBy(xpath = "//input[@class='files-name-edit-inp']")
    public WebElement editFileNameBox;

}

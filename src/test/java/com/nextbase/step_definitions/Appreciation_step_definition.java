package com.nextbase.step_definitions;

import com.nextbase.pages.LogIn_Page;
import com.nextbase.pages.User_Dashboard_Page;
import com.nextbase.utilities.BrowserUtilities;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class Appreciation_step_definition {
   LogIn_Page logIn_page = new LogIn_Page();
   User_Dashboard_Page user_dashboard_page = new User_Dashboard_Page();


   @After
   public void shutDown(){
   Driver.closeDriver();
   }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
   @When("user logs in as a {string}")
    public void userUserLogsInAsA(String userType) {
       logIn_page.loginAs(userType);
       BrowserUtilities.waitFor(5);
       Assert.assertTrue(user_dashboard_page.accountBoard.isDisplayed());

    }

    @And("user clicks on the -More-, -Appreciation- and the -Upload files- icon in order")
    public void userClicksOnTheMoreAppreciationAndTheUploadFilesIconInOrder() {
       user_dashboard_page.more.click();
        BrowserUtilities.waitFor(2);
       user_dashboard_page.appreciation.click();
        BrowserUtilities.waitFor(2);
       user_dashboard_page.upLoadFilesIcon.click();
        BrowserUtilities.waitFor(2);
    }

    @And("user clicks to the -Upload files and images- box and upload multiple files")
    public void userClicksToTheUploadFilesAndImagesBoxAndUploadMultipleFiles() {
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\HTML CLASS\\cybertruck.jfif");
        BrowserUtilities.waitFor(1);
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\Task_5.pdf");
        BrowserUtilities.waitFor(1);
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\https.docx");
        BrowserUtilities.waitFor(1);
    }

    @Then("user should see the multiple files that uploaded")
    public void userShouldSeeTheMultipleFilesThatUploaded() {
        Assert.assertTrue(user_dashboard_page.firstLoadFile.isDisplayed());
        BrowserUtilities.waitFor(1);
        Assert.assertTrue(user_dashboard_page.secondLoadFile.isDisplayed());
        BrowserUtilities.waitFor(1);
        Assert.assertTrue(user_dashboard_page.thirdLoadFile.isDisplayed());
        BrowserUtilities.waitFor(1);
    }

    @And("user clicks to the -Upload files and images- box and upload different files")
    public void userClicksToTheUploadFilesAndImagesBoxAndUploadDifferentFiles() {
       user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\String_Class.pdf");
       BrowserUtilities.waitFor(2);
       user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\Github_1_Slides_.pptx");
       BrowserUtilities.waitFor(2);
       user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\Nytt textdokument.txt");
       BrowserUtilities.waitFor(2);
    }

    @Then("user should see the different files that uploaded")
    public void userShouldSeeTheDifferentFilesThatUploaded() {
        Assert.assertTrue(user_dashboard_page.firstLoadFile.isDisplayed());
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(user_dashboard_page.secondLoadFile.isDisplayed());
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(user_dashboard_page.thirdLoadFile.isDisplayed());
        BrowserUtilities.waitFor(2);
    }

    @And("user clicks to the -Upload files and images- box and upload pictures")
    public void userClicksToTheUploadFilesAndImagesBoxAndUploadPictures() {
       user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\00_PROJECT\\unknown.png");
       BrowserUtilities.waitFor(2);
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\HTML CLASS\\sunny-day.jpg");
        BrowserUtilities.waitFor(2);
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\HTML CLASS\\SDET.jpg");
        BrowserUtilities.waitFor(2);
    }

    @Then("user should see the pictures that uploaded")
    public void userShouldSeeThePicturesThatUploaded() {
        Assert.assertTrue(user_dashboard_page.firstLoadFile.isDisplayed());
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(user_dashboard_page.secondLoadFile.isDisplayed());
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(user_dashboard_page.thirdLoadFile.isDisplayed());
        BrowserUtilities.waitFor(2);
    }

    @And("user clicks to the -Upload files and images- box and upload a picture")
    public void userClicksToTheUploadFilesAndImagesBoxAndUploadAPicture() {
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\HTML CLASS\\SDET.jpg");
        BrowserUtilities.waitFor(2);
    }

    @And("user clicks to the send button")
    public void userClicksToTheSendButton() {
       user_dashboard_page.sendButton.click();
        BrowserUtilities.waitFor(3);
    }

    @Then("user should see the picture itself in Activity Stream")
    public void userShouldSeeThePictureItselfInActivityStream() {
    Assert.assertTrue(user_dashboard_page.uploadedImage.isDisplayed());
    }

    @And("user clicks to the -Upload files and images- box and upload a picture and a file")
    public void userClicksToTheUploadFilesAndImagesBoxAndUploadAPictureAndAFile() {
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\HTML CLASS\\SDET.jpg");
        BrowserUtilities.waitFor(2); 
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\String_Class.pdf");
        BrowserUtilities.waitFor(2);
    }

    @And("user clicks to the -Insert in text- button")
    public void userClicksToTheInsertInTextButton() {
       user_dashboard_page.insertInTextButton.click();
        BrowserUtilities.waitFor(2);
        user_dashboard_page.secondInTextButton.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("user should see the picture and file are in the text")
    public void userShouldSeeThePictureAndFileAreInTheText() {
       Assert.assertTrue(user_dashboard_page.firstInTextButton.isDisplayed());
       BrowserUtilities.waitFor(2);
       Assert.assertTrue(user_dashboard_page.secondInTextButton.isDisplayed());
       BrowserUtilities.waitFor(2);
    }

    @And("user clicks to the -Upload files and images- box and upload a file")
    public void userClicksToTheUploadFilesAndImagesBoxAndUploadAFile() {
        user_dashboard_page.upLoadFilesBox.sendKeys("C:\\Users\\abdullah\\OneDrive\\Desktop\\cydeo\\HTML CLASS\\SDET.jpg");
        BrowserUtilities.waitFor(2);
    }

    @Then("user should check the -allow a recipient to edit documents- check box")
    public void userShouldCheckTheAllowARecipientToEditDocumentsCheckBox() {
       Assert.assertTrue(user_dashboard_page.allowCheckBox.isEnabled());
       BrowserUtilities.waitFor(2);
    }

    @And("user clicks to the remove button")
    public void userClicksToTheRemoveButton() {
        user_dashboard_page.removeButton.click();
        BrowserUtilities.waitFor(2);
    }


    @And("user clicks to the edit button")
    public void userClicksToTheEditButton() {
       //BrowserUtilities.hover(user_dashboard_page.filesNameEditButton);
       user_dashboard_page.filesNameEditButton.click();
       BrowserUtilities.waitFor(1);
    }

    @Then("user should see the renamed file as a loaded file")
    public void userShouldSeeTheRenamedFileAsALoadedFile() {
        user_dashboard_page.editFileNameBox.sendKeys(Keys.CONTROL,"a");
        user_dashboard_page.editFileNameBox.sendKeys(Keys.DELETE);
        BrowserUtilities.waitFor(1);
        user_dashboard_page.editFileNameBox.sendKeys("Edit" + Keys.ENTER);
        BrowserUtilities.waitFor(1);
    }
}

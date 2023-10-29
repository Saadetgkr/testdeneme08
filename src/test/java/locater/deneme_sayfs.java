package locater;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deneme_sayfs {
    @FindBy(xpath = "(//*[@type='button'])[1]") public WebElement menuButtonSG;
    @FindBy (xpath = "(//*[text ()='Student Management'])[2]") public WebElement studentManagementSG;
    @FindBy (xpath = "//*[@id='advisorTeacherId']") public WebElement contactTeacherSG;
    @FindBy(xpath = "//input[@placeholder='Name']") public WebElement namePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Surname']") public WebElement SurnamePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Birth Place']") public WebElement BirthPlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Email Address']") public WebElement EmailPlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Phone Number']") public WebElement PhonePlaceHolderSG;
    @FindBy (xpath = "//input[@value='FEMALE']") public WebElement FemaleRadioButtonSG;
    @FindBy (xpath = "//input[@value='MALE']") public WebElement maleRadioButtonSG;
    @FindBy (id = "birthDay") public WebElement DateOfBirthSG;
    @FindBy(xpath = "//input[@placeholder='ssn']") public WebElement ssnPlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='username']") public WebElement usernamePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Father Name']") public WebElement fathernamePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Mother Name']") public WebElement mothernamePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Password']") public WebElement passwordPlaceHolderSG;
    @FindBy (xpath = "(//*[text ()='Submit'])") public WebElement SubmitbuttonSG;
    @FindBy (xpath = "(//a[@class='page-link'])[4]") public WebElement lastPageButtonSG;
    @FindBy (xpath = "//*[@class='table-group-divider']") public WebElement studentliSTSG;
    @FindBy (xpath = "(//*[text()='Required'])[1]") public WebElement nameRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[2]") public WebElement SurnameRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[3]") public WebElement BirthPlaceRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[4]") public WebElement EmailRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[5]") public WebElement phoneRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[6]") public WebElement dateofbirthRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[7]") public WebElement ssnRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[8]") public WebElement usernameRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[9]") public WebElement fathernameRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[10]") public WebElement motnameRequiredSG;
    @FindBy (xpath = "//*[text()='Enter your password']") public WebElement passwordRequiredSG;
    @FindBy (xpath = "//*[text ()='Contact Get All']") public WebElement contactgetallButtonSG;
    @FindBy (xpath = "//*[text()='Name']") public   WebElement getAllNameSG;
    @FindBy (xpath = "//*[text()='Email']") public   WebElement getAllEmailSG;
    @FindBy (xpath = "//*[text()='Date']") public   WebElement getAllDateSG;
    @FindBy (xpath = "//*[text()='Subject']") public   WebElement getAllSubjectSG;
    @FindBy (xpath = "//*[text()='Message']") public   WebElement getAllMessageSG;




}

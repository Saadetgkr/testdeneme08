package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us_15_StudentOlusturma {


    HomePage homePage = new HomePage();
 Faker faker = new Faker();

    @Given("Web sayfaasına git")
    public void webSayfaasınaGit() {
        Driver.getDriver().get(ConfigReader.getProperty("pageUrl"));
        ReusableMethods.bekle(5);

    }

   @When("login butonuna tıkla")
    public void loginButonunaTıkla() {
        homePage.girisloginButtonSG.click();

    }



    @And("Vice dean hesabıyla login ol")
    public void viceDeanHesabıylaLoginOl() {
        //homePage.usernamePlaceHolderSG.clear();
        homePage.usernamePlaceHolderSG.click();
        ReusableMethods.bekle(2);
        homePage.usernamePlaceHolderSG.sendKeys(ConfigReader.getProperty("ViceDeanUsernameSG"));
        //homePage.passwordPlaceHolderSG.clear();
        homePage.passwordPlaceHolderSG.click();
        homePage.passwordPlaceHolderSG.sendKeys(ConfigReader.getProperty("ViceDeanUsername"));
        homePage.loginEkraniLoginButtonSG.click();
    }

    @And("Menu butonuna tıkla")
    public void menuButonunaTıkla() {
     ReusableMethods.bekle(3);
     homePage.menuButtonSG.click();

    }

    @And("Açılan pencerede student management yazısına tıkla")
    public void açılanPenceredeStudentManagementYazısınaTıkla() {
     homePage.studentManagementSG.click();
    }

    @And("Choose Teacher yazısına tıkla")
    public void chooseTeacherYazısınaTıkla() {
     homePage.contactTeacherSG.click();

    }

    @And("Çıkan seçeneklerden teacher seç")
    public void çıkanSeçeneklerdenTeacherSeç() {
     Select select = new Select(homePage.contactTeacherSG);
     select.selectByIndex(Integer.parseInt(faker.numerify("##")));
    }

    @And("name alanına geçerli veri gir")
    public void nameAlanınaGeçerliVeriGir() {
    }

    @And("surname alanına geçerli veri gir")
    public void surnameAlanınaGeçerliVeriGir() {
    }

    @And("Birth Place alanına geçerli bir veri gir")
    public void birthPlaceAlanınaGeçerliBirVeriGir() {
    }

    @And("Geçerli bir email adresi gir")
    public void geçerliBirEmailAdresiGir() {
    }

    @And("geçerli bir phone number gir")
    public void geçerliBirPhoneNumberGir() {
    }

    @And("gender seç")
    public void genderSeç() {
    }

    @And("Date of Birth alanına tıkla  tarih seç")
    public void dateOfBirthAlanınaTıklaTarihSeç() {
    }

    @And("SSN number gir")
    public void ssnNumberGir() {
    }

    @And("Geçerli bir user name gir")
    public void geçerliBirUserNameGir() {
    }

    @And("father name alanına geçerli bir veri gir")
    public void fatherNameAlanınaGeçerliBirVeriGir() {
    }

    @And("mother name alanına geçerli bir veri gir")
    public void motherNameAlanınaGeçerliBirVeriGir() {
    }

    @And("geçerli bir password gir")
    public void geçerliBirPasswordGir() {
    }

    @And("submit butonuna tıkla")
    public void submitButonunaTıkla() {
    }

    @And("Student saved successfully mesajını doğrula")
    public void studentSavedSuccessfullyMesajınıDoğrula() {
    }

    @And("Student Listte son sayfaya git")
    public void studentListteSonSayfayaGit() {
    }

    @Then("Oluşturulan Studentin Student Number'inin otomatik geldiğini doğrula")
    public void oluşturulanStudentinStudentNumberIninOtomatikGeldiğiniDoğrula() {
    }
}

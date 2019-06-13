import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumTest {

    private WebDriver webDriver;

    @Before
    public void setup(){
        // TODO inicializar WebDriver
    }

    @Test
    public void testMustFillOutTheTestFormWithYourData(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        webDriver = new ChromeDriver(options);
        webDriver.navigate().to("http://toolsqa.com/automation-practice-form/");

        WebElement firstname = webDriver.findElement(By.name("firstname"));
        firstname.sendKeys("jp");

        WebElement lastname = webDriver.findElement(By.name("lastname"));
        lastname.sendKeys("oh");

        WebElement gender = webDriver.findElement(By.id("sex-0"));
        gender.click();

        WebElement experience = webDriver.findElement(By.id("exp-1"));
        experience.click();

        WebElement date = webDriver.findElement(By.id("datepicker"));
        date.sendKeys("10/10/2010");

        List<WebElement> professions = webDriver.findElements(By.name("profession"));
        professions.forEach(WebElement::click);

        WebElement pic = webDriver.findElement(By.id("photo"));
        ((RemoteWebElement) pic ).setFileDetector(new LocalFileDetector());
        pic.sendKeys("C:\\Users\\juan.ospina\\Documents\\tallerpruebas\\taller-basico-automatizacion\\ejercicio 1\\src\\test\\resources");

        WebElement linkZip = webDriver.findElement(By.linkText("Selenium Automation Hybrid Framework"));
        linkZip.click();

        WebElement linkExcel = webDriver.findElement(By.linkText("Test File to Download"));
        linkExcel.click();

        List<WebElement> tools = webDriver.findElements(By.name("tool"));
        tools.forEach(WebElement::click);

        WebElement continents = webDriver.findElement(By.id("continents"));
        Select optionContinent = new Select(continents);
        optionContinent.selectByVisibleText("South America");


        WebElement seleniumCommands = webDriver.findElement(By.id("selenium_commands"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", seleniumCommands);

        Select option = new Select(seleniumCommands);
        option.selectByVisibleText("Navigation Commands");

        WebElement button = webDriver.findElement(By.id("submit"));
        button.submit();

        WebElement text1 = webDriver.findElement(By.cssSelector(".bcd"));
        text1.click();

        WebElement text2 = webDriver.findElement(By.id("NextedText"));
        text2.click();

        webDriver.close();
        webDriver.quit();
    }

    @Test
    public void testMustFillOutTheTestFormWithOtherData(){
        // TODO completar el formulario con otros datos
    }

    @After
    public void tearDown(){
        // TODO Cerrar ventana actual del navegador
        // TODO Destruir la instancia del WebDriver
    }
}

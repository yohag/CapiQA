package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageIndex {

    WebDriver driver;
    WebDriverWait wait;

    public pageIndex(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }


    public void click(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    //Menu Principal

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/button") 
    public WebElement btnComenzar;

    @FindBy (xpath = "//*[@id=\"root\"]/div[2]/div[4]/button")
    public WebElement btnNoescanear;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/form/div/div[1]/div/div[1]/input")
    public WebElement textRut;

    @FindBy (xpath = "//*[@id=\"root\"]/div[2]/div[2]/form/div/div[2]/button/span")
    public WebElement btnContinuar;
    
    @FindBy (xpath = "//*[@id=\"root\"]/div[2]/div[2]/form/div/div[2]/div/span[1]")
    public WebElement btnayuda;
    
    @FindBy (xpath = "//*[@id=\"root\"]/div[3]/div[3]/div/button/i")
    public WebElement btnayudaNroDocumento;
    
    @FindBy (xpath = "//*[@id=\"root\"]/div[3]/div[3]/div/button/i")
    public WebElement text_ayuda_telefono;

    @FindBy (xpath = "//*[@id=\"root\"]/div[2]/div[2]/form/div/div[1]/div/div[1]/input")
    public WebElement textPassword;

    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/form/div/div[2]/button")
    public WebElement btnContinuarPass;

    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/button/span")
    public WebElement btnContinuarEleccion;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[3]/div/div/button[4]")
    public WebElement btnfondoC;
    
    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div[3]/div/button/span")
    public WebElement btnContinuarFondo;

    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div[1]/div[2]/div/button]")
    public WebElement btnConoceMas;	

    //@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[2]/div[1]/div[2]/div/button")
    //public WebElement fondoB;
    
    @FindBy (xpath="//*[@id=\"root\"]/div[1]/div[2]/div[3]/button")
    public WebElement btnContinuarFondo2;

    @FindBy (xpath="//*[@id=\"root\"]/div[2]/div[2]/form/div/div[1]/div/div[1]/input")
    public WebElement textTelefono;

    @FindBy (xpath="//*[@id=\"root\"]/div[2]/div[2]/form/div/div[2]/div/div/input")
    public WebElement textEmail;
    
    
    @FindBy (xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div[1]/button")
    public WebElement btnempleadorNO;
    
    @FindBy (xpath="//*[@id=\"root\"]/div[2]/div[2]/div[1]")
    public WebElement btnTengoNuevoTrabajo;
    
    @FindBy (xpath="//*[@id=\"root\"]/div[2]/div[2]/div[2]")
    public WebElement btnsitucionCesante;
    
    @FindBy (xpath="//*[@id=\"root\"]/div[2]/div[2]/div[3]")
    public WebElement btnsitucionIndependiente;

    
    
    @FindBy (xpath="//*[@id=\"root\"]/div[2]/div[3]/div[1]/p/a")
    public WebElement btnComisiones;
    
    @FindBy (xpath="//*[@id=\"root\"]/div[2]/div[3]/div[2]/button/span")
    public WebElement btnFinalizar;

  
}

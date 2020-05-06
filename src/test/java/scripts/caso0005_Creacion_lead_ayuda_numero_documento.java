package scripts;

import Tools.tools;
import Tools.variables;

import pageFactory.pageIndex;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;

public class caso0005_Creacion_lead_ayuda_numero_documento {

    tools tools;
    pageIndex objIndex;
    variables variables;

    List<String> errores = new ArrayList<>();
	String Caso = "caso0000_Flujo_Completo";
	String _directory = "scripts";
	String _class = Caso;
	String _method = "";
	WebDriver driver;

    boolean continuar = true;

    @BeforeTest
    public void ejecutarBrowser() {
        tools = new tools();
        try {
            tools.setUrl("https://ventasdesarrolloafp.com/");
            tools.init();
            driver = tools.getDriver();
            System.out.println("Se ejecuto el ChromeDriver e inicia el proceso de ejecución");
            tools.screenshot("scripts", Caso , _method);
            objIndex = new pageIndex(tools.getDriver());
            Thread.sleep(2000);
        } catch (Exception e) {
            continuar = false;
            tools.skipScript(e);
            tools.stop();

        }
    }

    @Test(priority = 1)
    public void comenzar() {
        if (continuar) {
            try {
                System.out.println("Pasamos al paso 1");
                Thread.sleep(2000);
                tools.screenshot("scripts", Caso , _method);
                objIndex.btnComenzar.click();
                Thread.sleep(1000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();
        }
    }

    @Test(priority = 2)
    public void ingresoManual() {
        if (continuar) {
            try {
                System.out.println("Pasamos al paso 2");
                Thread.sleep(1000);
                tools.screenshot("scripts", Caso , _method);
                objIndex.btnNoescanear.click();
                Thread.sleep(1000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();
        }
    }

   @Test(priority = 3)
    public void ingresarRut() {
	   variables = new variables();
        if (continuar) {
            try {
                Thread.sleep(1000);
                System.out.println("Pasamos al paso 3");
                Thread.sleep(1000);
                tools.screenshot("scripts", Caso , _method);
                objIndex.textRut.sendKeys(variables.rutLead;
                Thread.sleep(1000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();
        }
    }

    @Test(priority = 4)
    public void ContinuarRut() {
        if (continuar) {
            try {
                System.out.println("Pasamos al paso 4");
                objIndex.btnContinuar.click();
                tools.screenshot("scripts", Caso , _method);
                Thread.sleep(2000);
               
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();

        }
    }

   @Test(priority = 5)
    public void ingresarPassword() {
        if (continuar) {
            try {
                Thread.sleep(1000);
                System.out.println("Pasamos al paso 5");
                Thread.sleep(1000);
                objIndex.textPassword.sendKeys(variables.passCliente);
                tools.screenshot("scripts", Caso , _method);
                Thread.sleep(1000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();
            }
        } else {
            tools.skipPreviousMethod();
        }
    }

    @Test(priority = 6)
    public void ContinuarPass() {
        if (continuar) {
            try {
                Thread.sleep(1000);
                System.out.println("Pasamos al paso 6");
                objIndex.btnContinuarPass.click();
                tools.screenshot("scripts", Caso , _method);
                Thread.sleep(2000);
                //tools.stop();
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();

        }
    }

    @Test(priority = 7)
    public void ContinuarEleccion() {
        if (continuar) {
            try {
                Thread.sleep(1000);
                System.out.println("Pasamos al paso 7");
                objIndex.btnContinuarEleccion.click();
                tools.screenshot("scripts", Caso , _method);
                Thread.sleep(1000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();

        }
    }
    
    
/*  @Test(priority = 8)
    public void EleccionFondo() {
        if (continuar) {
            try {
                Thread.sleep(1000);
                System.out.println("Pasamos al paso 7");
                objIndex.btnfondoC.click();
                tools.screenshot("scripts", Caso , _method);
                Thread.sleep(1000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();

        }
    }  
    
*/

    @Test(priority = 9)
    public void fondoRecomendado() {
        if (continuar) {

            try {
                Thread.sleep(1000);
                System.out.println("Pasamos al paso 8");
                try {
                	  for(String winHandle : driver.getWindowHandles()){
                          driver.switchTo().window(winHandle);
                      }
                } catch(Exception e){
                	System.out.println("error:" + e.getMessage());
                }
                objIndex.btnConoceMas.click();
                tools.screenshot("scripts", Caso , _method);
                Thread.sleep(3000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();

        }
    }  

    @Test(priority = 9)
    public void ContinuarFondo() {
        if (continuar) {
            try {
                Thread.sleep(1000);
                System.out.println("Pasamos al paso 7");
                objIndex.btnContinuarFondo.click();
                tools.screenshot("scripts", Caso , _method);
                Thread.sleep(1000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();

        }
    }  
    
    
    @Test(priority = 13)
    public void actualizarTelefono() {
        if (continuar) {
            try {
            	System.out.println("Pasamos al paso 13");
            	objIndex.textTelefono.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.telefono);
            	Thread.sleep(1000);
            	objIndex.textTelefono.sendKeys(Keys.TAB);
            	tools.screenshot("scripts", Caso , _method);
            	Thread.sleep(1000);
                
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();
            }
        } else {
            tools.skipPreviousMethod();
        }
    }
    
    @Test(priority = 14)
    public void actualizarEmail() {
        if (continuar) {
            try {
            	System.out.println("Pasamos al paso 14");
            	objIndex.textEmail.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), variables.email);
            	Thread.sleep(1000);
            	objIndex.textEmail.sendKeys(Keys.TAB);
            	tools.screenshot("scripts", Caso , _method);
            	Thread.sleep(1000);
                
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();
            }
        } else {
            tools.skipPreviousMethod();
        }
    }
    
    
    @Test(priority = 19)
    public void confirmar() {
        if (continuar) {
            try {
                System.out.println("Pasamos al paso 11");
                Thread.sleep(3000);
                objIndex.btnConfirmar.click();
                tools.screenshot("scripts", Caso , _method);
                Thread.sleep(3000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();
        }
    }

    @Test(priority = 20)
    public void comisiones() {
        if (continuar) {
            try {
                System.out.println("Pasamos al paso 12");
                Thread.sleep(1000);
                objIndex.btnComisiones.click();
                Thread.sleep(1000);
                tools.screenshot("scripts", Caso , _method);
            	Thread.sleep(1000);
            } catch (Exception e) {
                continuar = false;
                tools.skipScript(e);
                tools.stop();

            }
        } else {
            tools.skipPreviousMethod();
        }
    }
    
    @AfterTest
	public void cerrarBrowser() {
		try {
			
			System.out.println("Cerrando Caso");
			tools.screenshot("scripts", Caso , "Prueba Finalizada");
			Thread.sleep(3000);
			tools.screenshot("scripts", Caso , _method);
        	Thread.sleep(1000);
			
			tools.stop();
			
		} catch (Exception e) {
			continuar = false;
			tools.skipScript(e);
			System.out.println("El paso " + _method + "no ha podido ser ejecutado satisfactoriamente, se detiene el script");
			tools.stop();
		}
		
	}

}

/*Validación de rut válido ingresado, el cual no se encuentra afiliado al sistema de AFP*/
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
import org.testng.SkipException;

public class caso0001_Validar_rut_No_afiliado_al_sistema_AFP {

    tools tools;
    pageIndex objIndex;
    variables variables;

    List<String> errores = new ArrayList<>();
	String Caso = "caso0000_Flujo_Completo";
	String _directory = "scripts";
	String _class = Caso;
	String _method = "";

    boolean continuar = true;

    @BeforeTest
    public void ejecutarBrowser() {
        tools = new tools();
        try {
            tools.setUrl("https://ventasdesarrolloafp.com/");
            tools.init();
            System.out.println("Se ejecuto el ChromeDriver e inicia el proceso de ejecución");
            tools.screenshot("scripts", Caso , _method);
            objIndex = new pageIndex(tools.getDriver());
            Thread.sleep(1000);
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
                Thread.sleep(1000);
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
                objIndex.textRut.sendKeys(variables.rutNoAfiliado);
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

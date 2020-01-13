package Tools;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class variables {
	
	public String rutcliente = "100300540";
	public String rutNovigente = "25684717-5";
	public String rutNoAfiliado ="23809938-2";
	public String rutAFPuno = "27315974-6";
	public String rutAFPcapital = "7.575.480-9";
	public String passCliente = "123456";
	
	public String telefono = "945529566";
	public String email = "yohag07@gmail.com";
	
	
	public String nombreCliente = "Yohanna";
	public String apellidoPaternoCliente = "Guarecuco";
	public String apellidoMaternocliente = "Sánchez";
	public String telefonoCliente = "912345678";
	public String mailCliente = "qa@test.afp";
	public String tipoTrabajador = "Independiente";
	public String regionCliente = "Región Metropolitana";
	public String comunaCliente = "SANTIAGO";
	public String direccionCliente = "Lord Cochrane 181";
	public String hola = "hi";	
}

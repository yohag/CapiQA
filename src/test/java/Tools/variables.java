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
	
	public String rut_virtual = "8570573-3";
	public String rut_crear_clave = "20833010-1";
	public String rutcliente = "122152731";
	public String rutNovigente = "25684717-5";
	public String rutNoAfiliado ="23809938-2";
	public String rutAFPuno = "27315974-6";
	public String rutCapital = "17002627-6";
	public String rutLead = "259809266";
	public String rutLyn="26104397-1";
	public String passCliente = "traspaso15";
	public String rut = "25684717-5";
	
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

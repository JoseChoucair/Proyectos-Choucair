package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://portal.banistmolabs.com/password/login")
public class LoginWebFrontalPTB extends PageObject {
	
	public static final Target CAMPO_USUARIO = Target.the("Campo para ingresar usuario").located(By.id("inp_user"));
	public static final Target CAMPO_PASSWORD = Target.the("Campo para ingresar password").located(By.id("oldPasswordInput"));
	public static final Target BOTON_CONTINUAR = Target.the("El boton para ingresar al portal").located(By.id("btnLogin"));
	

}

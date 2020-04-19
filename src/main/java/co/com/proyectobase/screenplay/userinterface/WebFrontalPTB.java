package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class WebFrontalPTB extends PageObject {
	
	public static final Target BOTON_VER_RESUMENES = Target.the("El boton para ingresar a opción Visualizar Resumenes").located(By.id("mat-expansion-panel-header-2"));

	

}

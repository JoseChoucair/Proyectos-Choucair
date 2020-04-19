package pa.com.ptb.wfu.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.AccederA;
import co.com.proyectobase.screenplay.tasks.Ingresar;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class PlataformaTransferenciaBancariaStepDefinitions {
	
	@Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor JoseJoaquin = Actor.named("JoseJoaquin");
    
    @Before
    public void configuracionInicial() {
        JoseJoaquin.can(BrowseTheWeb.with(hisBrowser));
    }
 

    @Given("^Yo como analista deseo ingresar a ptb con usuario  y password$")
    public void yoComoAnalistaDeseoIngresarAPtbConUsuarioYPassword()  {
    	JoseJoaquin.wasAbleTo(Abrir.LaPaginaDePTB());
    	JoseJoaquin.wasAbleTo(Ingresar.CredencialesDeAcceso()); 
    }

    @Given("^lograr ingresar a la opcion visualizar resumenes enviados$")
    public void lograrIngresarALaOpcionVisualizarResumenesEnviados()  {
    	JoseJoaquin.wasAbleTo(AccederA.OpcionVisualizarResumenes());
       
    }

    @When("^selecciono la fecha a validar de operaciones enviadas a consultar$")
    public void seleccionoLaFechaAValidarDeOperacionesEnviadasAConsultar() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^valido la informacion mostrada en la tabla de resumenes enviadas$")
    public void validoLaInformacionMostradaEnLaTablaDeResumenesEnviadas() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^lo comparo con el total enviado de operaciones ach del dia consultado$")
    public void loComparoConElTotalEnviadoDeOperacionesAchDelDiaConsultado() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}

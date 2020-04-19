package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.LoginWebFrontalPTB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter; 



public class Ingresar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("Test01").into(LoginWebFrontalPTB.CAMPO_USUARIO));
		actor.attemptsTo(Enter.theValue("Panama12345678").into(LoginWebFrontalPTB.CAMPO_PASSWORD));
		actor.attemptsTo(Click.on(LoginWebFrontalPTB.BOTON_CONTINUAR));
		
	}

	public static Ingresar CredencialesDeAcceso() {
		return Tasks.instrumented(Ingresar.class);
	}

}

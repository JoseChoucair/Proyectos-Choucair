package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.LoginWebFrontalPTB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{
	
	private LoginWebFrontalPTB webFrontalPTB;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(webFrontalPTB));		
	}

	public static Abrir LaPaginaDePTB() {		
		return Tasks.instrumented(Abrir.class);
	}

}

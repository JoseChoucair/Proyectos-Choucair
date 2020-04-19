package co.com.proyectobase.screenplay.tasks;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import co.com.proyectobase.screenplay.userinterface.WebFrontalPTB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AccederA implements Task {

	public static AccederA OpcionVisualizarResumenes() {
		return Tasks.instrumented(AccederA.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(WebFrontalPTB.BOTON_VER_RESUMENES, isVisible()).forNoMoreThan(10).seconds());
		actor.attemptsTo(Click.on(WebFrontalPTB.BOTON_VER_RESUMENES));
		
	}

}

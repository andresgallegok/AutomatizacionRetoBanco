package com.utest.prueba.certificacion.stepdefinitions;

import com.utest.prueba.certificacion.models.Persona;
import com.utest.prueba.certificacion.questions.ElMensajeDe;
import com.utest.prueba.certificacion.tasks.CompletarFormulario;
import com.utest.prueba.certificacion.userinterfaces.PaginaInicioPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class RegistrarUsuarioStepDefinitions {

    @Before
    public void preparacion() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }

    @Dado("^que el usuario esta en la pagina de utest$")
    public void queElUsuarioEstaEnLaPaginaDeUtest() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/welcome?from=signup"),
                Click.on(PaginaInicioPage.BTN_JOIN_TODAY));
    }

    @Cuando("^completa el formulario de registro$")
    public void completaElFormularioDeRegistro(List<Persona> listaPersona) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletarFormulario.deRegistro(listaPersona.get(0)));

    }

    @Entonces("^el visualizara el mensaje (.*)$")
    public void elVisualizaraElMensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElMensajeDe.bienvenida(), Matchers.equalTo(mensaje)));
    }
}

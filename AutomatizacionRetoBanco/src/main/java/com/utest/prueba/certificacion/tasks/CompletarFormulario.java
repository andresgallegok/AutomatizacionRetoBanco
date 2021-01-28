package com.utest.prueba.certificacion.tasks;

import com.utest.prueba.certificacion.models.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.utest.prueba.certificacion.userinterfaces.ConfirmacionRegistroPage.*;
import static com.utest.prueba.certificacion.userinterfaces.CrearContraseñaPage.*;
import static com.utest.prueba.certificacion.userinterfaces.DatosBasicosPage.*;
import static com.utest.prueba.certificacion.userinterfaces.AgregarUbicacionPage.*;
import static com.utest.prueba.certificacion.userinterfaces.RegistrarDispositivoPage.*;

public class CompletarFormulario implements Task {

    Persona persona;

    public CompletarFormulario(Persona persona) {
        this.persona = persona;
    }

    public static CompletarFormulario deRegistro(Persona persona){
        return Tasks.instrumented(CompletarFormulario.class, persona);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(persona.getNombre()).into(CAMPO_NOMBRE),
                Enter.theValue(persona.getApellido()).into(CAMPO_APELLIDO),
                Enter.theValue(persona.getEmail()).into(CAMPO_EMAIL),
                SelectFromOptions.byVisibleText(persona.getMesNacimiento()).from(CAMPO_MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(persona.getDiaNacimiento()).from(CAMPO_DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(persona.getAnioNacimiento()).from(CAMPO_ANIO_NACIMIENTO),
                Enter.theValue(persona.getIdioma()).into(CAMPO_IDIOMA),
                Click.on(BTN_SIGUIENTE_UBICACION),
                Click.on(BTN_SIGUIENTE__DISPOSITIVOS),
                Click.on(CAMPO_SISTEMA_OPERATIVO),
                Enter.theValue(persona.getSistemaOperativo()).into(INGRESAR_SISTEMA_OPERATIVO),
                Click.on(CAMPO_VERSION_SISTEMA_OPERATIVO),
                Enter.theValue(persona.getVersionSO()).into(INGRESAR_VERSION_SISTEMA_OPERATIVO),
                Click.on(CAMPO_IDIOMA_SISTEMA_OPERATIVO),
                Enter.theValue(persona.getIdiomaSO()).into(INGRESAR_IDIOMA_SISTEMA_OPERATIVO),
                Click.on(BTN_ULTIMO_PASO),
                Enter.theValue(persona.getClave()).into(CAMPO_CLAVE),
                Enter.theValue(persona.getClave()).into(CAMPO_CONFIRMAR_CLAVE),
                Click.on(CHECK_TERMINOS_Y_CONDICIONES),
                Click.on(CHECK_POLITICA_DE_PRIVACIDAD),
                Click.on(BTN_COMPLETAR_REGISTRO),
                WaitUntil.the(MENSAJE_BIENVENIDA, WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds()
        );
    }
}

package com.utest.prueba.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.prueba.certificacion.userinterfaces.ConfirmacionRegistroPage.MENSAJE_BIENVENIDA;

public class ElMensajeDe implements Question<String> {

    public static ElMensajeDe bienvenida(){
        return new ElMensajeDe();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_BIENVENIDA).viewedBy(actor).asString();
    }
}

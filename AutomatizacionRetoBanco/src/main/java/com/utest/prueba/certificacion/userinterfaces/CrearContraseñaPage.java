package com.utest.prueba.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearContraseñaPage {

    public static Target CAMPO_CLAVE = Target.the("Campo registro clave").
            located(By.id("password"));

    public static Target CAMPO_CONFIRMAR_CLAVE = Target.the("Campo confirmar clave").
            located(By.id("confirmPassword"));

    public static Target CHECK_TERMINOS_Y_CONDICIONES = Target.the("CheckBox terminos y condiciones").
            located(By.id("termOfUse"));

    public static Target CHECK_POLITICA_DE_PRIVACIDAD = Target.the("CheckBox Politica de privacidad").
            located(By.id("privacySetting"));

    public static Target BTN_COMPLETAR_REGISTRO = Target.the("Boton complete setup").
            located(By.id("laddaBtn"));
}

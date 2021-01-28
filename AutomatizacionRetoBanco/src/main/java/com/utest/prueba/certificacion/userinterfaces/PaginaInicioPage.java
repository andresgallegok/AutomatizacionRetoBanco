package com.utest.prueba.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioPage {

    public static Target BTN_JOIN_TODAY = Target.the("Boton de ingreso al formulario de registro").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}

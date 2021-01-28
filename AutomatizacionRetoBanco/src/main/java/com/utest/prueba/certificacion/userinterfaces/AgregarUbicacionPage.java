package com.utest.prueba.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarUbicacionPage {

    public static Target BTN_SIGUIENTE__DISPOSITIVOS = Target.the("campo codigo postal").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}

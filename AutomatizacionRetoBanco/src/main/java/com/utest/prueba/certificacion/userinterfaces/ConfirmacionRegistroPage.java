package com.utest.prueba.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionRegistroPage {

    public static Target MENSAJE_BIENVENIDA = Target.the("Mensaje de bienvenida finalizacion de registro").
            located(By.xpath("//div[@class='image-box-header']//h1"));
}

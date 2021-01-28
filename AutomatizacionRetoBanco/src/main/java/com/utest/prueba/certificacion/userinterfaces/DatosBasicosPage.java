package com.utest.prueba.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosBasicosPage {
    public static Target CAMPO_NOMBRE = Target.the("Campo nombre").
            located(By.id("firstName"));

    public static Target CAMPO_APELLIDO = Target.the("Campo apellido").
            located(By.id("lastName"));

    public static Target CAMPO_EMAIL = Target.the("Campo email").
            located(By.id("email"));

    public static Target CAMPO_MES_NACIMIENTO = Target.the("Campo mes de nacimiento").
            located(By.id("birthMonth"));

    public static Target CAMPO_DIA_NACIMIENTO = Target.the("Campo dia nacimiento").
            located(By.id("birthDay"));

    public static Target CAMPO_ANIO_NACIMIENTO = Target.the("Campo Anio nacimiento").
            located(By.id("birthYear"));

    public static Target CAMPO_IDIOMA = Target.the("Campo Idioma").
            located(By.xpath("//input[@ng-click]"));

    public static Target BTN_SIGUIENTE_UBICACION = Target.the("Boton next location").
            located(By.xpath("//a[@class='btn btn-blue']"));
}

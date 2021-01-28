package com.utest.prueba.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarDispositivoPage {

    public static Target CAMPO_SISTEMA_OPERATIVO = Target.the("campo sistema operativo").
            located(By.xpath("//div[@class='ui-select-box']//div[@name='osId']"));

    public static Target INGRESAR_SISTEMA_OPERATIVO = Target.the("Ingresar informacion en campo sistema operativo").
            located(By.xpath("//div[@class='ui-select-box']//div[@name='osId']//input"));

    public static Target CAMPO_VERSION_SISTEMA_OPERATIVO = Target.the("campo version sistema operativo").
            located(By.xpath("//div[@class='ui-select-box']//div[@name='osVersionId']"));

    public static Target INGRESAR_VERSION_SISTEMA_OPERATIVO = Target.the("Ingresar informacion en campo Version sistema operativo").
            located(By.xpath("//div[@class='ui-select-box']//div[@name='osVersionId']//input"));

    public static Target CAMPO_IDIOMA_SISTEMA_OPERATIVO = Target.the("campo idioma sistema operativo").
            located(By.xpath("//div[@class='ui-select-box']//div[@name='osLanguageId']"));

    public static Target INGRESAR_IDIOMA_SISTEMA_OPERATIVO = Target.the("Ingresar informacion en campo idioma").
            located(By.xpath("//div[@class='ui-select-box']//div[@name='osLanguageId']//input"));

    public static Target BTN_ULTIMO_PASO = Target.the("Boton Next Last step").
            located(By.xpath("//div[@class='pull-right next-step']"));
}

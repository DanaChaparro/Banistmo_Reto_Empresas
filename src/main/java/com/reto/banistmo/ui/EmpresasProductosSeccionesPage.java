package com.reto.banistmo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpresasProductosSeccionesPage extends PageObject {
    public static final Target SECCION_DOCUMENTOS_LINK = Target.the("sección Documentos").
            located(By.xpath("//*[@id='filialTabs']/li[5]/a"));

}

package com.reto.banistmo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/empresas/")
public class EmpresasHomePage extends PageObject {
    public static final Target BOTON_ENTENDIDO = Target.the("Botón para aceptar las cookies").
            located(By.id("btn-aceptar-cookies"));
}

package com.reto.banistmo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpresasMenuPage extends PageObject {
    public static final Target MENU_PRODUCTOS_SERVICIOS_LINK = Target.the("opción del menú Productos & Servicios").
            located(By.xpath("//*[@id='navbar-collapse-grid']/ul/li[3]/a"));
    public static final Target OPCION_DEPOSITOS_URL = Target.the("opción Depósitos").
            located(By.xpath("//*[@id='navbar-collapse-grid']/ul/li[3]/ul/li/div[1]/ul[1]/li[1]/a"));

}

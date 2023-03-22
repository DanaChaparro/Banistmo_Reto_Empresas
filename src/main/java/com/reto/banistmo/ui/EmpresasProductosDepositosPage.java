package com.reto.banistmo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpresasProductosDepositosPage extends PageObject {
    public static final Target CUENTA_AHORROS_COMERCIAL_BUTTON_CARD = Target.the("card de Cuenta de Ahorro Comercial").
            located(By.xpath("//*[@id='none']/div/div/div[2]/div[2]/div/div[2]/h2/a"));

}

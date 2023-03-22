package com.reto.banistmo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpresasProductosSeccionDocumentosPage extends PageObject {
    public static final Target DESCARGAR_PDF_LINK = Target.the("descargar PDF").
            located(By.xpath("//*[@id='tab5']/table/tbody/tr/td[2]/a/img"));

}

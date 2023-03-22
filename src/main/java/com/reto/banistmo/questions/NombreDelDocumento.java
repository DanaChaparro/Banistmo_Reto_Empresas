package com.reto.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class NombreDelDocumento implements Question<Boolean> {
    String nombreDocumento;

    public NombreDelDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultado = false;
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        String url = driver.getCurrentUrl();
        System.out.println("#####");
        System.out.println(url);
        if (url.contains(nombreDocumento)){
            resultado = true;
        }
        return resultado;
    }

    public static NombreDelDocumento es(String nombreDocumento) {
        return new NombreDelDocumento(nombreDocumento);
    }
}

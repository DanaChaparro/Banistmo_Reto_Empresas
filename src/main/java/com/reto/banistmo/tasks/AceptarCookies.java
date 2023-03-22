package com.reto.banistmo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.banistmo.ui.EmpresasHomePage.BOTON_ENTENDIDO;

public class AceptarCookies {

    public static Performable entendido() {
        return Task.where(actor -> {
            actor.attemptsTo(Click.on(BOTON_ENTENDIDO));
        });
    }

}
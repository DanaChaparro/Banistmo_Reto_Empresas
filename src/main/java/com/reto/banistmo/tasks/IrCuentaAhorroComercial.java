package com.reto.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.reto.banistmo.ui.EmpresasMenuPage.MENU_PRODUCTOS_SERVICIOS_LINK;
import static com.reto.banistmo.ui.EmpresasMenuPage.OPCION_DEPOSITOS_URL;
import static com.reto.banistmo.ui.EmpresasProductosDepositosPage.CUENTA_AHORROS_COMERCIAL_BUTTON_CARD;

public class IrCuentaAhorroComercial implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRODUCTOS_SERVICIOS_LINK),
                Click.on(OPCION_DEPOSITOS_URL),
                Scroll.to(CUENTA_AHORROS_COMERCIAL_BUTTON_CARD).andAlignToTop(),
                Click.on(CUENTA_AHORROS_COMERCIAL_BUTTON_CARD)
        );
    }

    public static IrCuentaAhorroComercial delProductoDepositosEmpresas(){
        return Tasks.instrumented(IrCuentaAhorroComercial.class);
    }
}

package com.reto.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.reto.banistmo.ui.EmpresasProductosSeccionesPage.SECCION_DOCUMENTOS_LINK;

public class IrSeccionDocumentos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SECCION_DOCUMENTOS_LINK),
                Click.on(SECCION_DOCUMENTOS_LINK)
        );
    }

    public static IrSeccionDocumentos delProductoEmpresas(){
        return Tasks.instrumented(IrSeccionDocumentos.class);
    }
}

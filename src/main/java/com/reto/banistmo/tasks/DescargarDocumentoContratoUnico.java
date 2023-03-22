package com.reto.banistmo.tasks;

import com.reto.banistmo.interactions.SwitchWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.banistmo.ui.EmpresasProductosSeccionDocumentosPage.DESCARGAR_PDF_LINK;

public class DescargarDocumentoContratoUnico implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESCARGAR_PDF_LINK),
                SwitchWindows.setWindow()
        );
    }

    public static DescargarDocumentoContratoUnico pdf(){
        return Tasks.instrumented(DescargarDocumentoContratoUnico.class);
    }
}

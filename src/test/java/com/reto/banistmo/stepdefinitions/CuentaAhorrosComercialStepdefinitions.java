package com.reto.banistmo.stepdefinitions;

import com.reto.banistmo.questions.NombreDelDocumento;
import com.reto.banistmo.tasks.AceptarCookies;
import com.reto.banistmo.tasks.DescargarDocumentoContratoUnico;
import com.reto.banistmo.tasks.IrCuentaAhorroComercial;
import com.reto.banistmo.tasks.IrSeccionDocumentos;
import com.reto.banistmo.ui.EmpresasHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CuentaAhorrosComercialStepdefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @ParameterType(".*")
    public Actor actor(String actor) {
        return OnStage.theActorCalled(actor);
    }

    @Dado("que el {actor} quiere acceder al servicio Cuenta de ahorro comercial de Depositos Empresas")
    public void queElActorQuiereAccederAlServicioCuentaDeAhorroComercialDeDepositosEmpresas(Actor actor) {
        actor.wasAbleTo(
                Open.browserOn().the(EmpresasHomePage.class),
                AceptarCookies.entendido(),
                IrCuentaAhorroComercial.delProductoDepositosEmpresas()
        );
    }

    @Cuando("va a la seccion de Documentos")
    public void vaALaSeccionDeDocumentos() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrSeccionDocumentos.delProductoEmpresas());
    }

    @Cuando("^descarga el documento (.*)")
    public void descargaElDocumento(String nombreDocumento) {
        OnStage.theActorInTheSpotlight().attemptsTo(DescargarDocumentoContratoUnico.pdf());
    }

    @Entonces("deberia ver el documento generado")
    public void deberiaVerElDocumentoGenerado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(NombreDelDocumento.es("CONTRATO-UNICO-OCT-2022.pdf")));
    }
}

package es.whxismou.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	// ejecucion de codigo despues de reacion del bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		//System.out.println("Ejecutado tras creacion de bean");
	}

	// ejecucion de codigo despues del apagado bean
	 @PreDestroy
	public void ejecutaAntesdestruccion() {
		//System.out.println("Ejecutado antes destruccion de bean");
	}

	@Autowired @Qualifier("informeFinancieroTrim4") private CreacionInformeFinanciero nuevoInforme;

	public ComercialExperimentado() {

	}

//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	/*
	 * @Autowired public void queMasDaElNombre(CreacionInformeFinanciero
	 * nuevoInforme) { this.nuevoInforme = nuevoInforme; }
	 */

	@Override
	public String getTareas() {
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInformes() {
		// return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}

}

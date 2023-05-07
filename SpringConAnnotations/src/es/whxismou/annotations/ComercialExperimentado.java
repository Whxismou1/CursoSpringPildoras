package es.whxismou.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	private CreacionInformeFinanciero nuevoInforme;

	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

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

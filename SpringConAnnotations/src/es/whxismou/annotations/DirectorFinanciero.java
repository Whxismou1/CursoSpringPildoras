package es.whxismou.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	@Autowired
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	private CreacionInformeFinanciero informeFinanciero;

	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

}

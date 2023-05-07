package es.whxismou.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.whxismou.annotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpledosConfig {
	
	//definir el bean para InformeFinancieroDOCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {//id del bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	
	//definir el be{an para directorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero(){
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	

}

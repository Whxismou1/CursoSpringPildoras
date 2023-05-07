package es.whxismou.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		//leer el xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir un bean
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		
		//usar el bean
		System.out.println(Antonio.getInformes()); 
		System.out.println(Antonio.getTareas()); 
		
		
		
		
		//cerrar el contexto
		contexto.close();
		
	}

}

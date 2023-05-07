package es.whxismou.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// leer el xml
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpledosConfig.class);
		
		
		// pedir un bean
		
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInformes());
		
		DirectorFinanciero empleado1 = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Email del director: " + empleado1.getEmail());
		System.out.println("Nombre empresa: " + empleado1.getNombreEmpresa());
		
//		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
//		Empleados Lucia = contexto.getBean("comercialExperimentado", Empleados.class);
//		
//		//¿Apuntal al mismo objeto en memoria?
//		if(Antonio == Lucia) {
//			System.out.println("Apuntan al mismo lugar de memoria");
//			System.out.println(Antonio + "\n" + Lucia);
//		}else {
//			System.out.println("No apuntan al mismo lugar de memoria");
//			System.out.println(Antonio + "\n" + Lucia);
//		}
		
		contexto.close();

	}

}

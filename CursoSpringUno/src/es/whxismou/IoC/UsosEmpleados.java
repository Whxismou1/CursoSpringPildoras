package es.whxismou.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsosEmpleados {

	public static void main(String[] args) {
		
		//XCreacion obkjetos tipo empleado
		
//		Empleados empleado1 = new SecretarioEmpleado();
//		Empleados empleado2 = new DirectorEmpleado();
//		
//		
//		//Uso objetos creado
//		System.out.println(empleado2.getTareas());
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		/*
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());	
		System.out.println(Maria.getInforme());
		System.out.println("Email: " + Maria.getEmail());
		System.out.println("Nombre empresa: " + Maria.getNombreEmpresa());
		
		*/
		contexto.close();
	}

}

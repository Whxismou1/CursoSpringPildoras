package es.whxismou.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo Creacion informe
	private CreacionInformes informeNuevo;
	
	//Creacion constructor que inyecta dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;	
	}
	private String email;
	private String nombreEmpresa;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director " + informeNuevo.getInforme();
	}
	
	
	
	//metodo init EJecutar tareas antes de que el bean este disponible
	public void metodoInit() {
		
		System.out.println("Dentro del metodo inti. Aqui van las tareas a ejecutar antes de que el bean este listo.");
		
	}
	
	//metodo destroy EJecutar tareas despues de que el bean se haya ejecutado
	
	public void metodoDestroy() {
		System.out.println("Dentro del metodo destroy. Aqui van las tareas a ejecutar despues de que el bean este ejecutado.");
		
	}
	
	
	
	

}

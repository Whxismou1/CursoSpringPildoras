package es.whxismou.IoC;

public class JefeEmpleado implements Empleados {
	
	//Creacion de campo tipo Creacion informe
	private CreacionInformes informeNuevo;
	
	//Creacion constructor que inyecta dependencia
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;	
	}	
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos" + informeNuevo.getInforme();
	}
	
	

}

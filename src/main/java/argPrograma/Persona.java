package argPrograma;

import java.util.List;

public class Persona {
	//atributos
	private Integer id;
	private String nombre;
	private String apellido;
	private String profesion;
	private String acercaDe;
	private List<Domicilio> listDomicilio;
	private List<Estudio> listEducacion;
//	private CtaCte ctacta;
	
	//getters y setters, encapsulamiento
	
	
	public Integer getId() {
		return id;
	}
	public List<Domicilio> getListDomicilio() {
		return listDomicilio;
	}
	public void setListDomicilio(List<Domicilio> listDomicilio) {
		this.listDomicilio = listDomicilio;
	}
	public List<Estudio> getListEducacion() {
		return listEducacion;
	}
	public void setListEducacion(List<Estudio> listEducacion) {
		this.listEducacion = listEducacion;
	}
	public void setId(Integer id) {
		//TODO: comprobar que el obj tenga permisos
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getAcercaDe() {
		return acercaDe;
	}
	public void setAcercaDe(String acercaDe) {
		this.acercaDe = acercaDe;
	}
	
	public Boolean cargarEducacion() {
		//TODO: dar de alta una educación para la persona
		return null;
	}
	
	public void modificarEducacion() {
		// TODO Auto-generated method stub
	}
	
	public void modificarAcercaDe() {
		// TODO Auto-generated method stub
	}
	
	public void cargarProyecto() {
		// TODO Auto-generated method stub

	}
	
	

}

package argPrograma;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//conectar a dla db
		// consultas tabla persona
		// x cada fila creas un objeto persona
		Persona persona1 = new Persona();
		persona1.setId(1);
		persona1.setNombre("Manuel");
		persona1.setApellido("Sadosky");
		
		Estudio est1 = new Estudio();
		est1.setId(1);
		est1.setInstitucion("UTN");
		est1.setTitulo("Ing. siste");
	
		Estudio est2 = new Estudio();
		est2.setId(2);
		est2.setInstitucion("CFP");
		est2.setTitulo("Programación");
		
		List<Estudio> listEst = new ArrayList<Estudio>();
		listEst.add(est1);
		listEst.add(est2);
		
		persona1.setListEducacion(listEst);
		
		Persona pers2 = new Persona();
		pers2.setId(2);
		pers2.setNombre("Rául");
		pers2.setApellido("Carnota");
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getListEducacion().get(0).getInstitucion());
	}

}

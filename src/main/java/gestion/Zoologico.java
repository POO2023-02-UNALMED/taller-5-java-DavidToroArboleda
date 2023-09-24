package gestion;
import java.util.*;


public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList <Zona>();
	
	//constructor general
	public Zoologico() {
	} 
	
	//constructor
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		

	}
	
	//agregar Zonas
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	//catidad Total Animales
	public int cantidadTotalAnimales() {
		int contador = 0;
		for	(int i = 0; i < zonas.size() ; i++) {
			Zona elemento = zonas.get(i);
			contador += elemento.cantidadAnimales();
		}
		
		return contador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	
		

		
		
}
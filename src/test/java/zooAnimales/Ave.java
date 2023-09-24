package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private ArrayList<Ave> listado = new ArrayList <Ave>();
	public int halcones;
	public int aguilas; 
	private String colorPlumas;
	
	//constructor general
	public Ave() {
		super();
	}
	
	//constructor
	public Ave(String nombre, int edad, String habitad , String genero, Zona zona, String colorPlumas) {
		super(nombre, edad, habitad, genero, zona);
		this.colorPlumas = colorPlumas;
		
		
		}
	
	//crear halcon
	public Ave crearHalcon(String nombre, int edad,  String genero, Zona zona) {
		String colorPlumas = "cafe glorioso";
		String habitad = "montanas";
		
		
		new Ave(nombre, edad,habitad, genero, zona, colorPlumas);
		
		halcones++;
		listado.add(this);
		return this;
		
	}
	
	//crearAguila
	public Ave crearAguila(String nombre, int edad,  String genero, Zona zona) {
		String colorPlumas = "blanco y amarillo";
		String habitad = "montanas";
		
		
		new Ave(nombre, edad,habitad, genero, zona, colorPlumas);
		
		aguilas++;
		listado.add(this);
		return this;
		
	}
	
	
	
	//cantidad aves
	public int cantidadAves() {
		return listado.size();
	}
	
	//movimiento 
	public String movimiento() {
		return "volar";
	}
	
	//setters n getters
	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}

	public int getHalcones() {
		return halcones;
	}

	public void setHalcones(int halcones) {
		this.halcones = halcones;
	}

	public int getAguilas() {
		return aguilas;
	}

	public void setAguilas(int aguilas) {
		this.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	

}

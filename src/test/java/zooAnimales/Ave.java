package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList <Ave>();
	public static int halcones;
	public static int aguilas; 
	private String colorPlumas;
	
	//constructor general
	public Ave() {
		super();
	}
	
	//constructor
	public Ave(String nombre, int edad, String habitad , String genero, String colorPlumas) {
		super(nombre, edad, habitad, genero);
		this.colorPlumas = colorPlumas;
		
		
		}
	
	//crear halcon
	public static Ave crearHalcon(String nombre, int edad,  String genero) {
		String colorPlumas = "cafe glorioso";
		String habitad = "montanas";
		
		
		Ave a = new Ave(nombre, edad,habitad, genero, colorPlumas);
		
		halcones++;
		listado.add(a);
		return a;
		
	}
	
	//crearAguila
	public static Ave crearAguila(String nombre, int edad,  String genero) {
		String colorPlumas = "blanco y amarillo";
		String habitad = "montanas";
		
		
		Ave a = new Ave(nombre, edad,habitad, genero, colorPlumas);
		
		aguilas++;
		listado.add(a);
		return a;
		
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

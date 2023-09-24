package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	
	private static ArrayList <Anfibio> listado = new ArrayList <Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	//constructor general
	public Anfibio() {
		super();
	}
	
	//constructor
	public Anfibio(String nombre, int edad, String habitad , String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitad, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		}
	
	//crear rana
	public static Anfibio crearRana(String nombre, int edad,  String genero) {
		String colorPiel = "rojo";
		String habitad = "selva";
		boolean venenoso  = true;
		
		
		Anfibio a = new Anfibio(nombre, edad,habitad, genero, colorPiel, venenoso);
		
		ranas++;
		listado.add(a);
		return a;
		
	}
	
	//crear salamandra
	public static Anfibio crearSalamandra(String nombre, int edad,  String genero) {
		String colorPiel = "negro y amarillo";
		String habitad = "selva";
		boolean venenoso = false;
		
		
		Anfibio a = new Anfibio(nombre, edad,habitad, genero, colorPiel, venenoso);
		salamandras++;
		listado.add(a);
		return a;
		
	}
	
	//cantidad anfibios
	public static int cantidadAnfibios() {
		return ranas+salamandras ;
	}
	
	//movimiento 
	public String movimiento() {
		return "saltar";
	}
	
	//setters n getters

	public ArrayList<Anfibio> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}

	public int getRanas() {
		return ranas;
	}

	public void setRanas(int ranas) {
		this.ranas = ranas;
	}

	public int getSalamandras() {
		return salamandras;
	}

	public void setSalamandras(int salamandras) {
		this.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
	

}

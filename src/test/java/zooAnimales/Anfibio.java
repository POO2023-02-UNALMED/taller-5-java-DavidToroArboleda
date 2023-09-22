package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	
	private ArrayList <Anfibio> listado = new ArrayList <Anfibio>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	//constructor general
	public Anfibio() {
		super();
	}
	
	//constructor
	public Anfibio(String nombre, int edad, String habitad , String genero, Zona zona, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitad, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		}
	
	//crear rana
	public Anfibio crearRana(String nombre, int edad,  String genero, Zona zona) {
		String colorPiel = "rojo";
		String habitad = "selva";
		boolean venenoso  = true;
		
		
		new Anfibio(nombre, edad,habitad, genero, zona, colorPiel, venenoso);
		
		ranas++;
		listado.add(this);
		return this;
		
	}
	
	//crear salamandra
	public Anfibio crearSalamandra(String nombre, int edad,  String genero, Zona zona) {
		String colorPiel = "negro y amarillo";
		String habitad = "selva";
		boolean venenoso = false;
		
		
		new Anfibio(nombre, edad,habitad, genero, zona, colorPiel, venenoso);
		salamandras++;
		listado.add(this);
		return this;
		
	}
	
	//cantidad anfibios
	public int cantidadAnfibios() {
		return listado.size();
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

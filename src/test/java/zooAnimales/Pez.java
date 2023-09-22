package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	
	private ArrayList <Pez> listado = new ArrayList <Pez>();
	public static int salmones;
	public static int bacalaos;
	private static String colorEscamas;
	private int cantidadAletas;
	
	//constructor general
	public Pez() {
		super();
	}
	
	//constructor
	public Pez(String nombre, int edad, String habitad , String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitad, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		}
	
	//crear salmon
	public Pez crearSalmon(String nombre, int edad,  String genero) {
		String colorEscamas = "rojo";
		String habitad = "oceano";
		int cantidadAletas = 6;
		
		
		new Pez(nombre, edad,habitad, genero,  colorEscamas,cantidadAletas);
		
		salmones++;
		listado.add(this);
		return this;
		
	}
	
	//crear bacalao
	public Pez crearBacalao(String nombre, int edad,  String genero ) {
		String colorEscamas = "gris";
		String habitad = "oceano";
		int cantidadAletas = 6;
		
		
		new Pez(nombre, edad,habitad, genero, colorEscamas,cantidadAletas);
		
		bacalaos++;
		listado.add(this);
		return this;
		
	}
	
	//cantidad peces
	public int cantidadPeces() {
		return listado.size();
	}
	
	//movimiento 
	public String movimiento() {
		return "nadar";
	}
	
	//setters n getters

	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}

	public int getSalmones() {
		return salmones;
	}

	public void setSalmones(int salmones) {
		this.salmones = salmones;
	}

	public int getBacalaos() {
		return bacalaos;
	}

	public void setBacalaos(int bacalaos) {
		this.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	

}

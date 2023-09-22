package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	
	private int totalAnimales;
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona ;
	
	//constructor general
	public Animal() {
	} 
	
	//contructor
	public Animal(String nombre,int edad,String habitad,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitad;
		this.genero = genero;
		
		this.totalAnimales ++;
		
	}
	
	
	//movimiento 
	public String movimiento() {
		return "desplazarse";
	}
	
	//total por tipo
	public static String totalPorTipo() {
	
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: "
        + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "Anfibios: " + Anfibio.cantidadAnfibios();
		
	}
	
	
	
	public String toString(){
		
		if (zona == null) {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
		}
		
		else {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero +
					", la zona en la que me ubico es " + this.zona + ", en el " + zona.getZoo() ;
		}
		
		
	}

	
	
	
	//setters n getters 
	public int getTotalAnimales() {
		return totalAnimales;
	}


	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitad(String habitad) {
		this.habitat = habitad;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}


}
	
	
	
	



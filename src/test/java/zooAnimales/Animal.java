package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	
	private int totalAnimales;
	
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona ;
	
	//constructor general
	public Animal() {
	} 
	
	//contructor
	public Animal(String nombre,int edad,String habitad,String genero,Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		this.zona = zona;
		this.totalAnimales ++;
		
	}
	
	
	//movimiento 
	public String movimiento() {
		return "desplazarse";
	}
	
	//total por tipo
	public String totalPorTipo() {
		Mamifero mamifero = new Mamifero();
		Ave ave = new Ave();
		Reptil reptil = new Reptil();
		Pez pez = new Pez();
		Anfibio anfibio = new Anfibio();
		
		String cadena = "Mamiferos: " + mamifero.cantidadMamiferos() + "\n"+
						"Aves: " + ave.cantidadAves() + "\n" +
						"Reptiles:" + reptil.cantidadReptiles() + "\n" +
						"Peces: " + pez.cantidadPeces() + "\n" + 
						"Anfibios: " + anfibio.cantidadAnfibios();
		return cadena;
	}
	
	
	public String toString(){
		
		if (zona == null) {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitad + " y mi genero es " + this.genero;
		}
		
		else {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitad + " y mi genero es " + this.genero +
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


	public String getHabitad() {
		return habitad;
	}


	public void setHabitad(String habitad) {
		this.habitad = habitad;
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

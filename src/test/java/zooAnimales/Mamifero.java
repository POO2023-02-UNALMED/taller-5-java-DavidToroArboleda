package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	
	private ArrayList<Mamifero> listado = new ArrayList <Mamifero>() ;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	//constructor general
	public Mamifero() {
		super();
	}
	
	public Mamifero(String nombre, int edad, String habitad, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitad, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		
		}
	
	
	
	public ArrayList<Mamifero> getListado() {
		return listado;
	}



	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}



	public boolean isPelaje() {
		return pelaje;
	}




	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}




	public int getPatas() {
		return patas;
	}




	public void setPatas(int patas) {
		this.patas = patas;
	}

	
	
	public Mamifero crearCaballo(String nombre, int edad,  String genero ) {
		String habitad = "pradera";
		boolean pelaje = true;
		int patas = 4;
		
		new Mamifero(nombre, edad,habitad, genero, pelaje, patas );
		
		caballos++;
		listado.add(this);
		return this;
		
	}
	
	
	public Mamifero crearLeon(String nombre, int edad,  String genero ) {
		String habitad = "selva";
		boolean pelaje = true;
		int patas = 4;
		
		new Mamifero(nombre, edad,habitad, genero, pelaje, patas );
		
		leones++;
		listado.add(this);
		return this;
		
	}
	
	
	 public int cantidadMamiferos() {
		return listado.size();
	}
	
	
		
}

package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	
	private static ArrayList <Reptil> listado = new ArrayList <Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	//constructor general
	public Reptil() {
		super();
		listado.add(this);
	}
	
	//constructor
	public Reptil(String nombre, int edad, String habitad , String genero,  String colorEscamas, int largoCola) {
		super(nombre, edad, habitad, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		
		
		}
	
	//crear iguana
	public static Reptil crearIguana(String nombre, int edad,  String genero ) {
		String colorEscamas = "verde";
		String habitad = "humedal";
		int largoCola = 3;
		
		
		Reptil a =new Reptil(nombre, edad,habitad, genero,  colorEscamas,largoCola);
		
		iguanas++;
		listado.add(a);
		return a;
		
	}
	
	//crear serpiente
	public static Reptil crearSerpiente(String nombre, int edad,  String genero ) {
		String colorEscamas = "blanco";
		String habitad = "jungla";
		int largoCola = 1;
		
		
		Reptil a =new Reptil(nombre, edad,habitad, genero,  colorEscamas,largoCola);
		
		serpientes++;
		listado.add(a);
		return a;
		
	}
	
	//cantidad reptiles
	public static int cantidadReptiles() {
		return serpientes + iguanas ;
	}
	
	//movimiento 

	public String movimiento() {
		return "reptar";
	}

	
	
	// setters n getters
	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public int getIguanas() {
		return iguanas;
	}

	public void setIguanas(int iguanas) {
		this.iguanas = iguanas;
	}

	public int getSerpientes() {
		return serpientes;
	}

	public void setSerpientes(int serpientes) {
		this.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
	
}
	
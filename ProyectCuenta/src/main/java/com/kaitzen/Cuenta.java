package com.kaitzen;
import java.util.Random;

public class Cuenta 
{
	private String name;
	private Double monto;
	private Integer id;
	
	private static Random RD = new Random();
	private static final int LOWER_ID = 1;
	private static final int HIGHER_ID = 1000;
	
	public Cuenta()	
	{
		this.name = "";
		this.monto = 0.0;
		this.id = getRandomId();
	}
	
	private Integer getRandomId()
	{
		return RD.nextInt(HIGHER_ID - LOWER_ID) + LOWER_ID;		
	}	

	public String getNombre() {
		return name;
	}

	public void setNombre(String nombre) {
		this.name = nombre;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Integer getId() {
		return id;
	}
	
	public Cuenta(String nombre, Double monto)
	{
		this.name = nombre;
		this.monto = monto;
	}
	
	public String toString()
	{
		return "Esta cuenta de " + this.name + " con ID " + this.id + " tiene el monto de $ " + this.monto;
	}
	
	public Cuenta(Cuenta cuenta) //Constructor copia 
	{
		this.name = cuenta.name;
		this.monto = cuenta.monto;
		this.id = getRandomId();
	}
	
	public void ingreso(Double monto)
	{
		this.monto = this.monto + monto;
		System.out.println(this);
	}
	
	public void reintegro(Double monto)
	{
		this.monto = this.monto + monto;
		System.out.println(this);
	}
	
	public void transferencia(Double monto)
	{
		if (this.monto >= monto)
		{
			this.monto -= monto;
			System.out.println(this);
		}
		else 
		{
			error("El monto a transferir es mayor al saldo disponible");
		}		
	}
	
	public void error(String errorMessage) 
	{
		System.out.println(errorMessage);
	}
	
	
}
	

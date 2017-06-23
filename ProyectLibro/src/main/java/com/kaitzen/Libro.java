package com.kaitzen;

public class Libro {
	private String nombre;
	private String autor;
	private String editorial;
	private String alumnoResponsable;
	private Ubicacion ubicacion;
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Libro(String nombre, String autor, String editorial)
	{
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;	
		this.alumnoResponsable = "";
		this.ubicacion = Ubicacion.BIBLIOTECA;
	}
	
	public Libro()
	{
		this.alumnoResponsable = "";
		this.ubicacion = Ubicacion.BIBLIOTECA;
	}
	public void Prestamo(String nombreAlumno)
	{
		this.alumnoResponsable = nombreAlumno;
		this.ubicacion = Ubicacion.ALUMNO;
		
	}
	
	public void Devolucion()
	{
		this.ubicacion = Ubicacion.BIBLIOTECA;
	}
	
	public String toString()
	{
		StringBuffer strBuf = new StringBuffer();
		/*if(this.ubicacion == Ubicacion.BIBLIOTECA)
		{
			return "El libro " + this.nombre + " esta disponible en Biblioteca. El ultimo en retirarlo fue el alumno: " + this.alumnoResponsable;
		}
		else
		{
			return "El libro " + this.nombre + " NO esta disponible en Biblioteca. Lo tiene actualmente el alumno: " + this.alumnoResponsable;
		}*/
		if(this.ubicacion == Ubicacion.BIBLIOTECA)
		{
			strBuf.append("El libro esta disponible en BIblioteca.");
			if (!this.alumnoResponsable.isEmpty())
			{
				strBuf.append("El ultimo en retirarlo fue el alumno ");
				strBuf.append(this.alumnoResponsable);
			}
			else
			{
				strBuf.append("El libro NO esta disponible en Biblioteca. Lo tiene ");
				strBuf.append(this.alumnoResponsable);
			}
			
		}
		return strBuf.toString();
		
	}

}

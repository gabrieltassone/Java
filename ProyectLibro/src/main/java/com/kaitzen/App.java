package com.kaitzen;


public class App 
{
    public static void main( String[] args )
    {
    	Libro libro1 = new Libro();
    	Libro libro2 = new Libro("Falso 9", "Horacio Pagani", "La dinamica de lo impensado");
    	
        System.out.println(libro2.getNombre());
        System.out.println(libro2.getAutor());
        System.out.println(libro2.getEditorial());
        System.out.println(libro1.getAutor());
        
        libro2.Prestamo("Gabriel Tassone");
        
        System.out.println(libro2.toString());
        
        System.out.println(libro1);
        System.out.println(libro2);
        libro1.Prestamo("Fede");
        libro2.Prestamo("Agu");
        System.out.println(libro1);
        System.out.println(libro2);
    }
}

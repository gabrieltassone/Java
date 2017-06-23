package com.kaitzen;

public class App 
{
    public static void main( String[] args )
    {
    	Cuenta cuenta = new Cuenta("Gabriel",1000.0);
    	System.out.println(cuenta.toString());
    	
    	Cuenta cuenta2 = new Cuenta(cuenta);
    	System.out.println(cuenta2);   	
    	
    	cuenta.ingreso(1000.0);
    	cuenta.reintegro(500.0);
    	cuenta.transferencia(20000.0);
    	

    }
}

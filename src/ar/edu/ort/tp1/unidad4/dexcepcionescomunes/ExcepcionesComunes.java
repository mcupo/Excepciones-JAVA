package ar.edu.ort.tp1.unidad4.dexcepcionescomunes;

public class ExcepcionesComunes {

/*    
Como podremos comprobar al ejecutar se generar� el siguiente error:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -3
	at ar.edu.ort.parte2.ExcepcionesComunes.main(ExcepcionesComunes.java:7)
	 
Esta excepci�n en particular se lanza cuando intentamos acceder 
a una posici�n de un array y no existe dicha posici�n.
*/
	public static void main1(String arg[]){
        int [] array = new int[20];
        array[-3] = 24;	
    }

/*
Vamos a gestionar esta interrupci�n mediante un bloque try/catch, 
con el siguiente c�digo:
*/
    public static void main2(String arg[]){
        int [] array = new int[20];
        try{
	         array[-3] = 24;	
        }
        catch(ArrayIndexOutOfBoundsException excepcion){
	         System.out.println(" Error de �ndice en un array");
        }
    }

//Intentemos provocar tambien un error de tipo divisi�n por cero y pongamos un catch espec�fico para dicho error 
  public static void main3(String arg[]){
        int [] array = new int[20];
        try{
       	 array[-3] = 24;	
	         int b = 0;
	         //int a = 23/b;
        }
        catch(ArrayIndexOutOfBoundsException excepcion){
	         System.out.println(" Error de �ndice en un array");
        }
        catch(ArithmeticException excepcion){
	         System.out.println(" Error division por cero ");
        }

    }
  
/*     
Los tipos de error que se generan son clases, que heredan de la clase java.lang.Exception, por lo tanto 
podr�amos crear nuestro propios errores personalizados. Al igual que podr�amos tener un solo catch que capture 
todos los errores, independientemente del tipo del error.

Agreguemos el siguiente c�digo:
*/
  public static void main(String arg[]){
        int [] array = new int[20];
        try{
       	//array[-3] = 24;
			int b = 0;
        	int a = 23/b;
	        String s = null;       
	        //s.equals("QQQQ");
        }
        catch(ArrayIndexOutOfBoundsException excepcion){
	         System.out.println(" Error de �ndice en un array");
        }
        catch(ArithmeticException excepcion){
	         System.out.println(" Error division por cero "); 
	     }
        catch(Exception excepcion){
	         System.out.println("Se ha generado un error que no es de �ndices, ni Aritm�tico");
	         //Al transformar un objeto que herede de Exception a un String el resultado es el nombre de la excepci�n.
	         System.out.println("El objeto error es de tipo " + excepcion.toString());
        }
    }
/*      
Podemos comprobar que el catch que captura el error es el correspondiente a la clase base Exception, 
el orden de selecci�n del catch es desde arriba a abajo, se comprueba el tipo del error con el del argumento del primer catch, 
luego con el del segundo, Hasta que uno de los catch tenga el mismo tipo y pueda gestionarlo. Por ello el catch de la clase base debe 
ser el �ltimo, y los de las clases derivadas deben de estar antes.
*/
	
}

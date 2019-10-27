package ar.edu.ort.tp1.unidad4.dexcepcionescomunes;

public class ExcepcionesComunes {

/*    
Como podremos comprobar al ejecutar se generará el siguiente error:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -3
	at ar.edu.ort.parte2.ExcepcionesComunes.main(ExcepcionesComunes.java:7)
	 
Esta excepción en particular se lanza cuando intentamos acceder 
a una posición de un array y no existe dicha posición.
*/
	public static void main1(String arg[]){
        int [] array = new int[20];
        array[-3] = 24;	
    }

/*
Vamos a gestionar esta interrupción mediante un bloque try/catch, 
con el siguiente código:
*/
    public static void main2(String arg[]){
        int [] array = new int[20];
        try{
	         array[-3] = 24;	
        }
        catch(ArrayIndexOutOfBoundsException excepcion){
	         System.out.println(" Error de índice en un array");
        }
    }

//Intentemos provocar tambien un error de tipo división por cero y pongamos un catch específico para dicho error 
  public static void main3(String arg[]){
        int [] array = new int[20];
        try{
       	 array[-3] = 24;	
	         int b = 0;
	         //int a = 23/b;
        }
        catch(ArrayIndexOutOfBoundsException excepcion){
	         System.out.println(" Error de índice en un array");
        }
        catch(ArithmeticException excepcion){
	         System.out.println(" Error division por cero ");
        }

    }
  
/*     
Los tipos de error que se generan son clases, que heredan de la clase java.lang.Exception, por lo tanto 
podríamos crear nuestro propios errores personalizados. Al igual que podríamos tener un solo catch que capture 
todos los errores, independientemente del tipo del error.

Agreguemos el siguiente código:
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
	         System.out.println(" Error de índice en un array");
        }
        catch(ArithmeticException excepcion){
	         System.out.println(" Error division por cero "); 
	     }
        catch(Exception excepcion){
	         System.out.println("Se ha generado un error que no es de índices, ni Aritmético");
	         //Al transformar un objeto que herede de Exception a un String el resultado es el nombre de la excepción.
	         System.out.println("El objeto error es de tipo " + excepcion.toString());
        }
    }
/*      
Podemos comprobar que el catch que captura el error es el correspondiente a la clase base Exception, 
el orden de selección del catch es desde arriba a abajo, se comprueba el tipo del error con el del argumento del primer catch, 
luego con el del segundo, Hasta que uno de los catch tenga el mismo tipo y pueda gestionarlo. Por ello el catch de la clase base debe 
ser el último, y los de las clases derivadas deben de estar antes.
*/
	
}

package ar.edu.ort.tp1.unidad4.dexcepcionescomunes;

public class NumberFormat {

    public static void main(String args[]) 
    { 
        try { 
            int num = Integer.parseInt ("texto"); 
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println("Number format exception"); 
        } 
    } 	
}
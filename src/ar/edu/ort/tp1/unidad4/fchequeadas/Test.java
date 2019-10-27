package ar.edu.ort.tp1.unidad4.fchequeadas;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
	private FileReader in;
	
	public Test (String filename) {
		try {
			in=new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}